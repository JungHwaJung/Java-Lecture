package ch1;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	Container contentPane;
	ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/Tulips.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/Hydrangeas.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/Koala.jpg");
		
		JButton btn = new JButton("flower~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(200, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImageEx();

	}

}
