package myobj;

public class Character {

	String name;
	double maxHp;
	double hp;
	double maxMp;
	double mp;
	double damage;
	int level;
	int levelUpExp = 20;
	int exp;
	
	

	public Character(String name) {
		this.name = name;
		this.maxHp = 50;
		this.hp = 50;
		this.maxMp = 10;
		this.mp = 10;
		this.damage = 3;
		this.level = 1;
	}
	public void  Character() {
		this.maxHp = 50;
		this.hp = 50;
		this.maxMp = 10;
		this.mp = 10;
		this.damage = 3;
		this.level = 1;
	}
	

	void attact(Enemy a) {
		this.hp -= this.damage;
		if(this.hp <= 0) {
			System.out.println("YOU DIED");
			System.out.println("ĳ���͸� �ʱ�ȭ �մϴ�.");
			Character();
			return;
		}
		a.hp -= this.damage;
		if(a.hp<= 0) {
			a.hp = 0;
			System.out.println("���� �׾����ϴ�.");
		} else {
			System.out.printf("���ü��: %.1f\n",a.hp);
		}
		
		System.out.printf("����ü��: %.1f\n", this.hp);
		if(a.hp==0) {
			a.revive();
		}
		this.exp += 5;
		if (exp >= levelUpExp) {
			levelUp();
		}
		System.out.println("���� ����ġ: " + (this.levelUpExp - this.exp));
		
		
	}

	void levelUp() {
		System.out.println("������");
		this.level++;
		this.hp = maxHp * 1.1;
		this.maxHp = this.hp;
		this.mp = maxMp * 1.1;
		this.maxMp = this.mp;
		this.damage *= 1.1;
		this.levelUpExp = level * 20;
		this.exp = 0;
		System.out.printf("level: %d, hp: %.1f, mp: %.1f, damage: %.1f\n", this.level, this.hp, this.mp, this.damage);
	}
	

}
