package ch2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxPractice extends JFrame {
	Container contentPane;
	JButton btn = new JButton("test button");
	
	CheckBoxPractice() {
		super("CheckBoxPractice Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JCheckBox a = new JCheckBox("버튼 비활성화");
		JCheckBox b = new JCheckBox("버튼 감추기");
		add(a);
		add(b);
		add(btn);
		
		a.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else 
					btn.setEnabled(true);
			}
		});
		
		b.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else 
					btn.setVisible(true);
			}
			
		});
		setSize(200, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CheckBoxPractice();

	}

}
