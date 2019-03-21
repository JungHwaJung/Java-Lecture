package sec03;

public class Customer extends Member{
	String name;
	long call;
	String address;
	
	public Customer(int num, int miles, String name, long call, String address) {
		super(num, miles);
		this.name = name;
		this.call = call;
		this.address = address;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + call);
		System.out.println("주소 : " + address);
	}
	
	
}
