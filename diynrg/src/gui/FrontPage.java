<<<<<<< HEAD
=======
package gui;


>>>>>>> upstream/master
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
//udhfigdoidgfgihdl
	private JFrame startframe;
	private JFrame bulboptions;
	private JFrame ledprice;
	private JFrame summary;
	private JTextField textField;
	private JTextField textField2;
	private JTextField textField3;
	private JFrame cflprice;
	private JFrame hlgprice;

	/**
	 * Launch application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage window = new FrontPage();
					window.startframe.setVisible(true);
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
		startframe = new JFrame();
		startframe.getContentPane().setForeground(Color.BLACK);
		startframe.setBackground(Color.BLACK);
		//frame.setBackground(Color.YELLOW);
		startframe.setBounds(100, 100, 400, 543);
		startframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startframe.getContentPane().setLayout(null);
		
		JLabel lblFkmdProject = new JLabel("Select a DIY Project");
		lblFkmdProject.setFont(new Font("Serif", Font.PLAIN, 19));
		lblFkmdProject.setBounds(109, 11, 162, 27);
		startframe.getContentPane().add(lblFkmdProject);
		
		JRadioButton rdbtnChangeBulbs = new JRadioButton("Change bulbs");
		rdbtnChangeBulbs.setBounds(27, 86, 109, 23);
		startframe.getContentPane().add(rdbtnChangeBulbs);
		
		JRadioButton rdbtnReplaceWindows = new JRadioButton("Replace Windows");
		rdbtnReplaceWindows.setBounds(27, 149, 130, 23);
		startframe.getContentPane().add(rdbtnReplaceWindows);
		
		JRadioButton rdbtnChangeWindows = new JRadioButton("Change Windows");
		rdbtnChangeWindows.setBounds(27, 211, 130, 23);
		startframe.getContentPane().add(rdbtnChangeWindows);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnChangeBulbs.isSelected()){
					
					startframe.setVisible(false);
					bulboptions.setVisible(true);
				}
				
				
			}
		});
		btnNext.setBounds(285, 456, 89, 23);
		startframe.getContentPane().add(btnNext);
		
		
		JButton button = new JButton("+");
		button.setBounds(10, 456, 41, 23);
		startframe.getContentPane().add(button);
		
		JButton btnSavedProjects = new JButton("Saved Projects");
		btnSavedProjects.setBounds(129, 294, 130, 23);
		startframe.getContentPane().add(btnSavedProjects);
		
		JButton btnCustomPorjects = new JButton("Custom Porjects");
		btnCustomPorjects.setBounds(129, 342, 130, 23);
		startframe.getContentPane().add(btnCustomPorjects);
		//btnNext.setVisible(false);
		
		//Second page(bulb OPTION)
		bulboptions = new JFrame();
		bulboptions.setVisible(false);
		bulboptions.setBounds(100, 100, 400, 543);
		bulboptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bulboptions.getContentPane().setLayout(null);
		
		JRadioButton rdbtnLed = new JRadioButton("LED");
		rdbtnLed.setBounds(27, 86, 109, 23);
		bulboptions.getContentPane().add(rdbtnLed);
		
		JRadioButton rdbtnCfl = new JRadioButton("CFL");
		rdbtnCfl.setBounds(27, 149, 109, 23);
		bulboptions.getContentPane().add(rdbtnCfl);
		
		JRadioButton rdbtnHalogen = new JRadioButton("Halogen");
		rdbtnHalogen.setBounds(27, 211, 109, 23);
		bulboptions.getContentPane().add(rdbtnHalogen);
		
		JLabel lblBulbOptions = new JLabel("Bulb Options");
		lblBulbOptions.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions.setBounds(161, 11, 133, 25);
		bulboptions.getContentPane().add(lblBulbOptions);
		
		JButton btnNext2 = new JButton("Next");
		btnNext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnLed.isSelected()){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					ledprice.setVisible(true);
				}
				if (rdbtnCfl.isSelected()){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					cflprice.setVisible(true);
				}
				if (rdbtnHalogen.isSelected()){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					hlgprice.setVisible(true);
				}
				
				
			}
		});
		btnNext2.setBounds(285, 456, 89, 23);
		bulboptions.getContentPane().add(btnNext2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				startframe.setVisible(true);
				bulboptions.setVisible(false);
				ledprice.setVisible(false);
				
				
			}
		});
		btnBack.setBounds(10, 456, 89, 23);
		bulboptions.getContentPane().add(btnBack);
		
		//third page(LED options)
		ledprice = new JFrame();
		ifhdshf  = new JFrame();//dhfkidglidflg
		ledprice.setVisible(false);
		ledprice.setBounds(100, 100, 400, 543);
		ledprice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ledprice.getContentPane().setLayout(null);
		
		JLabel lblBulbOptions2 = new JLabel("LED Bulbs");
		lblBulbOptions2.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions2.setBounds(161, 11, 133, 25);
		ledprice.getContentPane().add(lblBulbOptions2);
		
		JLabel lblenterQuantity = new JLabel("-Enter Quantity($9.95 per bulb): ");
		lblenterQuantity.setBounds(29, 79, 188, 25);
		ledprice.getContentPane().add(lblenterQuantity);
		
		textField = new JTextField();
		textField.setBounds(29, 110, 86, 20);
		ledprice.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(47, 252, 289, 105);
		textArea.append("savings go here");
		textArea.setEditable(false);
		ledprice.getContentPane().add(textArea);
		
		JButton btnNext3 = new JButton("Next");
		btnNext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!(textField.getText().isEmpty())){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					ledprice.setVisible(false);
					summary.setVisible(true);
				}
				
				
			}
		});
		btnNext3.setBounds(285, 456, 89, 23);
		ledprice.getContentPane().add(btnNext3);
		
		
		JButton btnBack2 = new JButton("Back");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				startframe.setVisible(false);
				bulboptions.setVisible(true);
				ledprice.setVisible(false);
				
				
			}
		});
		btnBack2.setBounds(10, 456, 89, 23);
		ledprice.getContentPane().add(btnBack2);
		
		
		JLabel lblLedBulbs = new JLabel("Bulbs");
		lblLedBulbs.setBounds(134, 113, 46, 14);
		ledprice.getContentPane().add(lblLedBulbs);
		
		JButton btnOkay = new JButton("okay");
		btnOkay.setBounds(205, 109, 63, 23);
		ledprice.getContentPane().add(btnOkay);
		
		JLabel lblTotalCost = new JLabel("total cost:");
		lblTotalCost.setBounds(29, 207, 70, 14);
		ledprice.getContentPane().add(lblTotalCost);
		
		//cfl options
		
		cflprice = new JFrame();
		cflprice.setVisible(false);
		cflprice.setBounds(100, 100, 400, 543);
		cflprice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cflprice.getContentPane().setLayout(null);
		
		JLabel lblBulbOptions3 = new JLabel("CFL Bulbs");
		lblBulbOptions3.setFont(new Font("Serif", Font.PLAIN, 19));
		lblBulbOptions3.setBounds(161, 11, 133, 25);
		cflprice.getContentPane().add(lblBulbOptions3);
		
		JLabel lblenterQuantity2 = new JLabel("-Enter Quantity($3.89 per bulb): ");
		lblenterQuantity2.setBounds(29, 79, 188, 25);
		cflprice.getContentPane().add(lblenterQuantity2);
		
		textField2 = new JTextField();
		textField2.setBounds(29, 110, 86, 20);
		cflprice.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(47, 252, 289, 105);
		textArea2.append("savings go here");
		textArea2.setEditable(false);
		cflprice.getContentPane().add(textArea2);
		
		JButton btnNext4 = new JButton("Next");
		btnNext4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!(textField2.getText().isEmpty())){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					ledprice.setVisible(false);
					summary.setVisible(true);
				}
				
				
			}
		});
		btnNext4.setBounds(285, 456, 89, 23);
		cflprice.getContentPane().add(btnNext4);
		
		
		JButton btnBack3 = new JButton("Back");
		btnBack3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				startframe.setVisible(false);
				bulboptions.setVisible(true);
				ledprice.setVisible(false);
				
				
			}
		});
		btnBack3.setBounds(10, 456, 89, 23);
		cflprice.getContentPane().add(btnBack3);
		
		
		JLabel lblLedBulbs2 = new JLabel("Bulbs");
		lblLedBulbs2.setBounds(134, 113, 46, 14);
		cflprice.getContentPane().add(lblLedBulbs2);
		
		JButton btnOkay2 = new JButton("okay");
		btnOkay2.setBounds(205, 109, 63, 23);
		cflprice.getContentPane().add(btnOkay2);
		
		JLabel lblTotalCost2 = new JLabel("total cost:");
		lblTotalCost2.setBounds(29, 207, 70, 14);
		cflprice.getContentPane().add(lblTotalCost2);
		
		//halogen options
		hlgprice = new JFrame();
		hlgprice.setVisible(false);
		hlgprice.setBounds(100, 100, 400, 543);
		hlgprice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hlgprice.getContentPane().setLayout(null);
		
		JLabel lblhlgOptions = new JLabel("Hologen Bulbs");
		lblhlgOptions.setFont(new Font("Serif", Font.PLAIN, 19));
		lblhlgOptions.setBounds(161, 11, 133, 25);
		hlgprice.getContentPane().add(lblhlgOptions);
		
		JLabel lblenterQuantity3 = new JLabel("-Enter Quantity($2.15 per bulb): ");
		lblenterQuantity3.setBounds(29, 79, 188, 25);
		hlgprice.getContentPane().add(lblenterQuantity3);
		
		textField3 = new JTextField();
		textField3.setBounds(29, 110, 86, 20);
		hlgprice.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JTextArea textArea3 = new JTextArea();
		textArea3.setBounds(47, 252, 289, 105);
		textArea3.append("savings go here");
		textArea3.setEditable(false);
		hlgprice.getContentPane().add(textArea3);
		
		JButton btnNext5 = new JButton("Next");
		btnNext5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!(textField3.getText().isEmpty())){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					hlgprice.setVisible(false);
					summary.setVisible(true);
				}
				
				
			}
		});
		btnNext5.setBounds(285, 456, 89, 23);
		hlgprice.getContentPane().add(btnNext5);
		
		
		JButton btnBack4 = new JButton("Back");
		btnBack4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				startframe.setVisible(false);
				bulboptions.setVisible(true);
				hlgprice.setVisible(false);
				
				
			}
		});
		btnBack4.setBounds(10, 456, 89, 23);
		hlgprice.getContentPane().add(btnBack4);
		
		
		JLabel lblhlgBulbs2 = new JLabel("Bulbs");
		lblhlgBulbs2.setBounds(134, 113, 46, 14);
		hlgprice.getContentPane().add(lblhlgBulbs2);
		
		JButton btnOkay3 = new JButton("okay");
		btnOkay3.setBounds(205, 109, 63, 23);
		hlgprice.getContentPane().add(btnOkay3);
		
		JLabel lblTotalCost3 = new JLabel("total cost:");
		lblTotalCost3.setBounds(29, 207, 70, 14);
		hlgprice.getContentPane().add(lblTotalCost3);
		
		
		
		//last page(used for all options)
		summary = new JFrame();
		summary.setVisible(false);
		summary.setBounds(100, 100, 400, 543);
		summary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		summary.getContentPane().setLayout(null);
		
		JLabel lblSummary = new JLabel("Summary");
		lblSummary.setFont(new Font("Serif", Font.PLAIN, 19));
		lblSummary.setBounds(161, 11, 133, 25);
		summary.getContentPane().add(lblSummary);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				startframe.setVisible(true);
				bulboptions.setVisible(false);
				ledprice.setVisible(false);
				summary.setVisible(false);
				
				
			}
		});
		btnRestart.setBounds(285, 456, 89, 23);
		summary.getContentPane().add(btnRestart);
		
		JButton btnBackFinal = new JButton("Back");
		btnBackFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnLed.isSelected()){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					ledprice.setVisible(true);
				}
				if (rdbtnCfl.isSelected()){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					cflprice.setVisible(true);
				}
				if (rdbtnHalogen.isSelected()){
					
					startframe.setVisible(false);
					bulboptions.setVisible(false);
					hlgprice.setVisible(true);
				}
				
			}
		});
		btnBackFinal.setBounds(10, 456, 89, 23);
		summary.getContentPane().add(btnBackFinal);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(151, 343, 101, 23);
		summary.getContentPane().add(btnPrint);
		
		JButton btnDownload = new JButton("Download");
		btnDownload.setBounds(151, 388, 101, 23);
		summary.getContentPane().add(btnDownload);
		
		JLabel lblinfo = new JLabel("-change test");
		lblinfo.setBounds(28, 67, 71, 14);
		summary.getContentPane().add(lblinfo);
		
		JLabel lbltest = new JLabel("-option test");
		lbltest.setBounds(28, 108, 71, 14);
		summary.getContentPane().add(lbltest);
		
		JLabel lblpriceTest = new JLabel("-price test");
		lblpriceTest.setBounds(28, 147, 71, 14);
		summary.getContentPane().add(lblpriceTest);
		
		JLabel lblsavingsTest = new JLabel("-savings test");
		lblsavingsTest.setBounds(28, 199, 101, 14);
		summary.getContentPane().add(lblsavingsTest);
		
		
	}
}
