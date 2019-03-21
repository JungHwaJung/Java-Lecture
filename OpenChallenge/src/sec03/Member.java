package sec03;

public class Member {
	int num;
	int miles;
	
	public Member(int num, int miles) {
		this.num = num;
		this.miles = miles;
	}
	
	public void show() {
		System.out.println("고객번호 : " + num);
		System.out.println("마일리지 : " + miles);
	}
}
