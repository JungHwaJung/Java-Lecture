package ch1;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));	//가운데서부터 갈라지듯이 생성됨
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		
		
		setSize(350, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
