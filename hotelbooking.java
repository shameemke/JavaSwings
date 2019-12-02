package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class hotelbooking {
	String str1,str2,str3,str4;

	private JFrame frame;
	private JTextField tfcb;
	private JTextField tfChickenBurgerMeal;
	private JTextField tfCheeseBurger;
	private JTextField tfQuantity;
	private JTextField tfCostofDrinks;
	private JTextField tfCostofMeal;
	private JTextField tfCostofDelivery;
	private JTextField tfCurrency;
	private JTextField tfTax;
	private JTextField tfSubTotal;
	private JTextField tft;
	private JTextField tfCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelbooking window = new hotelbooking();
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
	public hotelbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 921, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.light"));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setForeground(SystemColor.activeCaptionText);
		panel.setBounds(10, 51, 347, 220);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel labelChickenBurger = new JLabel("Chicken Burger");
		labelChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelChickenBurger.setBounds(10, 11, 105, 14);
		panel.add(labelChickenBurger);
		
		tfcb = new JTextField();
		tfcb.setBounds(156, 9, 134, 20);
		panel.add(tfcb);
		tfcb.setColumns(10);
		
		JLabel labelChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		labelChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelChickenBurgerMeal.setBounds(10, 54, 124, 14);
		panel.add(labelChickenBurgerMeal);
		
		tfChickenBurgerMeal = new JTextField();
		tfChickenBurgerMeal.setBounds(156, 52, 134, 20);
		panel.add(tfChickenBurgerMeal);
		tfChickenBurgerMeal.setColumns(10);
		
		JLabel labelCheeseBurger = new JLabel("Cheese Burger");
		labelCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelCheeseBurger.setBounds(10, 98, 124, 14);
		panel.add(labelCheeseBurger);
		
		tfCheeseBurger = new JTextField();
		tfCheeseBurger.setBounds(156, 96, 134, 20);
		panel.add(tfCheeseBurger);
		tfCheeseBurger.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(100, 149, 237));
		separator.setBounds(20, 123, 306, 8);
		panel.add(separator);
		
		JComboBox comboDrink = new JComboBox();
		comboDrink.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboDrink.setModel(new DefaultComboBoxModel(new String[] {"Select", "Tea", "Pepsi", "Cola"}));
		comboDrink.setBounds(10, 156, 105, 20);
		panel.add(comboDrink);
		
		tfQuantity = new JTextField();
		tfQuantity.setBounds(156, 156, 105, 20);
		panel.add(tfQuantity);
		tfQuantity.setColumns(10);
		
		JLabel labelDrinks = new JLabel("    Drinks");
		labelDrinks.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelDrinks.setBounds(10, 131, 83, 14);
		panel.add(labelDrinks);
		
		JLabel labelQuantity = new JLabel("Quantity");
		labelQuantity.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelQuantity.setBounds(156, 131, 83, 14);
		panel.add(labelQuantity);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home delivery");
		rdbtnHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnHomeDelivery.setBounds(6, 183, 109, 23);
		panel.add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnTax.setBounds(152, 183, 109, 23);
		panel.add(rdbtnTax);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 0, 1, 2);
		panel.add(separator_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.light"));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(367, 51, 180, 220);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox cc = new JComboBox();
		cc.setModel(new DefaultComboBoxModel(new String[] {"Select", "INR", "UAE", "USD"}));
		cc.setBounds(10, 39, 125, 20);
		panel_1.add(cc);
		
		JLabel lblCurrencyConverter = new JLabel("  Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCurrencyConverter.setBounds(10, 11, 145, 17);
		panel_1.add(lblCurrencyConverter);
		
		tfCurrency = new JTextField();
		tfCurrency.setBounds(10, 86, 125, 20);
		panel_1.add(tfCurrency);
		tfCurrency.setColumns(10);
		
		JButton buttonConvert = new JButton("Convert");
		buttonConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cc.getSelectedItem()=="INR")
				{
					float aa=Float.parseFloat(tft.getText());
					tft.setText(String.valueOf(aa));
					
				}
			}
		});
		buttonConvert.setBounds(10, 151, 69, 23);
		panel_1.add(buttonConvert);
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(cc.getSelectedItem().equals("INR"))
			{
				String a=tfCurrency.getText();
				tfCurrency.setText("INR" +a);
				
				}
			else if(cc.getSelectedItem().equals("USD"))
			{
				String a=tfCurrency.getText();
				//float b=71.47f;
				//float c=;
				//tfCurrency.setText("USD" +a);
			}
			
			

		}
		});

		
		JButton buttonClose = new JButton("Close");
		buttonClose.setBounds(99, 151, 71, 23);
		panel_1.add(buttonClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Button.light"));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(10, 282, 347, 103);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel labelCostOfDrinks = new JLabel("Cost of Drinks");
		labelCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelCostOfDrinks.setBounds(10, 11, 118, 14);
		panel_2.add(labelCostOfDrinks);
		
		tfCostofDrinks = new JTextField();
		tfCostofDrinks.setBounds(161, 9, 140, 20);
		panel_2.add(tfCostofDrinks);
		tfCostofDrinks.setColumns(10);
		
		JLabel labelCostOfMeal = new JLabel("Cost Of Meal");
		labelCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelCostOfMeal.setBounds(10, 38, 102, 14);
		panel_2.add(labelCostOfMeal);
		
		tfCostofMeal = new JTextField();
		tfCostofMeal.setBounds(161, 36, 140, 20);
		panel_2.add(tfCostofMeal);
		tfCostofMeal.setColumns(10);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostOfDelivery.setBounds(10, 63, 118, 18);
		panel_2.add(lblCostOfDelivery);
		
		tfCostofDelivery = new JTextField();
		tfCostofDelivery.setBounds(161, 67, 141, 20);
		panel_2.add(tfCostofDelivery);
		tfCostofDelivery.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(UIManager.getColor("Button.light"));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(367, 282, 180, 103);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel labelTax = new JLabel("   Tax");
		labelTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelTax.setBounds(0, 11, 46, 14);
		panel_3.add(labelTax);
		
		JLabel labelSubTotal = new JLabel("  Sub Total");
		labelSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelSubTotal.setBounds(0, 43, 64, 14);
		panel_3.add(labelSubTotal);
		
		JLabel labelTotal = new JLabel("   Total");
		labelTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelTotal.setBounds(0, 78, 46, 14);
		panel_3.add(labelTotal);
		
		tfTax = new JTextField();
		tfTax.setBounds(84, 8, 86, 20);
		panel_3.add(tfTax);
		tfTax.setColumns(10);
		
		tfSubTotal = new JTextField();
		tfSubTotal.setBounds(84, 40, 86, 20);
		panel_3.add(tfSubTotal);
		tfSubTotal.setColumns(10);
		
		tft = new JTextField();
		tft.setBounds(84, 75, 86, 20);
		panel_3.add(tft);
		tft.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(UIManager.getColor("Button.light"));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(10, 395, 866, 52);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton buttontotalcost = new JButton("Total");
		buttontotalcost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  cb=110;
				int  cm=120;
				int  csb=130;
				int tea=15;
				int pep=25;
				int col=28;
				
				str1=tfcb.getText();
				str2=tfChickenBurgerMeal.getText();
				str3=tfCheeseBurger.getText();
				str4=tfQuantity.getText();
				int s1=Integer.parseInt(str1);
				int s2=Integer.parseInt(str2);
				int s3=Integer.parseInt(str3);
				int s4=Integer.parseInt(str4);
				float s5=(float)(cb*s1+cm*s2+csb*s3);
				tfCostofMeal.setText(String.valueOf(s5));
				if(comboDrink.getSelectedItem().equals("Tea"))
				{
				float s6=(float)(tea*s4);
				tfCostofDrinks.setText(String.valueOf(s6));
				}
				else if(comboDrink.getSelectedItem().equals("Pepsi"))
				{
					float s6=(float)(pep*s4);
				tfCostofDrinks.setText(String.valueOf(s6));
				}
				else if(comboDrink.getSelectedItem().equals("Cola"))
				{
					float s6=(float)(col*s4);
					tfCostofDrinks.setText(String.valueOf(s6));
				}
			     if(rdbtnHomeDelivery.isSelected())
				{
			     float s7=35;
			     tfCostofDelivery.setText(String.valueOf(s7));
			     }
                   if(rdbtnHomeDelivery.isSelected())
			     {
			     float s8=Float.parseFloat(tfCostofDrinks.getText());
			     float s9=Float.parseFloat(tfCostofMeal.getText());
			     float s10=Float.parseFloat(tfCostofDelivery.getText());
			      float st=s8+s9+s10;
			      tfSubTotal.setText(String.valueOf(st));
			     }
                   else 
                   {
                	   float s8=Float.parseFloat(tfCostofDrinks.getText());
                	   float s9=Float.parseFloat(tfCostofMeal.getText());
                	   float st=s8+s9;
                	   tfSubTotal.setText(String.valueOf(st));
                   }
                   float s11=Float.parseFloat(tfSubTotal.getText());
               if(rdbtnTax.isSelected())
                  {
                 float Tax=(float)(s11*12)/100;
                  tfTax.setText(String.valueOf(Tax));
                   }
                  float s12=Float.parseFloat(tfTax.getText());
                  float s13=s11+s12;
                  tft.setText(String.valueOf(s13));
           
			}
			});

		buttontotalcost.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttontotalcost.setBounds(51, 11, 89, 23);
		panel_4.add(buttontotalcost);
		
		
		
		JButton buttonreset = new JButton("Reset");
		buttonreset.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfcb.setText("");
				tfChickenBurgerMeal.setText("");
				tfCheeseBurger.setText("");
				tfQuantity.setText("");
				tfCostofDrinks.setText("");
				tfCostofMeal.setText("");
				tfCostofDelivery.setText("");
				tfTax.setText("");
				tfSubTotal.setText("");
				tft.setText("");
				comboDrink.setSelectedIndex(0);
				rdbtnTax.setSelected(false);
				rdbtnHomeDelivery.setSelected(false);

			}
		});
		buttonreset.setBounds(294, 11, 89, 23);
		panel_4.add(buttonreset);
		
		JButton buttonexit = new JButton("Exit");
		buttonexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame =new JFrame("Exit");
			if(JOptionPane.showConfirmDialog(frame,"Comfirm","Hotel Management",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
			System.exit(0);
			}
			}
			});
		buttonexit.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonexit.setBounds(410, 11, 89, 23);
		panel_4.add(buttonexit);
		
		
		
		
		
		JLabel labelhotel = new JLabel("  Hotel Management System");
		labelhotel.setBounds(217, 0, 311, 40);
		frame.getContentPane().add(labelhotel);
		labelhotel.setFont(new Font("Tahoma", Font.BOLD, 21));
		labelhotel.setForeground(new Color(0, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(557, 51, 319, 335);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 299, 313);
		panel_5.add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Receipt", null, layeredPane, null);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 11, 274, 263);
		layeredPane.add(ta);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Calculator", null, layeredPane_1, null);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button0.getText()));
			}
		});
		button0.setFont(new Font("Tahoma", Font.ITALIC, 5));
		button0.setBounds(10, 243, 56, 31);
		layeredPane_1.add(button0);
		
		JButton buttondot = new JButton(".");
		buttondot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(buttondot.getText()));
			}
		});
		buttondot.setBounds(76, 241, 51, 31);
		layeredPane_1.add(buttondot);
		
		
		JButton button3dot = new JButton("...");
		button3dot.setBounds(137, 241, 51, 31);
		layeredPane_1.add(button3dot);
		
		JButton buttonequal = new JButton("=");
		buttonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float res1=Float.parseFloat(str1);
				String str;
		float res2=Float.parseFloat(tfCalculator.getText());
		if(str2.contentEquals("+"))
		{
			float res=res1+res2;
			str=String.valueOf(res);
			tfCalculator.setText(str);
		}
		else if(str2.contentEquals("-"))
		{
			float res=res1-res2;
			str=String.valueOf(res);
			tfCalculator.setText(str);
		}
		else if(str2.contentEquals("*"))
		{
			float res=res1*res2;
			str=String.valueOf(res);
			tfCalculator.setText(str);
		
	}
		else if(str2.contentEquals("/"))
		{
			float res=res1/res2;
			str=String.valueOf(res);
			tfCalculator.setText(str);
		}
	
		
                }    
			
		});
		
		buttonequal.setBounds(204, 241, 56, 31);
		layeredPane_1.add(buttonequal);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button1.getText()));
			}
		});
		button1.setBounds(9, 201, 56, 31);
		layeredPane_1.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button2.getText()));
			}
		});
		button2.setBounds(82, 199, 51, 31);
		layeredPane_1.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button3.getText()));
			}
		});
		
		button3.setBounds(140, 199, 54, 31);
		layeredPane_1.add(button3);
		
		JButton buttondivide = new JButton("/");
		buttondivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tfCalculator.getText();
				str2=buttondivide.getText();
				tfCalculator.setText("");
			}
		});
		buttondivide.setBounds(205, 199, 56, 31);
		layeredPane_1.add(buttondivide);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button4.getText()));
			}
		});
		button4.setBounds(10, 159, 57, 31);
		layeredPane_1.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button5.getText()));
			}
		});
		button5.setBounds(77, 157, 56, 31);
		layeredPane_1.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button6.getText()));
			}
		});
		button6.setBounds(143, 157, 51, 31);
		layeredPane_1.add(button6);
		
		JButton buttonstar = new JButton("*");
		buttonstar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tfCalculator.getText();
				str2=buttonstar.getText();
				tfCalculator.setText("");
			}
		});
		buttonstar.setBounds(204, 157, 56, 31);
		layeredPane_1.add(buttonstar);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button7.getText()));
			}
		});
		button7.setBounds(10, 117, 57, 31);
		layeredPane_1.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button8.getText()));
			}
		});
		button8.setBounds(78, 115, 55, 31);
		layeredPane_1.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText(tfCalculator.getText().concat(button9.getText()));
			}
		});
		button9.setBounds(140, 115, 54, 31);
		layeredPane_1.add(button9);
		
		JButton buttonminus = new JButton("-");
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tfCalculator.getText();
				str2=buttonminus.getText();
				tfCalculator.setText("");
			}
		});
		buttonminus.setBounds(204, 115, 56, 31);
		layeredPane_1.add(buttonminus);
		
		JButton buttonB = new JButton("B");
		buttonB.setBounds(9, 77, 58, 29);
		layeredPane_1.add(buttonB);
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCalculator.setText("");
			}
			
		});
		buttonC.setBounds(71, 75, 62, 29);
		layeredPane_1.add(buttonC);
		
		
		JButton button3dots2 = new JButton("...");
		button3dots2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button3dots2.setBounds(140, 75, 54, 29);
		layeredPane_1.add(button3dots2);
		
		JButton buttonplus = new JButton("+");
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=tfCalculator.getText();
				str2=buttonplus.getText();
				tfCalculator.setText("");
			}
		});
		buttonplus.setBounds(202, 75, 58, 29);
		layeredPane_1.add(buttonplus);
		
		tfCalculator = new JTextField();
		tfCalculator.setBounds(10, 11, 250, 27);
		layeredPane_1.add(tfCalculator);
		tfCalculator.setColumns(10);
		



JButton btnReceipt = new JButton("Receipt");
btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 12));
btnReceipt.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		ta.append("\t Food Bill\n"
				+ "Hotel Name :\tThanthoor Hut\n"
				+ "======================================\n"
				+ "\nChicken Burger:\t 150 *" + tfcb.getText()
				+ "\nChicken Burger meal:\t 250 *" + tfChickenBurgerMeal.getText()
				+ "\nCheese Burger:\t\t 110 *" + tfCheeseBurger.getText()
				+ "\nCost of Drinks:\t\t " + tfCostofDrinks.getText()
				+ "\nCost of Meal:\t\t" + tfCostofMeal.getText()
				+ "\nCost of Delivery:\t" + tfCostofDelivery.getText()
				+ "\nTax:\t\t 12%"
				+"\n======================================\n"
				+ "\n Sub Total:\t\t" + tfSubTotal.getText()
				+ "\n Tax:\t\t" + tfTax.getText()
				+ "\nTotal:\t\t" + tft.getText()
				+ "\n\n\t THANK YOU"
				);
	}
});
btnReceipt.setBounds(175, 12, 89, 23);
panel_4.add(btnReceipt);
	}
}
