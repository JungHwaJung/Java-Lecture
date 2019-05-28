package ch3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ImageDragging extends JFrame {
	public ImageDragging() {
		super("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel4());
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel4 extends JPanel {
		ImageIcon icon = new ImageIcon("images/Tulips.jpg");
		Image img = icon.getImage();
		int ovalX = 100, ovalY = 100;
		public MyPanel4() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {	//먼저 실행
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.BLACK);
			g.fillOval(ovalY, ovalY, 20, 20);

		}
	}

	public static void main(String[] args) {
		new ImageDragging();

	}

}
