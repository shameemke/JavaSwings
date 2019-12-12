package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingsfarad {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingsfarad window = new swingsfarad();
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
	public swingsfarad() {
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
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setBounds(42, 54, 65, 24);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(117, 56, 133, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(97, 95, 175, 30);
		frame.getContentPane().add(label_1);
		
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Degrees=textField.getText();
                int f=Integer.parseInt(Degrees);
                float t2=(float)(5*f-160)/9;
                String s1=String.valueOf(t2);
                label_1.setText("Result = "+s1);
			}
		});
		btnToCelsius.setBounds(54, 154, 89, 23);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFrahrenheit = new JButton("To frahrenheit");
		btnToFrahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Degrees=textField.getText();
                int i=Integer.parseInt(Degrees);
                float t1=(float)(9*i+160)/5;
                String s2=String.valueOf(t1);
                label_1.setText("Result = "+s2);
			}
		});
		btnToFrahrenheit.setBounds(215, 154, 89, 23);
		frame.getContentPane().add(btnToFrahrenheit);
		
	
	}

}
