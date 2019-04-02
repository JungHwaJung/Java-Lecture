package jungol;

import java.util.Scanner;

public class Main133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double sum = 0;
		double avg = 0;
		
		if(n <= 100 && n >= 0) {
			for(int i=1; i<=n; i++) {
				int num = sc.nextInt();
				sum += num;
			}
		}
		avg = (double)(sum / n);
		System.out.printf("%.2f",avg);
		sc.close();

	}

}
