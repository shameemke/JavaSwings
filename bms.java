package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bms {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bms window = new bms();
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
	public bms() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 434, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(217, 5, 0, 0);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("           Body Mass Index\r\n");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(99, 16, 232, 23);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 205, 50));
		panel_1.setBounds(0, 67, 434, 136);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeight = new JLabel("   Height(m)");
		lblHeight.setForeground(new Color(0, 0, 205));
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHeight.setBounds(10, 0, 80, 21);
		panel_1.add(lblHeight);
		
		textField = new JTextField();
		textField.setBounds(99, 1, 244, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblWeight = new JLabel("Weight(kg)");
		lblWeight.setForeground(new Color(0, 0, 205));
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWeight.setBounds(20, 32, 70, 14);
		panel_1.add(lblWeight);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 32, 244, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("    BMI");
		lblBmi.setForeground(Color.BLACK);
		lblBmi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBmi.setBounds(23, 68, 46, 14);
		panel_1.add(lblBmi);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.YELLOW);
		textField_2.setBounds(98, 66, 99, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 165, 0));
		lblNewLabel_1.setBounds(207, 69, 217, 13);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String height = textField.getText();
				String weight = textField_1.getText();
				float h=Float.parseFloat(textField.getText());
				float w=Float.parseFloat(textField_1.getText());
				float bmi=(w/(h*h));
				String str=String.valueOf(bmi);
				textField_2.setText(str);
				if(bmi<18.5)
				{
					lblNewLabel_1.setText("Under Weight");
				}
				else if(bmi>18.5&&bmi<24.9)
				{
					lblNewLabel_1.setText("Normal Weight");
				}
				else if(bmi>25&&bmi<29.9)
				{
					lblNewLabel_1.setText("Over Weight");
				}
				if(bmi>30)
				{
					lblNewLabel_1.setText("Obese");
				}
				
				
			}
		});
		btnNewButton.setBounds(29, 113, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_1.setBounds(175, 113, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(323, 113, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setBounds(0, 207, 434, 55);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(173, 255, 47));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Under Weight", "Normal Weight", "Over Weight", "Obese"},
				{"<18.5", "18.5 to 24.9", "25 to 29.9", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 414, 33);
		panel_2.add(table);
	}
}
