package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Ticketbooking {

	private JFrame frame;
	private JTable table;
	private JTextField tf;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketbooking window = new Ticketbooking();
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
	public Ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 240));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		frame.setBounds(100, 100, 689, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(331, 74, 332, 315);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label6 = new JLabel("     Name");
		label6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label6.setBounds(9, 35, 69, 21);
		panel.add(label6);
		
		tf5 = new JTextField();
		tf5.setBounds(88, 34, 211, 24);
		panel.add(tf5);
		tf5.setColumns(10);
		
		JLabel label7 = new JLabel("  From");
		label7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label7.setBounds(4, 88, 46, 14);
		panel.add(label7);
		
		tf6 = new JTextField();
		tf6.setBounds(49, 85, 112, 20);
		panel.add(tf6);
		tf6.setColumns(10);
		
		JLabel label8 = new JLabel("     To");
		label8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label8.setBounds(3, 124, 46, 14);
		panel.add(label8);
		
		tf7 = new JTextField();
		tf7.setBounds(49, 121, 111, 20);
		panel.add(tf7);
		tf7.setColumns(10);
		
		JLabel label9 = new JLabel("  Date");
		label9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label9.setBounds(3, 160, 40, 14);
		panel.add(label9);
		
		tf8 = new JTextField();
		tf8.setBounds(50, 156, 111, 20);
		panel.add(tf8);
		tf8.setColumns(10);
		
		JLabel labbel10 = new JLabel("   Time");
		labbel10.setFont(new Font("Tahoma", Font.BOLD, 11));
		labbel10.setBounds(5, 195, 39, 14);
		panel.add(labbel10);
		
		tf9 = new JTextField();
		tf9.setBounds(52, 191, 109, 20);
		panel.add(tf9);
		tf9.setColumns(10);
		
		JLabel label11 = new JLabel("   Ticket No");
		label11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label11.setBounds(205, 69, 70, 14);
		panel.add(label11);
		
		tf10 = new JTextField();
		tf10.setBounds(183, 88, 117, 20);
		panel.add(tf10);
		tf10.setColumns(10);
		
		JLabel label12 = new JLabel("  Price");
		label12.setFont(new Font("Tahoma", Font.BOLD, 11));
		label12.setBounds(211, 118, 56, 14);
		panel.add(label12);
		
		tf11 = new JTextField();
		tf11.setBounds(183, 138, 116, 20);
		panel.add(tf11);
		tf11.setColumns(10);
		
		JLabel label13 = new JLabel("Route");
		label13.setFont(new Font("Tahoma", Font.BOLD, 11));
		label13.setBounds(220, 167, 46, 14);
		panel.add(label13);
		
		tf12 = new JTextField();
		tf12.setBounds(185, 188, 114, 20);
		panel.add(tf12);
		tf12.setColumns(10);
		
		JButton button4 = new JButton("Confirm");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button4.setBounds(115, 281, 97, 23);
		panel.add(button4);
		
		table = new JTable();
		table.setBounds(10, 400, 653, 50);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of Seats", "Time ", "Date", "AC/Non AC", "Price"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		frame.getContentPane().add(table);
		
		JLabel label2 = new JLabel("   Name");
		label2.setBounds(10, 87, 64, 14);
		label2.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(label2);
		
		tf = new JTextField();
		tf.setBounds(73, 85, 212, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		
		JButton button1 = new JButton("Total");
		button1.setBounds(10, 366, 89, 23);
		frame.getContentPane().add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//S1=(String)combo1.getSelectedItem();
				//S2=(String)combo2.getSelectedItem();
				//S3=(String)combo3.getSelectedItem();
				//String str=tf.getText();
			}
		});
		
		
	
		
		JButton button2 = new JButton("Reset");
		button2.setBounds(119, 367, 89, 23);
		frame.getContentPane().add(button2);
		
		
		JButton button3 = new JButton("Exit");
		button3.setBounds(226, 367, 89, 23);
		frame.getContentPane().add(button3);
		
		JRadioButton r1 = new JRadioButton("Standard");
		r1.setBounds(4, 133, 78, 25);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Single Ticket");
		r2.setBounds(87, 134, 109, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r6 = new JRadioButton("Adult");
		r6.setBounds(215, 134, 109, 23);
		frame.getContentPane().add(r6);
		
		JRadioButton r3 = new JRadioButton("First Class");
		r3.setBounds(4, 169, 82, 23);
		frame.getContentPane().add(r3);
		
		JRadioButton r4 = new JRadioButton("Ac");
		r4.setBounds(89, 169, 53, 23);
		frame.getContentPane().add(r4);
		
		JRadioButton r5 = new JRadioButton("Non Ac");
		r5.setBounds(145, 169, 68, 23);
		frame.getContentPane().add(r5);
		ButtonGroup G=new ButtonGroup();
		G.add(r1);
		G.add(r2);
		G.add(r3);
		G.add(r4);
		G.add(r5);
		
		JRadioButton r7 = new JRadioButton("Child");
		r7.setBounds(215, 168, 109, 23);
		frame.getContentPane().add(r7);
		ButtonGroup H=new ButtonGroup();
		H.add(r6);
		H.add(r7);
		
		
		JComboBox combo1 = new JComboBox();
		combo1.setBounds(7, 203, 92, 20);
		combo1.setModel(new DefaultComboBoxModel(new String[] {"<< FROM >>", "BANGALORE", "KOZHIKODE", "MALAPPURAM", "KOLLAM", "COIMBATORE"}));
		frame.getContentPane().add(combo1);
		
		JComboBox combo2 = new JComboBox();
		combo2.setBounds(119, 203, 91, 20);
		combo2.setModel(new DefaultComboBoxModel(new String[] {"<< TO >>", "BANGALORE", "KOZHIKODE", "KOLLAM", "COIMBATORE", "MALAPPURAM"}));
		frame.getContentPane().add(combo2);
		
		JComboBox combo3 = new JComboBox();
		combo3.setBounds(226, 203, 95, 20);
		combo3.setModel(new DefaultComboBoxModel(new String[] {"NO OF SEATS", "1", "2", "3", "4", "5"}));
		frame.getContentPane().add(combo3);
		
		JLabel lblNewLabel = new JLabel("   Tax");
		lblNewLabel.setBounds(17, 244, 46, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sub Total");
		lblNewLabel_1.setBounds(10, 273, 64, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("  Total");
		lblNewLabel_2.setBounds(17, 306, 46, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_2);
		
		
		tf1 = new JTextField();
		tf1.setBounds(87, 242, 149, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(87, 271, 149, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(87, 304, 147, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JLabel lblTicketBooking = new JLabel("        Ticket Booking");
		lblTicketBooking.setBackground(new Color(0, 206, 209));
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTicketBooking.setBounds(147, 22, 370, 41);
		frame.getContentPane().add(lblTicketBooking);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 234, 311, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 347, 311, 2);
		frame.getContentPane().add(separator_1);
	}
}
