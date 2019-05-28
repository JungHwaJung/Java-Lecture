package ch3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlusMinusImage extends JFrame {
	public PlusMinusImage() {
		super("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel5());
		setSize(500, 400);
		setVisible(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel5 extends JPanel {
		ImageIcon icon = new ImageIcon("images/Tulips.jpg");
		Image img = icon.getImage();
		int width;
		int height;
		
		public MyPanel5() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						width = (int)(width*1.1);
						height = (int)(height*1.1);
						repaint();
					} else if (e.getKeyChar() == '-') {
						width = (int)(width*0.9);
						height = (int)(height*0.9);
						repaint();
					}
				}
			});
		}
		public void paintComponent(Graphics g) {	//먼저 실행
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
	}

	public static void main(String[] args) {
		new PlusMinusImage();

	}

}
