package myinterface;

class Bicycle implements Vehicle {

	int accNum;
	int numberBoard;
	
	public int acceleration() {
		accNum++;
		return accNum;
	}
	
	public int deceleration() {
		accNum--;
		return accNum;
	}

	public boolean ride() {
		numberBoard++;
		if (numberBoard > 3) {
		return false;
		} else {
			return true;
		}
	}
}
