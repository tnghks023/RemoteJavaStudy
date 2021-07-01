package myobj.item;

public class Water extends Item {

	public Water(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void use() {
		System.out.println(this.name + " ¸¶½É");		
	}

}
