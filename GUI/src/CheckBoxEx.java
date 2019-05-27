import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	Container contentPane;
	CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon appleIcon = new ImageIcon("images/apple.png");
		ImageIcon selectedAppleIcon = new ImageIcon("images/selectedApple.png");
		
		JCheckBox cherry = new JCheckBox("체리");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox apple = new JCheckBox("사과", appleIcon);
		apple.setBorderPainted(true);
		apple.setSelectedIcon(selectedAppleIcon);
		
		contentPane.add(cherry);
		contentPane.add(pear);
		contentPane.add(apple);
		
		setSize(200, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
