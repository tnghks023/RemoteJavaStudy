package myobj.item;

public class Main {

	int money;
	public Main() {
		money = 10000;
	}
	
	public void purchase(Item item) {
		this.money -= item.price;

	}
	
	public static void main(String[] args) {
		
		Knife k1 = new Knife("Àå¹ÌÄ®", 15000);
		k1.info();
		k1.use();
		
		Pill p1 = new Pill("¿µ¾çÁ¦", 16000);
		p1.info();
		p1.use();
		
		Water w1 = new Water("»ï´Ù¼ö", 500);
		w1.info();
		w1.use();
	}

}
