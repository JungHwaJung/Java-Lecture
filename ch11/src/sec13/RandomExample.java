package sec13;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("선택번호 : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningtNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨번호 : ");
		for(int i=0; i<6; i++) {
			winningtNumber[i] = random.nextInt(45) + 1;
			System.out.println(winningtNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningtNumber);
		boolean result = Arrays.equals(selectNumber, winningtNumber);
		System.out.print("당첨여부 : ");
		if(result) {
			System.out.println("1등에 당첨되었습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
