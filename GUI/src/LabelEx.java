
import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	
	Container contentPane;
	LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("튤립");
		ImageIcon beauty = new ImageIcon("images/Tulips.jpg");
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("images/Hydrangeas.jpg");
		JLabel label = new JLabel("수국입니다.", normalIcon, SwingConstants.CENTER);
		
		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new LabelEx();

	}

}
