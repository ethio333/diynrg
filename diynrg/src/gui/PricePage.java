/**
 * Price/energy class, user inputs quantity and receives pricing cost/energy saved
 * 
 * @author Fasil Ayenew
 */
package gui;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import backend.LED;
import backend.About;
import backend.CFL;
import backend.Halogen;
public class PricePage {

	JFrame frame;
	JFrame aboutFrame;
	JTextField textField;
	String strTextField;
	double intTextField;
	float price;

	public PricePage(float prc) {
		price = prc;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 450, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBulbOptions2 = new JLabel("Price/Saving");
		lblBulbOptions2.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions2.setBounds(161, 11, 133, 25);
		frame.getContentPane().add(lblBulbOptions2);
		
		
		
		JLabel lblenterQuantity = new JLabel("-Enter Quantity($" + price + "): ");
		lblenterQuantity.setBounds(29, 79, 188, 25);
		frame.getContentPane().add(lblenterQuantity);
		
		textField = new JTextField();
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBounds(29, 110, 86, 20);
		
		
		JLabel lblLedBulbs = new JLabel("total");
		lblLedBulbs.setBounds(134, 113, 46, 14);
		frame.getContentPane().add(lblLedBulbs);
		
		
		
		JButton btnOkay = new JButton("okay");
		btnOkay.setBounds(205, 109, 63, 23);
		frame.getContentPane().add(btnOkay);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(47, 252, 289, 105);
		//textArea.append("in progress");
		//textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		
		
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int totalAmount = Integer.parseInt(textField.getText());
				
				if (price == 13){//led
					LED costNumbers = new LED(totalAmount);
					textArea.setText("Total cost is: $" + 
					String.valueOf(costNumbers.getPriceForQuantity()) +
					"\nTotal Energy Consumption per hour is: " + 
					costNumbers.getEnergyConsumptionForQuantity() + " watts");
					textArea.setEditable(false);
				}
				if (price == 2){//cfl
					CFL costNumbers = new CFL(totalAmount);
					textArea.setText("Total cost is: $" + 
					String.valueOf(costNumbers.getPriceForQuantity()) +
					"\nTotal Energy Consumption per hour is: " + 
					costNumbers.getEnergyConsumptionForQuantity() + " watts");
					textArea.setEditable(false);
				}
				if (price == 20){//halogen
					Halogen costNumbers = new Halogen(totalAmount);
					textArea.setText("Total cost is: $" + 
					String.valueOf(costNumbers.getPriceForQuantity()) +
					"\nTotal Energy Consumption per hour is: " + 
					costNumbers.getEnergyConsumptionForQuantity() + " watts");
					textArea.setEditable(false);
				}
				
				
				
				
			}
		});
		
		
		JLabel lblTotalCost = new JLabel("total cost:");
		lblTotalCost.setBounds(29, 207, 70, 14);
		frame.getContentPane().add(lblTotalCost);
		
		
		JButton btnNext3 = new JButton("Finish");
		btnNext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!(textField.getText().isEmpty())){
					
					SummaryPage nxt = new SummaryPage();
					frame.setVisible(false);
					nxt.frame.setVisible(true);
				}
				
				
			}
		});
		btnNext3.setBounds(322, 452, 89, 23);
		frame.getContentPane().add(btnNext3);
		
		
		JButton btnBack2 = new JButton("Back");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//frame.setVisible(false);
				//OptionPage back = new OptionPage();
				//back.frame.setVisible(true);
					
				
			}
		});
		
		btnBack2.setBounds(20, 452, 89, 23);
		frame.getContentPane().add(btnBack2);	
		
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Intro back =  new Intro();
				frame.setVisible(false);
				back.frame.setVisible(true);
				
			}
		});
		btnHome.setBounds(166, 452, 89, 23);
		frame.getContentPane().add(btnHome);
		
		JButton btnAbout = new JButton("?"); //about
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutPage about = new AboutPage();
				about.aboutFrame.setVisible(true);
				
			}
		});
		btnAbout.setBounds(365, 11, 46, 25);
		frame.getContentPane().add(btnAbout);
	}
}
