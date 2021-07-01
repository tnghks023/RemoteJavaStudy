package quiz;

import java.util.Scanner;

public class B05_Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력: ");
		String word = sc.next();
		
		int word_length = word.length();
		int cnt = 0;
		for(int i = 0 ; i <= word_length/2; i++ ) {
			if(word.charAt(i) == word.charAt(word_length - 1 - i)) {
				cnt += 1;
			}
		}
		if (word_length % 2 == 0) {
			cnt--;
		}
		
		if (cnt == (word_length+ 1) / 2) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NO PALINDROME");
		}
		
		
	}
}
