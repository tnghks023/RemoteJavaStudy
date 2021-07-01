package myobj.item;

public class Pill extends Item {
	
	public Pill(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void use() {
		System.out.println(this.name + " º¹¿ëÇÔ");
		
	}
}
