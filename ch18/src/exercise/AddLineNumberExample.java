package exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "D:/workspace/EGcv/Java/ch18/src/sec05/BufferedInputStreamExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNum = 0;
		String rowData;
		while((rowData = br.readLine()) != null ) {
			System.out.println(++rowNum + " : " + rowData);
		}
		fr.close(); br.close();
	}

}
