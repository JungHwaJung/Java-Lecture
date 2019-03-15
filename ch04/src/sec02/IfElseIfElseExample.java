package sec02;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요. >");
		//int score = scan.nextInt();		--1
		//String line = scan.nextLine();	--2
		int score = Integer.parseInt(scan.nextLine());
		
		if( score >= 90 ) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은 A 입니다.");
		} else if( score >= 80 ){
			System.out.println("점수가 80~90 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if( score >= 70 ){
			System.out.println("점수가 70~80 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
		scan.close();
	}
}
