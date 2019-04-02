package jungol;

import java.util.Scanner;

public class Main131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(n <= 100 && m <= 100 && n > m) {
			for(int i=m; i<=n; i++) {
				System.out.print(i + " ");
			}
		} else if (n <= 100 && m <= 100 && n < m) {
			for(int i=n; i<=m; i++) {
				System.out.print(i + " ");
			}
		} else
			return;
	}
}
