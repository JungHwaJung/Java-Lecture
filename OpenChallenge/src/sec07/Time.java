package sec07;


import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 시각(hh:mm:ss)> ");
		String currentTime = sc.nextLine();
		int hour = Integer.parseInt(currentTime.substring(0, 2));
		int minute = Integer.parseInt(currentTime.substring(3, 5));
		int second = Integer.parseInt(currentTime.substring(6));
		int now = hour * 60 * 60 + minute * 60 + second;
		
		System.out.println("퇴근시간 = 18:30:00");
		int off = 18 * 60 * 60 + 30 * 60;
		int remain = off - now;
		second = remain % 60;
		remain /= 60;
		minute = remain % 60;
		hour = remain / 60;
		System.out.println("퇴근까지 남은 시간 = " + hour + ":" + minute + ":" + second);
		
		sc.close();
	}

}
