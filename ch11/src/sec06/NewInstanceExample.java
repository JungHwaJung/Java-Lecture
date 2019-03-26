package sec06;

public class NewInstanceExample {

	public static void main(String[] args) {
		Class clazz = null;
		long time = System.currentTimeMillis();
		try {
			if (time % 2 == 0)
				clazz = Class.forName("sec06.SendAction");
			else
				clazz = Class.forName("sec06.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
