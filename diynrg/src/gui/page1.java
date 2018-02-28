import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import backend.LED;
import backend.CFL;
import backend.Halogen;
public class page1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page1 window = new page1();
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
	public page1() {
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
		
		JLabel label = new JLabel("");
		label.setBounds(156, 11, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblSelectDiyProject = new JLabel("Select DIY Project");
		lblSelectDiyProject.setBounds(166, 22, 111, 14);
		frame.getContentPane().add(lblSelectDiyProject);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Change bulbs");
		rdbtnNewRadioButton.setBounds(20, 94, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Replace insulation");
		rdbtnNewRadioButton_1.setBounds(20, 169, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Change windows");
		rdbtnNewRadioButton_2.setBounds(20, 246, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//page1
				page2 nxt = new page2();
				if (rdbtnNewRadioButton.isSelected()){
					frame.setVisible(false);
					nxt.frame.setVisible(true);
				}
				
				
				
			}
		});
		btnNext.setBounds(322, 452, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnSavedProjects = new JButton("Saved Projects");
		btnSavedProjects.setBounds(166, 364, 111, 23);
		frame.getContentPane().add(btnSavedProjects);
		
	}
}
