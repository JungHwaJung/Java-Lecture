package sec13.exam03.package2;

import sec13.exam03.package1.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 2;		default 필드 접근 불가
		//a.field3 = 3;		private 필드 접근 불가
		
		a.method1();
		//a.method2();		default 필드 접근 불가
		//a.method3();		private 필드 접근 불가
	}
}
