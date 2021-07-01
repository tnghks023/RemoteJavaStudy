package quiz;

import java.util.Arrays;

public class B12_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1},
			{1,1},
			{1,1,1,1}
		};
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;

		
		for (int i = 0; i < numArr.length ; i++) {
			for(int j = 0; j < numArr[i].length  ; j++) {
				numArr[i][j] = (int)(Math.random() * 101);
			}
		}
		for (int i = 0; i < numArr.length ; i++) {
			for(int j = 0; j < numArr[i].length  ; j++) {
				System.out.print(numArr[i][j]+ "	");
				sum += numArr[i][j];
				cnt++;
			}
			System.out.println();
		}
		
		avg = sum /(double)cnt;
		System.out.printf("ÃÑÇÕ: %d, Æò±Õ: %.2f\n" , sum, avg);

		int[] rows = new int[numArr.length];
	
		
		for (int i = 0; i < numArr.length ; i++) {
			for(int j = 0; j < numArr[i].length  ; j++) {
				rows[i] += numArr[i][j]; 
			}
		}
		for (int i = 0; i < numArr.length ; i++) {
		System.out.printf("%dÇàÀÇ ÇÕ: %d\n", i+1, rows[i]);
		}
		int max = 0;
		for (int i = 0; i < numArr.length ; i++) {
			if( max < numArr[i].length ) {
				max = numArr[i].length;
			}
		}
		
		int[] column = new int[max];
		
		for(int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
					column[i] += numArr[j][i];

			}
		}

		System.out.println("¿­ÀÇ ÇÕ: " + Arrays.toString(column));
		
	}

}
