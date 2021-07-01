package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력: ");
		
		String str = sc.nextLine();
		
		int[] alphabetLower = new int[26];
		int[] alphabetUpper = new int[26];
		
		for(int i = 0; i < str.length() ; i++) {
			for(int j = 65; j <= 90; j++) {
				if(str.charAt(i) == j) {
					alphabetUpper[j-65]++;
				}
			}
			for(int j = 97 ; j <= 122; j++) {
				if(str.charAt(i) == j) {
					alphabetLower[j-97]++;
				}
			}
		}
		
		for(int i = 65; i <= 90; i++) {
			char alphabet = (char)i;
			System.out.println(alphabet + ": "+ alphabetUpper[i-65]);
		}
		System.out.println("===========================================================");
		for(int i = 97; i <= 122; i++) {
			char alphabet = (char)i;
			System.out.println(alphabet + ": "+ alphabetLower[i-97]);
		}

	}

}
