package sec12;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		int value4 = Integer.valueOf("10"); 	//parse를 valueOf로 대체할 수 있다.
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		System.out.println("value4 : " + value4);
	}

}
