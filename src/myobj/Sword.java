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
			
			System.out.println("��ȭ ����");
			System.out.printf("���� ��ȭ ���: %d\n", this.reinforce);
			System.out.printf("���� ���ݷ�: %.2f\n" , this.damage);
			
		} else if ( this.rfFail * this.reinforce <= rfFailRn) {
			System.out.println("��ȭ ����, ��ȭ ��� �϶�");
			this.damage -= this.rfDamage;
			this.reinforce--;
			System.out.printf("���� ��ȭ ���: %d\n", this.reinforce);
			System.out.printf("���� ���ݷ�: %.2f\n" , this.damage);
			
		} else {
			System.out.println("�ƹ��� ��ȭ�� �����ϴ�.");
		}
		
	}
	
	void seeDamage() {
		System.out.printf("���� ���ݷ���: %.2f�Դϴ�.", this.damage);
	}
	
	
}
