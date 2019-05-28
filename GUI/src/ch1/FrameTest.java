package ch1;

import javax.swing.*;

public class FrameTest extends JFrame {
	
	public FrameTest() {
		setTitle("정화의 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//백그라운드도 close
		setSize(300, 500);
		setLocation(200, 300);
		setResizable(false); 	//화면크기 고정
		setVisible(true);
		
	}

	public static void main(String[] args) {
		//JFrame jf = new JFrame(/* "정화의 창" */);
		new FrameTest();
	
	}
	

}
