package sec04;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/workspace/EGcv/Java/ch18/src/sec04/FileInputStreamExample.java");
			int data;
			while ( (data = fis.read() ) != -1) {
				System.out.println(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
