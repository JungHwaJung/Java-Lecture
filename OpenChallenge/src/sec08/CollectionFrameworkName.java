package sec08;

import java.util.TreeSet;

public class CollectionFrameworkName {

	public static void main(String[] args) {
		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		String[] name = str.split(",");
		
		TreeSet<String> nameSet = new TreeSet<String>();
		int leec = 0, kimc = 0;
		int jy = 0;
		
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
			nameSet.add(name[i]);
		}
		System.out.println("중복을 포함한 이씨 수 : " + leec);
		System.out.println("중복을 포함한 김씨 수 : " + kimc);
		System.out.println("이재영 이름 중복 수 : " + jy);
		System.out.print("중복을 제거하고 오름차순한 명단 : ");
		for(String names : nameSet) 
			System.out.print(names + " ");
	}

}
