package sec03;

public class Member {
	public String name;
	public int age;
	public String tel;

	public Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.tel == tel);
			//return member.name.equals(name)
		} else 
			return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + tel.hashCode();
		//return tel.hashCode();
	}
}
