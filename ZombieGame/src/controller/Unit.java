package controller;

public abstract class Unit {
	private int hp;
	private int power;
	private int position;

	public Unit(int hp, int power, int position) {
		this.hp = hp;
		this.power = power;
		this.position = position;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
