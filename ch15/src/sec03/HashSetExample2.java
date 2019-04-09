package sec03;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30, "010-123-4567"));
		set.add(new Member("홍길동", 30, "010-123-4567"));	
		
		System.out.println("총 객체 수 : " + set.size());
	}

}
