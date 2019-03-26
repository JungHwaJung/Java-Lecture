package sec05;

import java.util.Map;

public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : " + javaHome);
		
		for(Map.Entry entry: System.getenv().entrySet())
			System.out.println( entry.getKey() + "=" + entry.getValue() );
	}

}
