
package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import backend.CFL;
import backend.GlassFiber;
import backend.Glazed;
import backend.Halogen;
import backend.LED;
import backend.MineralWool;
import backend.SprayFoam;
import backend.Thermal;

import javax.swing.JButton;

public class OptionPage {

	JFrame frame;
	int userOption;
	LED LedOption = new LED(0);
	CFL CflOption = new CFL(0);
	Halogen hlgOption = new Halogen(0);
	MineralWool mwOption = new MineralWool(0,0);
	GlassFiber gfOption = new GlassFiber(0,0);
	SprayFoam sfOption = new SprayFoam(0,0);
	Glazed glzOPtion = new Glazed(0,0);
	Thermal thOption = new Thermal(0,0);
	String optionChoice1;
	String optionChoice2;
	String optionChoice3;
	float priceChoice1;
	float priceChoice2;
	float priceChoice3;
	String replace = "xxxx";
	

	public OptionPage(int op) {
		
		userOption = op;
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
		
		
		if (userOption == 1){//bulbs
			optionChoice1 = LedOption.name();
			optionChoice2 = CflOption.name();
			optionChoice3 = hlgOption.name();
			priceChoice1 = LedOption.getLEDcost();
			priceChoice2 = CflOption.getCFLcost();
			priceChoice3 = hlgOption.getHalogenCost();
			
			
		}
		if (userOption == 2){//insulation
			optionChoice1 = mwOption.name();
			optionChoice2 = gfOption.name();
			optionChoice3 = sfOption.name();
			priceChoice1 = mwOption.getMineralWoolcost();
			priceChoice2 = gfOption.getGlassFibercost();
			priceChoice3 = sfOption.getSprayFoamcost();
			
		}
		if (userOption == 3){//windows
			optionChoice1 = glzOPtion.name();
			optionChoice2 = thOption.name();
			optionChoice3 = "in progress";
			priceChoice1 = glzOPtion.getGlazedcost();
			priceChoice2 = thOption.getThermalcost();
			priceChoice3 = 0;
			
		}
		//if (choice.option == 2){// insulation
			
			/*MineralWool option1 = new MineralWool(0,0);
			choiceOptions1 = option1.name();
			GlassFiber option2 = new GlassFiber(0,0);
			choiceOptions2 = option2.name();
			SprayFoam option3 = new SprayFoam(0,0);
			*/
		//}
		//if (choice.option == 3){// windows
			
			//Glazed option1 = new Glazed(0,0);
			//option1 = option1.name();
			//Thermal option2 = new Thermal(0,0);
			//choiceOptions2 = option2.name();
			
		//}
		
		//System.out.println();
		
		//System.out.println(optionChoice1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(optionChoice1);
		rdbtnNewRadioButton.setBounds(20, 94, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(optionChoice2);
		rdbtnNewRadioButton_1.setBounds(20, 169, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		if (userOption == 3){
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(optionChoice3);
			rdbtnNewRadioButton_2.setBounds(20, 246, 109, 23);
			frame.getContentPane().add(rdbtnNewRadioButton_2);
		}
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(optionChoice3);
		rdbtnNewRadioButton_2.setBounds(20, 246, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//PricePage nxt = new PricePage(priceChoice1);
				if (rdbtnNewRadioButton.isSelected()){
					
					PricePage nxt = new PricePage(priceChoice1);
					frame.setVisible(false);
					nxt.frame.setVisible(true);
					
				}
				if (rdbtnNewRadioButton_1.isSelected()){
					PricePage nxt = new PricePage(priceChoice2);
					frame.setVisible(false);
					nxt.frame.setVisible(true);
				}
				if (rdbtnNewRadioButton_2.isSelected()){
					
					PricePage nxt = new PricePage(priceChoice3);
					frame.setVisible(false);
					nxt.frame.setVisible(true);
				}
				
			}
		});
		btnNext.setBounds(322, 452, 89, 23);
		frame.getContentPane().add(btnNext);
		JButton btnBack2 = new JButton("Back");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartPage back = new StartPage();
				back.frame.setVisible(true);
				frame.setVisible(false);
				
				
				
			}
		});
		btnBack2.setBounds(10, 456, 89, 23);
		frame.getContentPane().add(btnBack2);
		
	}
}
