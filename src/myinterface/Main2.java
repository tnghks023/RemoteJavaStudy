package myinterface;

public class Main2 {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		WirelessEarphone airpods = new WirelessEarphone();
		
		sp.turn();
		for(int i =0 ; i <10; i++) {
			System.out.println("배터리가 " + sp.charge() + "% 충전됨");
		}
		sp.turn();
		
		airpods.turn();
		for(int i =0 ; i <10; i++) {
			System.out.println("배터리가 " + airpods.charge() + "% 충전됨");
		}
		airpods.turn();
		

	}

}
