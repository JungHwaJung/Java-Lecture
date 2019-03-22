package sec04;

public class MyCalc implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	public void substract(int a, int b) {
		System.out.println(a-b);
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
}
