/**
 * Introduction class for ui
 * 
 * @author Fasil Ayenew
 */

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

public class intro {
	

	JFrame frame;
	ImageIcon img;
	ImageIcon img2;
	JLabel imgput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					intro window = new intro();
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
	public intro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		img = new ImageIcon(getClass().getResource("diynrg.png"));
		JLabel lblNewLabel = new JLabel(img);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		img2 = new ImageIcon(getClass().getResource("fkmdmotto.png"));
		JLabel lblNewLabel2 = new JLabel(img2);
		frame.getContentPane().add(lblNewLabel2, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Start");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StartPage nxt = new StartPage();
				frame.setVisible(false);
				nxt.frame.setVisible(true);
				
				
			}
		});
		
		
	}
}
