package ch3;

import javax.swing.*;
import java.awt.*;

public class SnowManFace extends JFrame {
	public SnowManFace() {
		setTitle("눈사람 얼굴");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		setVisible(true);
		add(new MyPanel());
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.black);
			g.drawArc(60, 80, 50, 50, 180, -180);
			g.drawArc(150, 80, 50, 50, 180, -180);
			g.drawArc(70, 130, 100, 70, 180, 180);
		}
	}
	

	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();

	}
}
