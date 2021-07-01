package quiz;

public class B08_whileBasicQuiz4 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		while (i <= 200) {
			
			if( i % 2 !=0 && i % 3!=0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
