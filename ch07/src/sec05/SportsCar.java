package sec05;

public class SportsCar extends Car{

	@Override 
		public void speedUp() { speed += 10; }
	
	
	//final 때문에 오버라이딩을 할 수 없음
	
	/*@Override
		public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}*/
	
}
