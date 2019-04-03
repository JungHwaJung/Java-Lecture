package exercise;


public class MemberTest {

	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		
		
		MemberDTO members = mDao.selectOne(100001);
		members.setPassword("5678");
		mDao.updateMember(members);
		System.out.println(members.toString());
	}

}
