package sec03;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("추상메소드 turnOn() 구현");
			}
			public void turnOff() {
				System.out.println("추상메소드 turnOff() 구현");
			}
			public void setVolume(int volume) {
				System.out.println("추상메소드 setVolume() 구현" + volume);
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(true);
	}

}
