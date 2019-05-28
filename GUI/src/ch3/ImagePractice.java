package ch3;
import javax.swing.*;
import java.awt.*;

public class ImagePractice extends JFrame {
	public ImagePractice() {
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/Tulips.jpg");
		Image img = icon.getImage();
		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		public void paintComponent(Graphics g) {	//먼저 실행
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		}
	}
	

	public static void main(String[] args) {
		new ImagePractice();
	}

}
