package de.jjteam.JJFG;

import javax.swing.*;

public class Game {

	static JFrame gameframe;
	JLabel l = new JLabel();

	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();

	public static void startgame(String name, int maxhp, int maxMana) {

		Character enemy = new Character(name, maxhp, maxMana);

		gameframe = new JFrame();

		gameframe.setSize(800, 600);
		gameframe.setLocationRelativeTo(null);
		gameframe.setVisible(true);
		gameframe.setLayout(null);
		gameframe.setTitle("JJ Fighting Game");
		gameframe.setResizable(false);
		gameframe.requestFocus();
		gameframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		
		
		Character player = Levelauswahl.pl1;
		player.reset();
		enemy.reset();

	}

}
