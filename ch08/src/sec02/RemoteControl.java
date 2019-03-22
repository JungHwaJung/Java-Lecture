package sec02;

public interface RemoteControl {
	//상수 필드
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public abstract void setVolume(int volume);
	
	//디폴트 메소드
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
