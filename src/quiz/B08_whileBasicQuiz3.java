package quiz;

public class B08_whileBasicQuiz3 {
	
	public static void main(String[] args) {
		
		int i = 2999;
		
		while(i< 5000) {
			i++;
			if(i % 7 != 0) {
				continue;
			} else {
				System.out.print(i + " ");
			}
			
		}
	}

}
