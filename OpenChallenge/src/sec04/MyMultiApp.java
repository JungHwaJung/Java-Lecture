package sec04;

public class MyMultiApp {

	public static void main(String[] args) {
		MyMultiImpl multi = new MyMultiImpl();
		int[] array = { 1, 2, 3, 4, 5 };
		
		multi.max(array);
		System.out.println("Max : " + multi.max(array));
		multi.min(array);
		System.out.println("Min : " + multi.min(array));
		multi.sum(array);
		System.out.println("Sum : " + multi.sum(array));
		multi.avg(array);
		System.out.println("Avg : " + multi.avg(array));
	}

}
