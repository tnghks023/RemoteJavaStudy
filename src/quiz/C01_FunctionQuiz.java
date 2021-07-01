package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {

	public static void main(String[] args) {

		System.out.println(tF('B'));
		System.out.println(multiThree(18));
		even(9);

		System.out.println(Arrays.toString(div(25)));
		System.out.println(prime(7));
		System.out.println(factorial(10));

	}

	public static boolean tF(char text) {

		return (text >= 'A' && text <= 'Z' )|| (text >= 'a' && text <= 'z');

	}

	public static boolean multiThree(int num) {

		return num % 3 ==0;

	}

public static void even(int num) {

	if(num % 2 == 0) {
		System.out.println("짝수 입니다.");
	} else {
		System.out.println("홀수 입니다.");
	}
}


public static int[] div(int num) {

	int cnt = 0;
	int index = 0;
	for (int i = 1; i <= num ; i++)
		if ( num % i == 0) {
			cnt++;
		}

	int[] divisor = new int[cnt];
	for (int i = 1; i <= num ; i++)
		if ( num % i == 0) {
			divisor[index] = i;
			index++;
		}


	return divisor;	
}

public static boolean prime(int num) {

	boolean check = false;
	for(int i = 2; i <= num; i++ ) {
		if(num % i == 0) {
			check = true;
		}
	}


	return check;
}

public static int factorial(int num) {

	int facto = 1;
	for ( int i = 1; i <= num; i++) {
		facto *= i;
	}
	return facto;
}
// 어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다. (성능 안좋음, 겉멋)
public static int resursive_fac(int num) {
	if (num == 1) {
		return 1;
	}
	
	return num * resursive_fac(num-1);
}
}
