package jungol;

import java.util.Scanner;

public class Main136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.print(n*i + " ");
		}
		sc.close();
	}
}
