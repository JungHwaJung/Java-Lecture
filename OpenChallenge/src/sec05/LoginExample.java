package sec05;

import java.util.Scanner;

public class LoginExample {

	static String[] loginIds = {"abcde", "fghij", "klnmo", "pqrst", "uvwxyz"};
	static String[] passwords = {"abcde12", "fghij12", "klnmo12", "pqrst12", "uvwxyz12"};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String loginid = scan.nextLine();
		System.out.print("PASSWORD : ");
		String password = scan.nextLine();
		scan.close();
		
		try {
			if (checkLoginPassword(loginid, password))
				System.out.println("로그인 성공");
		} catch(InvalidLoginIdException | IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	static boolean checkLoginPassword(String loginid, String password)
			throws InvalidLoginIdException, IncorrectPasswordException {
		int index = -1;
		for(int i=0; i<loginIds.length; i++) {
			if(loginIds[i].equals(loginid)) {
				index = i;
				break;
			} 
		}
		if (index < 0)
			throw new InvalidLoginIdException("로그인 아이디가 없습니다.");
		if (passwords[index].equals(password))
			return true;
		else
			throw new IncorrectPasswordException("패스워드를 잘못 입력하였습니다.");
	}	
		
}
