package ch3;
import javax.swing.*;

import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
	Container contentPane;
	GraphicsDrawImageEx1() {
		setTitle("DrawImage 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/image0.jpg");
		Image image = imageIcon.getImage();
		
		/*
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//System.out.println("하이"); 	콘솔창에 늘어난만큼 찍힌다.
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
			
		}*/
		/*
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20, 20, 250, 200, 100, 50, 200, 200, this);	//원하는 만큼 자르기
			
		}*/
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(50, 20, 150, 150);
			g.drawImage(image, getWidth(), getHeight(), this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif", Font.ITALIC, 40));
			g.drawString("GO GATOR!", 10, 150);
		}

		
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}

}
