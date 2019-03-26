package sec07;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-2234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
