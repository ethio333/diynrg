/**
 * About class, information about users and application
 * 
 * @author Fasil Ayenew
 */
package gui;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import backend.About;
public class AboutPage {

	JFrame aboutFrame;

	public AboutPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		aboutFrame = new JFrame();
		
		aboutFrame.setBounds(100, 100, 450, 549);
		//aboutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aboutFrame.getContentPane().setLayout(null);
		
		About abt = new About();
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(139, 11, 46, 14);
		aboutFrame.getContentPane().add(lblAbout);
				
		JLabel lblVersion = new JLabel("Version : " + abt.displayVersion());
		lblVersion.setBounds(44, 115, 333, 14);
		aboutFrame.getContentPane().add(lblVersion);
			
		JLabel lblDate = new JLabel("Date : " + abt.displayDate());
		lblDate.setBounds(44, 172, 333, 14);
		aboutFrame.getContentPane().add(lblDate);
				
		JLabel lblName1 = new JLabel("Dev 1 : " + abt.displayName1());
		lblName1.setBounds(44, 229, 333, 14);
		aboutFrame.getContentPane().add(lblName1);
			
		JLabel lblName2 = new JLabel("Dev 2 : " + abt.displayName2());
		lblName2.setBounds(44, 289, 333, 14);
		aboutFrame.getContentPane().add(lblName2);
				
		JLabel lblName3 = new JLabel("Dev 3 : " + abt.displayName3());
		lblName3.setBounds(44, 343, 333, 14);
		aboutFrame.getContentPane().add(lblName3);
			
		JLabel lblName4 = new JLabel("Dev 4 : " + abt.displayName4());
		lblName4.setBounds(44, 400, 333, 14);
		aboutFrame.getContentPane().add(lblName4);
				
		JLabel lblWebsite = new JLabel("Website : " + abt.displayWebsite());
		lblWebsite.setBounds(44, 457, 340, 14);
		aboutFrame.getContentPane().add(lblWebsite);
				
				
		//aboutFrame.setVisible(true);
				
		
		
	}
}
