package quiz;

import java.util.Scanner;

public class B02_CheckWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요: ");
		String word = sc.next();
		char firstWord = word.charAt(0);
		char lastWord = word.charAt(word.length()-1);
		
		if ((firstWord >= 'A' && firstWord <= 'Z' || firstWord >= 'a' && firstWord <= 'z' )	&& firstWord == lastWord) {
			
			System.out.println("OK");
			
		} else {
			System.out.println("NOT OK");
		}
		
		
		

	}

}
