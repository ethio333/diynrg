
package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;

public class Intro {
	

	JFrame frame;
	ImageIcon img;
	JLabel imgput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro window = new Intro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Intro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Created by: FKMD");
		frame.getContentPane().add(lblNewLabel_1, BorderLayout.SOUTH);
		
		JButton btnStart = new JButton("Click here to begin");
		frame.getContentPane().add(btnStart, BorderLayout.CENTER);
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				StartPage nxt = new StartPage();
				nxt.frame.setVisible(true);
				
				
				
			}
		});
		
		img = new ImageIcon(getClass().getResource("diynrg.png"));
		JLabel lblNewLabel = new JLabel(img);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		
	
			
		
		
	}
}
