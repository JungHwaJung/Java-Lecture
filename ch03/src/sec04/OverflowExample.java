package sec04;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);		//int값의 범위를 초과함
		
		long lx = 1000000;
		int ly = 1000000;
		long lz = lx * ly;
		System.out.println(lz);
	}

}
