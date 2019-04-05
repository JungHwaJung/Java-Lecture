package sec04;

import sec02_1.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
