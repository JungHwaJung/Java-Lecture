package sec03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(2), "임꺽정");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		value = hashMap.get(new Key(2));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}

}
