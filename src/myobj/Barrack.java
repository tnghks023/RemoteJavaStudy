package myobj;

public class Barrack {
	
	final int MAX_QUEUE_SIZE = 5;

	Unit[] queue;
	int queue_index;
	
	Barrack() {
		queue = new Unit[5];
		
	}
	
	boolean checkQueue() {
		return queue_index == MAX_QUEUE_SIZE;
	}
	
	void createSheep() {
		if (checkQueue()) {
			System.out.println("생산 대기열 초과");
			return;
		}
		queue[queue_index++] = new Unit("양", 5);		
	}
	
	void createCow() {
		if (checkQueue()) {
			System.out.println("생산 대기열 초과");
			return;
		}
		queue[queue_index++] = new Unit("소", 7);
	}

}
