package jungol;

import java.util.Scanner;

public class Main135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double sum = 0;
		double count = 0;
		if(n > m) {
			for(int i=m; i<=n; i++) {
				if(i % 3 == 0 || i % 5 == 0) {
					sum += i;
					count++;
				}
			}
			System.out.println("sum : " + (int)sum);
			System.out.printf("avg : %.1f\n", (sum/count));
		} else if(n <m ) {
			for(int i=n; i<=m; i++) {
				if(i % 3 == 0 || i % 5 == 0) {
					sum += i;
					count++;
				}
			}
			System.out.println("sum : " + (int)sum);
			System.out.printf("avg : %.1f\n", (sum/count));
		}
		sc.close();
	}
}
