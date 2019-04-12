package sec09;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Grep {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 문자열 : ");
		String str = sc.nextLine();
		System.out.print("찾을 파일명 : ");
		String file = sc.nextLine();
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int rowNum = 0;
		String rowData = "";
		while((rowData = br.readLine()) != null) {
			rowNum++;
			if(rowData.indexOf(str) != -1) {
				System.out.println(rowNum + ". " + rowData);
			}
		}
		sc.close(); fr.close(); br.close();
	}
}
