package quiz.commetary;

public class D07_CheckValidPhoneNumber {

	private static boolean checkNumeric(char[] phoneNumber) {
		for(int i = 0; i < phoneNumber.length ; i++) {
			if ( (i== 3 || i == 8) && phoneNumber[i] == '-') {
				continue;
			} else if ((i != 3 && i != 8 ) &&Character.isDigit(phoneNumber[i])) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void checkValidPhoneNumber(char[] phoneNumber) {


		boolean valid = true;

		String front = "" + phoneNumber[0] + phoneNumber[1] + phoneNumber[2];

		if(front.equals("010")) {
			valid = false;
			System.out.println("맨 앞의 숫자가 허용되지 않는 숫자입니다.");
		} else if(phoneNumber.length != 13) {
			valid = false;
			System.out.println("핸드폰 번호의 길이가 다릅니다.");
		} else if(!checkNumeric(phoneNumber)) {
			valid = false;
			System.out.println("모두 숫자가 아니거나 -의 위치가 이상합니다.");
		}
		System.out.println(new String(phoneNumber) + "는 " + (valid ? "올바른." : "올바르지 않은"));
	}

	public static void main(String[] args) {
		checkValidPhoneNumber("010-1234-1234".toCharArray());
	}
}
