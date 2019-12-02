package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cuurency {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuurency window = new cuurency();
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
	public cuurency() {
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
		
		tf1 = new JTextField();
		tf1.setBounds(159, 22, 145, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel label1 = new JLabel("   AMOUNT");
		label1.setForeground(Color.RED);
		label1.setBounds(53, 25, 65, 14);
		frame.getContentPane().add(label1);
		
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "USD", "INR", "SAR", "UAE"}));
		c1.setBounds(161, 64, 143, 20);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "USD", "INR", "SAR", "UAE"}));
		c2.setBounds(159, 113, 145, 20);
		frame.getContentPane().add(c2);
		
		JButton button1 = new JButton("Value");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double us=71.42;
				double sa=19.23;
				double ua=20.60;
				String str=tf1.getText();
				float str1=Float.parseFloat(str);
				if(c1.getSelectedItem().equals("INR"))
				{
					if(c2.getSelectedItem().equals("INR"))
					{
						tf3.setText(str);
					}
					else if(c2.getSelectedItem().equals("USD"))
					{
						double str2=(float)str1/us;
						String str3=String.valueOf(str2);
					    tf3.setText(str3);
					}
					else if (c2.getSelectedItem().equals("SAR"))
				{
				double str4=str1/sa;
				String str5=String.valueOf(str4);
				 tf3.setText(str5);
				}
					else if(c2.getSelectedItem().equals("UAE"))
					{
						double str6=str1/ua;
						String str7=String.valueOf(str6);
						tf3.setText(str7);
					}
				}
				else if(c1.getSelectedItem().equals("USD"))
				{
					if(c2.getSelectedItem().equals("INR"))
					{
						double str8=(float)str1*us;
						String str9=String.valueOf(str8);
					    tf3.setText(str9);
					}
					else if(c2.getSelectedItem().equals("USD"))
					{
					
					    tf3.setText(str);
					}
					else if(c2.getSelectedItem().equals("SAR"))
					{
						double str10=(float)str1*(us/sa);
						String str11=String.valueOf(str10);
					    tf3.setText(str11);
					}
					else if(c2.getSelectedItem().equals("UAE"))
					{
						double str12=(float)str1*(us/ua);
						String str13=String.valueOf(str12);
					    tf3.setText(str13);
					}
				}
				else if(c1.getSelectedItem().equals("SAR"))
				{
					if(c2.getSelectedItem().equals("INR"))
					{
						double str14=(float)str1*sa;
						String str15=String.valueOf(str14);
					    tf3.setText(str15);
					}
					else if(c2.getSelectedItem().equals("USD"))
					{
						double str16=(float)str1*(sa/us);
						String str17=String.valueOf(str16);
					    tf3.setText(str17);
					}
					else if(c2.getSelectedItem().equals("SAR"))
					{
						
					    tf3.setText(str);
					}
					else if(c2.getSelectedItem().equals("UAE"))
					{
						double str17=(float)str1*(ua/sa);
						String str18=String.valueOf(str17);
					    tf3.setText(str18);
					}
				}
				else if(c1.getSelectedItem().equals("UAE"))
				{
				 if(c2.getSelectedItem().equals("UAE"))
				 {
					 tf3.setText(str);
				 }
				 else if(c2.getSelectedItem().equals("SAR"))
					{
						double str19=(float)str1*(sa/ua);
						String str20=String.valueOf(str19);
					    tf3.setText(str20);
					}
				 else if(c2.getSelectedItem().equals("INR"))
					{
						double str21=(float)str1*sa;
						String str22=String.valueOf(str21);
					    tf3.setText(str22);
					}
				 else if(c2.getSelectedItem().equals("USD"))
					{
						double str23=(float)str1*(ua/us);
						String str24=String.valueOf(str23);
					    tf3.setText(str24);
					}
				}
				
				
			}
		});
		button1.setBounds(29, 173, 89, 23);
		frame.getContentPane().add(button1);
		
		
		tf3 = new JTextField();
		tf3.setBounds(159, 174, 184, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		
	}
}
