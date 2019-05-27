import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	Container contentPane;
	RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon appleIcon = new ImageIcon("images/apple.png");
		ImageIcon selectedAppleIcon = new ImageIcon("images/selectedApple.png");
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton cherry = new JRadioButton("체리");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton apple = new JRadioButton("사과", appleIcon);
		apple.setBorderPainted(true);
		apple.setSelectedIcon(selectedAppleIcon);
		g.add(cherry);
		g.add(pear);
		g.add(apple);
		
		contentPane.add(cherry);
		contentPane.add(pear);
		contentPane.add(apple);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();

	}

}
