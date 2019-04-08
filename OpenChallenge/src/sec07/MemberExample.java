package sec07;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("김자바", "javakim", "javakim", 29);
		Member m2 = new Member("박인터", "javakim", "park", 21);
		Member m3 = new Member("이라라", "lala", "lalalee", 31);
		Member m4 = new Member("한마이", "javakim", "javakim", 29);
		
		System.out.println(m1.compareTo(m2));
		System.out.println(m2.compareTo(m3));
		System.out.println(m3.compareTo(m4));
		System.out.println(m1.compareTo(m4));
	}

}
