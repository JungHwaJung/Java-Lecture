package sec05;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatePrintThread statePringThread = new StatePrintThread(new TargetThread());
		statePringThread.start();
	}

}
