import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import backend.CFL;
import backend.Halogen;
import backend.LED;

import javax.swing.JButton;

public class page2 {

	JFrame frame;
	int option;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 window = new page2();
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
	public page2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblSelectDiyProject = new JLabel("Options");
		lblSelectDiyProject.setBounds(166, 22, 111, 14);
		frame.getContentPane().add(lblSelectDiyProject);
		
			
		LED option1 = new LED(0);
		CFL option2 = new CFL(0);
		Halogen option3 = new Halogen(0);
			
			
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(option1.name());
		rdbtnNewRadioButton.setBounds(20, 94, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(option2.name());
		rdbtnNewRadioButton_1.setBounds(20, 169, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(option3.name());
		rdbtnNewRadioButton_2.setBounds(20, 246, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				page3 nxt = new page3();
				if (rdbtnNewRadioButton.isSelected()){
					
					option = 1;
					frame.setVisible(false);
					nxt.frame.setVisible(true);
				}
				if (rdbtnNewRadioButton_1.isSelected()){
					
					option = 2;
					frame.setVisible(false);
					nxt.frame.setVisible(true);
				}
				if (rdbtnNewRadioButton_2.isSelected()){
					
					option = 3;
					
					frame.setVisible(false);
					nxt.frame.setVisible(true);
				}
				
				
				
			}
		});
		btnNext.setBounds(322, 452, 89, 23);
		frame.getContentPane().add(btnNext);
		
		
	}
}
