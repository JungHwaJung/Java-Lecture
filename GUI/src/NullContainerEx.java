
import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	NullContainerEx() {
		setTitle("NullContainerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		Container e = getContentPane();
		
		c.setLayout(null);
		
		/*JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);*/
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b);
		}
		
		setSize(350, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		 new NullContainerEx();

	}

}
