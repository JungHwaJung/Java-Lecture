package sec07;

import java.util.Scanner;

public class DartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point;
		String bonus;
		String option;
		int firstPoint = 0;
		int secondPoint = 0;
		int thirdPoint = 0;
		int score = 0;
		String result1 = " ";
		String result2 = " ";
		String result3 = " ";
		String total = " ";
		for(int i=1; i<=3; i++) {
			switch(i) {
			case 1 :
				while(true) {
					System.out.print("첫 번째 점수 입력 > ");
					point = Integer.parseInt(sc.nextLine());
					if(point < 0 || point > 10) {
						System.out.println("0~10점만 입력할 수 있습니다.");
					} else {
						break;
					}
				}
				while(true) {
					System.out.print("S, D, T 중 하나를 적으세요 > ");
					bonus = sc.nextLine();
					if(!(bonus.equals("S") || bonus.equals("D") || bonus.equals("T"))) {
						System.out.print("S, D, T 중 하나를 고르세요 > ");
					} else {
						break;
					}
				}
				if(bonus.equals("S")) {
					firstPoint = point;
				} else if(bonus.equals("D")) {
					firstPoint = point * point;
				} else if(bonus.equals("T")) {
					firstPoint = point * point * point;
				} 
				
				while(true) {
					System.out.print("옵션을 적으세요 > ");
					option = sc.nextLine();
					if(!(option.equals("*") || option.equals("#") || option.equals(" "))) {
						System.out.print("*, #, 빈칸 중 하나를 고르세요 ");
					} else {
						break;
					}
				}
				
				if(option.equals("*")) {
					firstPoint = firstPoint * 2;
				} else if(option.equals("#")) {
					firstPoint = firstPoint * -1;
				} else 
					result1 = point + bonus + option;
				break;
				
			case 2 :
				while(true) {
					System.out.print("두 번째 점수 입력 > ");
					point = Integer.parseInt(sc.nextLine());
					if(point < 0 && point > 10) {
						System.out.println("0~10점만 입력할 수 있습니다.");
					} else {
						break;
					}
				}
				while(true) {
					System.out.print("S, D, T 중 하나를 적으세요 > ");
					bonus = sc.nextLine();
					if(!(bonus.equals("S") || bonus.equals("D") || bonus.equals("T"))) {
						System.out.println("S, D, T 중 하나를 고르세요 > ");
					} else {
						break;
					}
				}
				if(bonus.equals("S")) {
					secondPoint = point;
				} else if(bonus.equals("D")) {
					secondPoint = point * point;
				} else if(bonus.equals("T")) {
					secondPoint = point * point * point;
				} 
				
				while(true) {
					System.out.print("옵션을 적으세요 > ");
					option = sc.nextLine();
					if(!(option.equals("*") || option.equals("#") || option.equals(" "))) {
						System.out.print("*, #, 빈칸 중 하나를 고르세요 ");
					} else {
						break;
					}
				}

				if(option.equals("*")) {
					secondPoint = secondPoint * 2;
				} else if(option.equals("#")) {
					secondPoint = secondPoint * -1;
				} else
					result2 = point + bonus + option;
				break;
				
				
			case 3 :
				while(true) {
					System.out.print("세 번째 점수 입력 > ");
					point = Integer.parseInt(sc.nextLine());
					if(point < 0 && point > 10) {
						System.out.println("0~10점만 입력할 수 있습니다.");
					} else {
						break;
					}
				}
				while(true) {
					System.out.print("S, D, T 중 하나를 적으세요 > ");
					bonus = sc.nextLine();
					if(!(bonus.equals("S") || bonus.equals("D") || bonus.equals("T"))) {
						System.out.println("S, D, T 중 하나를 고르세요 > ");
					} else {
						break;
					}
				}
				if(bonus.equals("S")) {
					thirdPoint = point;
				} else if(bonus.equals("D")) {
					thirdPoint = point * point;
				} else if(bonus.equals("T")) {
					thirdPoint = point * point * point;
				} 
				
				while(true) {
					System.out.print("옵션을 적으세요 > ");
					option = sc.nextLine();
					if(!(option.equals("*") || option.equals("#") || option.equals(" "))) {
						System.out.print("*, #, 빈칸 중 하나를 고르세요 ");
					} else {
						break;
					}
				}
				
				if(option.equals("*")) {
					thirdPoint = thirdPoint * 2;
				} else if(option.equals("#")) {
					thirdPoint = thirdPoint * -1;
				} else
					result3 = point + bonus + option;
				break;	
			}
			
		}
		total = result1 + result2 + result3;
		score = firstPoint + secondPoint + thirdPoint;
		System.out.println(total + " " + score);
		sc.close();
		

	}

}
