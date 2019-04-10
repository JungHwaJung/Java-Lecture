package sec08;

import java.util.Arrays;

public class NameExample {

	public static void main(String[] args) {
		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		String[] name = str.split(",");
		int leec = 0, kimc = 0;
		int jy = 0;
		String result1 = "";
		
		for(int i=0; i<name.length; i++) {
			if(String.valueOf(name[i].charAt(0)).equals("이")) {
				leec++;
			}
			if(String.valueOf(name[i].charAt(0)).equals("김")) {
				kimc++;
			}
			if(String.valueOf(name[i]).equals("이재영")) {
				jy++;
			}
			if(!result1.contains(String.valueOf(name[i]))) {
				result1 += String.valueOf(name[i] + ",");
			}
			
		}
		System.out.println("중복을 포함한 이씨 수 : " + leec);
		System.out.println("중복을 포함한 김씨 수 : " + kimc);
		System.out.println("이재영 이름 중복 수 : " + jy);
		System.out.println("중복을 제거한 이름명단 : " + result1);
		
		String[] result2 = result1.split(","); 
		Arrays.sort(result2);
		System.out.print("중복을 제거한 이름명단(오름차순) : ");
		System.out.println(Arrays.toString(result2));
	}

}
