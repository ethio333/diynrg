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
import backend.CFL;
import backend.Halogen;
public class page3 {

	JFrame frame;
	JTextField textField;
	double price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page3 window = new page3();
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
	public page3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 400, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBulbOptions2 = new JLabel("Price/Saving");
		lblBulbOptions2.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions2.setBounds(161, 11, 133, 25);
		frame.getContentPane().add(lblBulbOptions2);
		
		if (option == 1){
			
		}
		
		
		
		JLabel lblenterQuantity = new JLabel("-Enter Quantity(" + price + "): ");
		lblenterQuantity.setBounds(29, 79, 188, 25);
		frame.getContentPane().add(lblenterQuantity);
		
		textField = new JTextField();
		textField.setBounds(29, 110, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(47, 252, 289, 105);
		textArea.append("IP");
		textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		
		JButton btnNext3 = new JButton("Next");
		btnNext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!(textField.getText().isEmpty())){
					
					//startframe.setVisible(false);
					//bulboptions.setVisible(false);
					frame.setVisible(false);
					//summary.setVisible(true);
				}
				
				
			}
		});
		btnNext3.setBounds(285, 456, 89, 23);
		frame.getContentPane().add(btnNext3);
		
		
		JButton btnBack2 = new JButton("Back");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//startframe.setVisible(false);
				//bulboptions.setVisible(true);
				frame.setVisible(false);
				
				
			}
		});
		btnBack2.setBounds(10, 456, 89, 23);
		frame.getContentPane().add(btnBack2);
		
		
		JLabel lblLedBulbs = new JLabel("Bulbs");
		lblLedBulbs.setBounds(134, 113, 46, 14);
		frame.getContentPane().add(lblLedBulbs);
		
		JButton btnOkay = new JButton("okay");
		btnOkay.setBounds(205, 109, 63, 23);
		frame.getContentPane().add(btnOkay);
		
		JLabel lblTotalCost = new JLabel("total cost:");
		lblTotalCost.setBounds(29, 207, 70, 14);
		frame.getContentPane().add(lblTotalCost);
		
	}
}
