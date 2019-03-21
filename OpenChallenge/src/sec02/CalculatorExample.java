package sec02;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산자 : ");
		String opCode = scanner.nextLine();
		System.out.println("첫번째 피연산자");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.println("두번째 피연산자");
		int b = Integer.parseInt(scanner.nextLine());
		
		switch(opCode) {
		
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println("결과 : " + add.calculator());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println("결과 : " + sub.calculator());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println("결과 : " + mul.calculator());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println("결과 : " + div.calculator());
			break;
		default :
			System.out.println("+, -, *, / 중 하나만 입력하세요/");		
		}
	
		scanner.close();
	}
}
