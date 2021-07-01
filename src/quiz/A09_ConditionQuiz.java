package quiz;

public class A09_ConditionQuiz {

		public static void main(String[] args) {
			
			int a= 0;
			int b = 0;
			int c = 0;
			int hour = 0;
			int d = 0;
			int e = 0;
			int year = 0;
			int minsu_age = 0;
			int ironsu_age =0;
			int minsu_birthM = 0;
			int ironsu_birthM =0;
			boolean powerOn = true;
			String str = "yes";
			
			System.out.println(a >= 10 && a <=20);
			System.out.println(b % 2 ==0);
			System.out.println(c % 7 == 0);
			System.out.println(hour <24 && hour >= 12);
			System.out.println(Math.abs(d-e) == 30);
			System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0));
			System.out.println(minsu_age - 2 == ironsu_age);
			System.out.println(minsu_birthM + 3== ironsu_birthM);
			System.out.println(!powerOn);
			System.out.println(str.equals("yes"));
		}
}
