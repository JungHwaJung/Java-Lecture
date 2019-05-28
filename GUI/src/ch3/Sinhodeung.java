package ch3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sinhodeung extends JFrame {
	public Sinhodeung() {
		add(new MyPanel3());
		setSize(300, 500);
		setVisible(true);
	}
	
	class MyPanel3 extends JPanel implements ActionListener {
		boolean flag = false;
			private int light_number = 0;
			
			public MyPanel3() {
				setLayout(new BorderLayout());
				JButton b = new JButton("traffic light turn up");
				b.addActionListener(this);
				add(b, BorderLayout.SOUTH);
			}
			
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.BLACK);
					g.drawOval(100, 100, 100, 100);
					g.drawOval(100, 200, 100, 100);
					g.drawOval(100, 300, 100, 100);
					if(light_number == 0) {
						g.setColor(Color.RED);
						g.fillOval(100, 100, 100, 100);
					} else if(light_number == 1) {
						g.setColor(Color.yellow);
						g.fillOval(100, 200, 100, 100);
					} else {
						g.setColor(Color.green);
						g.fillOval(100, 300, 100, 100);
					}
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				if(++light_number >= 3) {
					light_number = 0;
				}
				repaint();
			}
	}

	public static void main(String[] args) {
		new Sinhodeung();

	}

}
