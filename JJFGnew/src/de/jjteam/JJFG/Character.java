package de.jjteam.JJFG;

import java.util.Random;

public class Character {
	// vars:
	private String name = null;
	private int hp;
	private int maxHp;
	private int maxMana;
	private int mana;
	private int baseAtt = 100;

	// get vars:
	public int getA1() {
		mana += 15;
		return baseAtt * (15 / 100);
	}

	public int getA2() {// 30
		mana -= 30;
		return baseAtt * (40 / 100);
	}

	public int getA3() {// 50
		mana -= 50;
		return baseAtt * (75 / 100);
	}

	public int getD1() {
		return 0;
	}

	public int getD2() {
		mana -= 20;
		return 30;
	}

	public int getD3() {
		mana -= 40;
		return 75;
	}

	public boolean canAtt(int i) {
		switch (i) {
		case 1:
			return true;
		case 2:
			return mana >= 30;
		case 3:
			return mana >= 50;
		default:
			return false;
		}
	}

	public boolean canDef(int i) {
		switch (i) {
		case 1:
			return true;
		case 2:
			return mana >= 20;
		case 3:
			return mana >= 40;
		default:
			return false;
		}
	}

	public String getName() {
		return this.name;
	}

	public int getHP() {
		return this.hp;
	}

	public int getMana() {
		return this.mana;
	}

	public int getMaxMana() {
		return this.maxMana;
	}
	
	public int levelUp() {
		Random math = new Random();
		int i = math.nextInt(2);
		switch(i) {
		case 0:
			hp += 10;
			return 0;
		case 1:
			mana += 10;
			return 1;
		case 2:
			baseAtt += 10;
			return 2;
		default:
			hp += 10;
			return 0;
		}
		
	}

	// subtract
	public void subHP(int hp) {
		Random r = new Random();
		int def = r.nextInt(2);
		switch(def) {
		case 0:
			de
		}
		this.hp -= hp;
	}
	
	public void subHP(int hp, int deff) {
		this.hp -= hp;
	}

	// initial & constructor

	public Character(String name, int maxHp, int maxMana) {
		this.name = name;
		this.maxHp = maxHp;
		this.maxMana = maxMana;
	}

	public void reset() {
		mana = maxMana;
		hp = maxHp;
	}

}
