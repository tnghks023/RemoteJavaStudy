package quiz;

import java.util.Scanner;

public class D07_CheckValidPhoneNumber {

	/*
	 	사용자로부터 입력받은 문자열이 핸드폰 번호인지 구분하는 프로그램.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력");
		String num = sc.nextLine();
		String[] numSplit = num.split("-");
		if(num.charAt(3) != '-' || num.charAt(8) != '-' || num.length() > 13) {
			System.out.println("잘못입력 했습니다.");
		} else if(numSplit[0] != "010" || numSplit[0] != "016" || numSplit[0] != "019"){
			System.out.println("번호 앞자리를 잘못 입력했습니다.");
		} else {
			num = num.replace("-", "");

			if(num.length() != 11) {
				System.out.println("전화번호 길이가 잘못됐습니다");
			} else {
				for(int i = 0; i < num.length() ; i++) {
					if( !(num.charAt(i) >= '0' && num.charAt(i) <= '9') ) {
						System.out.println("번호입력을 잘못했습니다.");
						break;
					}
				}
				System.out.println("전화번호가 제대로 입력됐습니다.");
			}
		}
	}

}
