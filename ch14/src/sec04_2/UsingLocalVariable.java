package sec04_2;

public class UsingLocalVariable {
	void method(int arg) {
		int localVal = 40; 		//arg localVal은 final특성을 가짐
		
		//arg = 31;
		//localVar = 41;		final 특성 때문에 수정 불가
		
		//람다식
		MyFunctionalInterface fi = () -> {
			//로컬변수 읽기
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVal + "\n");
		};
		fi.method();
	}
}
