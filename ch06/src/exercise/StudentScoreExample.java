package exercise;

import java.util.Scanner;

public class StudentScoreExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 > ");
		String name = scanner.nextLine();
		System.out.print("수학 점수 > ");
		int mat = Integer.parseInt(scanner.nextLine());
		System.out.print("영어 점수 > ");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.print("과학 점수 > ");
		int sci = Integer.parseInt(scanner.nextLine());
		
		StudentScore score = new StudentScore(name, mat, eng, sci);
		
		double dummy = score.average();		// dummy를 써야 return값이 받아짐.
		System.out.printf("평균(둘째자리까지) : %.2f\n", dummy);	// C언어.
		
		System.out.println(score.toString());
		
		
		
		scanner.close();
	}
	
}
