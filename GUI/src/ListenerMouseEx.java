import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class ListenerMouseEx extends JFrame {
	ListenerMouseEx() {
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		add(btn);
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListenerMouseEx();
	}
	
	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.BLUE);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.red);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.yellow);
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
		
	}
	
	
}
