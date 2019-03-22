package sec05;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//vehicle.checkFare();		인터페이스에 없음
		Bus bus = new Bus();
		
		bus.run();
		bus.checkFare();
	}

}
