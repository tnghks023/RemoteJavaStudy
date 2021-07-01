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
		System.out.println("¦�� �Դϴ�.");
	} else {
		System.out.println("Ȧ�� �Դϴ�.");
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
// � �Լ��� �ڱ� �ڽ��� �ҷ��� ����ϴ� ���� ����Լ���� �θ���. (���� ������, �Ѹ�)
public static int resursive_fac(int num) {
	if (num == 1) {
		return 1;
	}
	
	return num * resursive_fac(num-1);
}
}
