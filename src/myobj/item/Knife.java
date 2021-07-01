package myobj.item;


public class Knife extends Item {
	
	
	public Knife(String name, int price) {
		super(name, price);
	}

	public void use() {
		System.out.println(this.name + "·Î ÀÚ¸§.");
		
	}
}