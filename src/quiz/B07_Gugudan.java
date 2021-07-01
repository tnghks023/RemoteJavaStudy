package quiz;

public class B07_Gugudan {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9 ; i++) {
			System.out.printf("%d´Ü: ", i);
			for(int j = 1; j<=9 ; j++) {
				System.out.printf("%dx%d=%d ", i, j , i*j);
			}
			System.out.println();
		}
		
		
			
		
		for(int i = 2; i<=9 ; i++) {
			System.out.printf("%d´Ü 	", i);
		}
		System.out.println();
		for(int i = 1; i<=9 ; i++) {
			for(int j=2; j <=9 ; j++) {
				System.out.printf("%dx%d=%d	", j, i, i*j);
			}
			System.out.println();
		}
		
	}

}
