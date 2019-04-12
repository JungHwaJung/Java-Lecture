package sec09;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HexaDump {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 파일명 : ");
		String file = sc.nextLine();
		
		byte[] b = new byte[16];
		int offset = 0;
		int len;
		
		DataInputStream in = new DataInputStream(new FileInputStream(file));
		
		while((len = in.read(b)) > 0) {
			System.out.format("%08X: ", offset);
			for(int i=0; i<len; i++) {
				System.out.format("%02X ", b[i]);
				if(i == 7) System.out.print(" ");
			}
			if (len != 16) {
				for (int i =len; i<16; i++) {
					System.out.print("   ");
					if(i == 7) System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int i=0; i<len; i++) {
		        if (b[i] >= 0x20 && b[i] <= 0x7E) 
		        	System.out.print((char)b[i]);
		        else System.out.print(".");
		        if (i==7) System.out.print(" ");
		      }
			offset += 16;
			System.out.println();
		}
		in.close(); sc.close(); 
	}
	
}
