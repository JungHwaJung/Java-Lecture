package sec07;

public class ChildInterfaceExample {

	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {System.out.println("안녕");}
			@Override
			public void method3() {System.out.println("안녕하세요");}
			
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {System.out.println("안녕못해");}
			@Override
			public void method3() {System.out.println("배고파");}
			
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {System.out.println("가나다라");}
			@Override
			public void method2() {System.out.println("마바사아");}
			@Override
			public void method3() {System.out.println("자차카타");}
			
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
	}

}
