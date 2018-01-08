package de.jjteam.JJFG;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Startmenue implements ActionListener {

	static JFrame mainframe;
	static JButton startgame, developers, exit;

	public Startmenue() {

		mainframe = new JFrame("JannikJoschkaFightingGame");

		startgame = new JButton("Start Game");
		developers = new JButton("Developers");
		exit = new JButton("Exit Game");
		
		mainframe.setSize(315, 375);
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);
		mainframe.setLayout(null);
		mainframe.setTitle("JJ Fighting Game");
		mainframe.setResizable(false);
		mainframe.requestFocus();
		mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		startgame.addActionListener(this);
		developers.addActionListener(this);
		exit.addActionListener(this);
		
		startgame.setBounds(50, 25, 200, 75);
		developers.setBounds(50, 125, 200, 75);
		exit.setBounds(50, 225, 200, 75);

		mainframe.add(startgame);
		mainframe.add(developers);
		mainframe.add(exit);


	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == startgame){
			//startgame
			new Levelauswahl();
			mainframe.dispose();
		}else if(ae.getSource() == developers) {
			//start developer screen
		}else if(ae.getSource() == exit) {
			//exit the game
			mainframe.dispose();
		}
		
	}
	
	

}
