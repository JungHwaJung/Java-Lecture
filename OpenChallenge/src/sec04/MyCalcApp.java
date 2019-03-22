package sec04;

import java.util.Scanner;

public class MyCalcApp {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		MyCalc calc = new MyCalc();
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.더하기 | 2.빼기 | 3.곱하기 | 4.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(scan.nextLine());
		
			if(selectNo == 1) {
				System.out.print("첫번째 숫자를 입력하세요. > ");
				int a = Integer.parseInt( scan.nextLine());
				System.out.print("두번째 숫자를 입력하세요. > ");
				int b = Integer.parseInt( scan.nextLine());
				System.out.print("결과 > ");
				calc.add(a, b);
			} else if(selectNo == 2) {
				System.out.print("첫번째 숫자를 입력하세요. > ");
				int a = Integer.parseInt( scan.nextLine());
				System.out.print("두번째 숫자를 입력하세요. > ");
				int b = Integer.parseInt( scan.nextLine());
				System.out.print("결과 > ");
				calc.substract(a, b);
			} else if(selectNo == 3) {
				System.out.print("첫번째 숫자를 입력하세요. > ");
				int a = Integer.parseInt( scan.nextLine());
				System.out.print("두번째 숫자를 입력하세요. > ");
				int b = Integer.parseInt( scan.nextLine());
				System.out.print("결과 > ");
				calc.multiply(a, b);
			} else if(selectNo == 4) {
				run = false;
				System.out.println("프로그램 종료");
			}
		
		}
		scan.close();
	}

}
