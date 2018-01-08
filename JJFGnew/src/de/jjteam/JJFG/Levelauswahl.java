package de.jjteam.JJFG;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Levelauswahl implements ActionListener {

	static JFrame levelframe;
	static JButton a, b, c, d, e, f, g, h, i, j;
	static Character pl1 = new Character("Player", 100, 100);

	public Levelauswahl() {
		
		levelframe = new JFrame();

		a = new JButton("Level Eins");
		b = new JButton("Level Zwei");
		c = new JButton("Level Drei");
		d = new JButton("Level Vier");
		e = new JButton("Level Fünf");
		f = new JButton("Level Sechs");
		g = new JButton("Level Sieben");
		h = new JButton("Level Acht");
		i = new JButton("Level Neun");
		j = new JButton("FINALES LEVEL");
		
		
		levelframe.setSize(715, 375);
		levelframe.setLocationRelativeTo(null);
		levelframe.setVisible(true);
		levelframe.setLayout(null);
		levelframe.setTitle("JJFG - Levelauswahl");
		levelframe.setResizable(false);
		levelframe.requestFocus();
		levelframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		
		
		a.setBounds(25, 25, 200, 50);
		b.setBounds(250, 25, 200, 50);
		c.setBounds(475, 25, 200, 50);
		d.setBounds(25, 100, 200, 50);
		e.setBounds(250, 100, 200, 50);
		f.setBounds(475, 100, 200, 50);
		g.setBounds(25, 175, 200, 50);
		h.setBounds(250, 175, 200, 50);
		i.setBounds(475, 175, 200, 50);
		j.setBounds(25, 250, 650, 50);
		
		levelframe.add(a);
		levelframe.add(b);
		levelframe.add(c);
		levelframe.add(d);
		levelframe.add(e);
		levelframe.add(f);
		levelframe.add(g);
		levelframe.add(h);
		levelframe.add(i);
		levelframe.add(j);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == a){
			
			Game.startgame("Amazing Abbygail", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == b){
			
			Game.startgame("Boozled Bob", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == c){
			
			Game.startgame("Crazy Carl", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == d){
			
			Game.startgame("Destructive Daniel", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == e){
			
			Game.startgame("Energetic Efron", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == f){
			
			Game.startgame("Fuddy Friedolf", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == g){
			
			Game.startgame("Gorgeous Goofy", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == h){
			
			Game.startgame("Hustler Hanni", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == i){
			
			Game.startgame("Intrigue Ixbat", 100, 100);
			levelframe.setVisible(false);
			
		} else if (ae.getSource() == j){
			
			Game.startgame("Jannik Joschka", 100, 100);
			levelframe.setVisible(false);
			
		}
		
	}

}
