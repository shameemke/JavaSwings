package sampleswing;
import java.awt.event.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class checkbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public checkbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(48, 55, 39, 23);
		frame.getContentPane().add(checkBox);
		
		JLabel lblC = new JLabel("C++");
		lblC.setBounds(93, 55, 79, 23);
		frame.getContentPane().add(lblC);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(48, 97, 39, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblJava = new JLabel("JAVA");
		lblJava.setBounds(93, 106, 46, 14);
		frame.getContentPane().add(lblJava);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(69, 177, 324, 33);
		frame.getContentPane().add(lblNewLabel);
		checkBox.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				lblNewLabel.setText("C++" +(e.getStateChange()==1? "checked": "unchecked"));
			}
		});
		chckbxNewCheckBox.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				lblNewLabel.setText("JAVA" + (e.getStateChange()==1?  "checked": "unchecked"));
			}
		});
		
	}
}
