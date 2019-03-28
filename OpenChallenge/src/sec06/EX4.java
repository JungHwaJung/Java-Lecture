package sec06;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		long sq = 0;
		long sum1 = 0;
		long sum2 = 0;
		
		for(int i=1; i<=num; i++) {
			sq += i*i;
		}
		for(int i=1; i<=num; i++) {
			sum1 += i;
		}
		sum2 = sum1*sum1;
		
		System.out.println("차이 : " + (sum2 - sq));
		sc.close();
	}

}
