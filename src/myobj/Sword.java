package myobj;

public class Sword {
	
	double damage = 100;
	int reinforce = 0;
	double rfProbability = 1000;
	double rfDamage = damage * 1.2;
	double rfFail = 0.02 * 100;

	void reinforce() {
		int rfRn = (int)(Math.random() * 101);
		int rfFailRn = (int)(Math.random() * 101);
		
		if (this.rfProbability / (3 *(this.reinforce + 1))  >= rfRn) {
			this.reinforce++;
			this.rfDamage *= this.reinforce; 
			this.damage +=this.rfDamage;
			
			System.out.println("강화 성공");
			System.out.printf("현재 강화 등급: %d\n", this.reinforce);
			System.out.printf("현재 공격력: %.2f\n" , this.damage);
			
		} else if ( this.rfFail * this.reinforce <= rfFailRn) {
			System.out.println("강화 실패, 강화 등급 하락");
			this.damage -= this.rfDamage;
			this.reinforce--;
			System.out.printf("현재 강화 등급: %d\n", this.reinforce);
			System.out.printf("현재 공격력: %.2f\n" , this.damage);
			
		} else {
			System.out.println("아무런 변화가 없습니다.");
		}
		
	}
	
	void seeDamage() {
		System.out.printf("현재 공격력은: %.2f입니다.", this.damage);
	}
	
	
}
