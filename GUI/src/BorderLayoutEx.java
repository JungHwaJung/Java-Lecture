
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	BorderLayoutEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		c.add(new JButton("OK"), BorderLayout.NORTH);
		c.add(new JButton("Cancel"), BorderLayout.SOUTH);
		c.add(new JButton("Ignore"), BorderLayout.EAST);
		c.add(new JButton("add"), BorderLayout.WEST);
		c.add(new JButton("sub"), BorderLayout.CENTER);
		
		
		setSize(350, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
