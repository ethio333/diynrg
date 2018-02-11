import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class FrontPage {

	private JFrame frame;
	private JFrame frame2;
	private JFrame frame3;
	private JFrame frame4;
	private JTextField textField;

	/**
	 * Launch application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrontPage() {
		initialize();
	}

	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		//frame.setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 400, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFkmdProject = new JLabel("Select a DIY Project");
		lblFkmdProject.setFont(new Font("Serif", Font.PLAIN, 19));
		lblFkmdProject.setBounds(109, 11, 162, 27);
		frame.getContentPane().add(lblFkmdProject);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.setVisible(false);
				frame2.setVisible(true);
				
				
			}
		});
		btnNext.setBounds(285, 456, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JRadioButton rdbtnChangeBulbs = new JRadioButton("Change bulbs");
		rdbtnChangeBulbs.setBounds(27, 86, 109, 23);
		frame.getContentPane().add(rdbtnChangeBulbs);
		
		JRadioButton rdbtnReplaceWindows = new JRadioButton("Replace Windows");
		rdbtnReplaceWindows.setBounds(27, 149, 130, 23);
		frame.getContentPane().add(rdbtnReplaceWindows);
		
		JRadioButton rdbtnChangeWindows = new JRadioButton("Change Windows");
		rdbtnChangeWindows.setBounds(27, 211, 130, 23);
		frame.getContentPane().add(rdbtnChangeWindows);
		
		JButton button = new JButton("+");
		button.setBounds(10, 456, 41, 23);
		frame.getContentPane().add(button);
		
		JButton btnSavedProjects = new JButton("Saved Projects");
		btnSavedProjects.setBounds(129, 294, 130, 23);
		frame.getContentPane().add(btnSavedProjects);
		
		JButton btnCustomPorjects = new JButton("Custom Porjects");
		btnCustomPorjects.setBounds(129, 342, 130, 23);
		frame.getContentPane().add(btnCustomPorjects);
		//btnNext.setVisible(false);
		
		//Second page(LED OPTION)
		frame2 = new JFrame();
		frame2.setVisible(false);
		frame2.setBounds(100, 100, 400, 543);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JRadioButton rdbtnLed = new JRadioButton("LED");
		rdbtnLed.setBounds(27, 86, 109, 23);
		frame2.getContentPane().add(rdbtnLed);
		
		JRadioButton rdbtnCfl = new JRadioButton("CFL");
		rdbtnCfl.setBounds(27, 149, 109, 23);
		frame2.getContentPane().add(rdbtnCfl);
		
		JRadioButton rdbtnHalogen = new JRadioButton("Halogen");
		rdbtnHalogen.setBounds(27, 211, 109, 23);
		frame2.getContentPane().add(rdbtnHalogen);
		
		JLabel lblBulbOptions = new JLabel("Bulb Options");
		lblBulbOptions.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions.setBounds(161, 11, 133, 25);
		frame2.getContentPane().add(lblBulbOptions);
		
		JButton btnNext2 = new JButton("Next");
		btnNext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.setVisible(false);
				frame2.setVisible(false);
				frame3.setVisible(true);
				
				
			}
		});
		btnNext2.setBounds(285, 456, 89, 23);
		frame2.getContentPane().add(btnNext2);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 456, 89, 23);
		frame2.getContentPane().add(btnBack);
		
		//third page(LED Option)
		frame3 = new JFrame();
		frame3.setVisible(false);
		frame3.setBounds(100, 100, 400, 543);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JLabel lblBulbOptions2 = new JLabel("LED Bulbs");
		lblBulbOptions2.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions2.setBounds(161, 11, 133, 25);
		frame3.getContentPane().add(lblBulbOptions2);
		
		JButton btnNext3 = new JButton("Next");
		btnNext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.setVisible(false);
				frame2.setVisible(false);
				frame3.setVisible(false);
				frame4.setVisible(true);
				
				
			}
		});
		btnNext3.setBounds(285, 456, 89, 23);
		frame3.getContentPane().add(btnNext3);
		
		JButton btnBack2 = new JButton("Back");
		btnBack2.setBounds(10, 456, 89, 23);
		frame3.getContentPane().add(btnBack2);
		
		JLabel lblenterQuantity = new JLabel("-Enter Quantity: ");
		lblenterQuantity.setBounds(29, 79, 103, 25);
		frame3.getContentPane().add(lblenterQuantity);
		
		textField = new JTextField();
		textField.setBounds(29, 110, 86, 20);
		frame3.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLedBulbs = new JLabel("Bulbs");
		lblLedBulbs.setBounds(134, 113, 46, 14);
		frame3.getContentPane().add(lblLedBulbs);
		
		JButton btnOkay = new JButton("okay");
		btnOkay.setBounds(205, 109, 63, 23);
		frame3.getContentPane().add(btnOkay);
		
		JLabel lblTotalCost = new JLabel("total cost:");
		lblTotalCost.setBounds(29, 207, 70, 14);
		frame3.getContentPane().add(lblTotalCost);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(47, 252, 289, 105);
		textArea.append("savings go here");
		textArea.setEditable(false);
		frame3.getContentPane().add(textArea);
		
		//last page(used for all options)
		frame4 = new JFrame();
		frame4.setVisible(false);
		frame4.setBounds(100, 100, 400, 543);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JLabel lblBulbOptions3 = new JLabel("Summary");
		lblBulbOptions3.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions3.setBounds(161, 11, 133, 25);
		frame4.getContentPane().add(lblBulbOptions3);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.setVisible(true);
				frame2.setVisible(false);
				frame3.setVisible(false);
				frame4.setVisible(false);
				
				
			}
		});
		btnRestart.setBounds(285, 456, 89, 23);
		frame4.getContentPane().add(btnRestart);
		
		JButton btnBack3 = new JButton("Back");
		btnBack3.setBounds(10, 456, 89, 23);
		frame4.getContentPane().add(btnBack3);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(151, 343, 101, 23);
		frame4.getContentPane().add(btnPrint);
		
		JButton btnDownload = new JButton("Download");
		btnDownload.setBounds(151, 388, 101, 23);
		frame4.getContentPane().add(btnDownload);
		
		JLabel lblinfo = new JLabel("-change test");
		lblinfo.setBounds(28, 67, 71, 14);
		frame4.getContentPane().add(lblinfo);
		
		JLabel lbltest = new JLabel("-option test");
		lbltest.setBounds(28, 108, 71, 14);
		frame4.getContentPane().add(lbltest);
		
		JLabel lblpriceTest = new JLabel("-price test");
		lblpriceTest.setBounds(28, 147, 71, 14);
		frame4.getContentPane().add(lblpriceTest);
		
		JLabel lblsavingsTest = new JLabel("-savings test");
		lblsavingsTest.setBounds(28, 199, 101, 14);
		frame4.getContentPane().add(lblsavingsTest);
		
		
		
		
	}
}
