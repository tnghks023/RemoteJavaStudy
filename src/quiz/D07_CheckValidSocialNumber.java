package quiz;



public class D07_CheckValidSocialNumber {

	public static void checkSocialNum(String num) {
		String numstr = num;
		boolean check = true;
		boolean leapYear = false;
		if(num.charAt(6) != '-') {
			check = false;
		} else if (num.length() != 14) {
			check = false;
		} else {
			
			num = num.replace("-", "");
			for(int i = 0; i <num.length(); i++) {
				if(!(Character.isDigit(num.charAt(i)))) {
					check = false;
					System.out.println("���ھƴ� ���ڸ� �Է��ϼ̽��ϴ�.");
				} else {
					
				}
			}
			String year = "" + num.charAt(0) + num.charAt(1);
			int yearInt = Integer.parseInt(year);
			
			if(yearInt >= 0 && yearInt <= 21 ) {
				yearInt += 2000;
			} else {
				yearInt += 1900;
			}
			
			if((yearInt % 4 == 0 && yearInt % 100 !=0 )|| yearInt % 400 == 0) {
				leapYear = true;
			}
			
			String month = "" + num.charAt(2) + num.charAt(3);
			int monthInt = Integer.parseInt(month);
			if(!(monthInt >= 1 && monthInt <= 12 )) {
				check= false;
				System.out.println("�ֹι�ȣ ���ڸ��� �߸��Է��߽��ϴ�");
			}
			
			String day = "" + num.charAt(4) + num.charAt(5);
			int dayInt = Integer.parseInt(day);
			
			if(monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11) {
				if(dayInt > 30 || dayInt < 1) {
					check = false;
				}
			} else if(monthInt == 2) {
				if(leapYear) {
					if(dayInt > 29 || dayInt < 1) {
						check = false;
					}
				} else if(dayInt > 28 || dayInt < 1) {
					check = false;
				} 
			} else if(dayInt < 1 || dayInt >31) {
				check = false;
			}
		}

		System.out.println(numstr + "��" + (check ? " ����� �� �ֹι�ȣ�Դϴ�" : " �߸��� �ֹι�ȣ �Դϴ�."));
	}
	
	
	public static void main(String[] args) {
		checkSocialNum("000229-1234433");
	}
	
}
