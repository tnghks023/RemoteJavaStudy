package myobj;

public class Enemy {
	
	double hp;
	double mp;
	double damage;

	
	public Enemy() {
		this.hp = 10;
		this.mp = 10;
		this.damage = 2;
	}
	
	void revive() {
		this.hp = 10;
		this.mp = 10;
		this.damage = 2;
	}
	
}
