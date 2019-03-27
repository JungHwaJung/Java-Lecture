package exercise;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
	}

}
