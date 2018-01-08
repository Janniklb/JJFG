package de.jjteam.JJFG;

public class Fight {

	boolean pswitch = true;
	Game game;
	Character player;
	Character enemy;
	
	public Fight(Character player, Character enemy, Game game) {
		this.player = player;
		this.enemy = enemy;
		this.game = game;
		game.l.setText("Angrif wählen");
		
		game.b1.setText("Leichter Angriff");
		game.b2.setText("Mittlerer Angriff");
		game.b3.setText("Schwerer Angriff");
	}
	
	public boolean click(int i) {
		if(Levelauswahl.pl1.getHP() > 0 && enemy.getHP() > 0) {
			if(pswitch) {
				switch(i) {
				case 1:
					if(player.canAtt(i)) {
						enemy.subHP(player.getA1());
					}else {
						return false;
					}
					break;
				case 2:
					if(player.canAtt(i)) {
						enemy.subHP(player.getA1());
					}else {
						return false;
					}
					break;
				case 3:
					if(player.canAtt(i)) {
						enemy.subHP(player.getA1());
					}else {
						return false;
					}
					break;
				}
				
			}else {
				
			}
		}
		return true;
	}

}
