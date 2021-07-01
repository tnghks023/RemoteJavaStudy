package myinterface;

public class WirelessEarphone implements ElectroDevice {
	
	boolean check;
	int battery;
	
	public void turn() {
		if(check) {
			check = false;
		} else {
			check = true;
		}
		
		if(check) {
			System.out.println("Àü¿øÀ» ÄÕ´Ï´Ù.");
		} else {
			System.out.println("Àü¿øÀ» ²ü´Ï´Ù");
		}
	}
	

	public int charge() {
		if(battery >= 100) {
			battery = 100;
		} else {
			battery++;
		}
		return battery;
	}

}
