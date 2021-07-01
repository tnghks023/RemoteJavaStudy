package myobj.pirate;

public class Graphic {

	public static void printTong(MrTong tong) {
		
		boolean[] stabbed = tong.getStabbed();
		
		for(int i = 0, len =stabbed.length; i <len ; i++) {
			
			System.out.print(!stabbed[i] ? "O  " : "X  ");
			
			if(i % 15 == 14) {
				System.out.println();
			}
			
		}
	}
	
}
