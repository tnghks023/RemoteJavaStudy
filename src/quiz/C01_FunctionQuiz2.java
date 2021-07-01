package quiz;

public class C01_FunctionQuiz2 {

	/*
		1. �ִ밪�� �Ű������� ���޹����� 0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� range �Լ��� �����
		ex) range(10)�� ��� -> [0,1,2,3,4,5,6,7,8,9]
 	
 		2. �ּҰ��� �ִ밪�� �Ű������� ���޹����� �� ���̿� �����ϴ� ��� �������� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range �Լ��� �����.
 		ex)(5,10)�� ��� -> [5,6,7,8,9]
 		
 		3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹����� �ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int�迭 �����Ͽ� ��ȯ�ϴ� range�Լ� �����
 		ex)(40, 50, 3)  : 40 43 46 49
 		(40,45,5) : 40
 	
	 */
	
	
	
	
	public static void main(String[] args) {
		

	}

	public static int[] range(int num) {

		int[] result = new int[num];
		for(int i=0; i< num; i++) {
			result[i] = i;
		}
		return result;
	}
	public static int[] range2(int start, int end) {

		int increase = start > end ? -1 : 1;
		int[] arr = new int[increase < 0 ? start - end : end - start];
		
		for ( int value = start , index = 0; value != end; value += increase) {
			arr[index++] = value;
		}
		return arr;
		
		
	}

	public static int[] range(int start, int end, int increase) {
        if (increase < 0 && start <= end) {
                return null;
        } else if (increase > 0 && start >= end) {
                return null;
        } else if (increase == 0) {
                return null;
        }
        
        int size;
        
        if (increase > 0) {
                int range = end - start;
                size = range % increase == 0 ? range / increase : range / increase + 1; 
        } else {
                int range = start - end;
                size = range % (increase * -1) == 0 ? 
                                range / (increase * -1) : range / (increase * -1) + 1;
        }
         
        System.out.println("size:  " + size);
        int[] arr = new int[size];
        
        for (int value = start, index = 0; 
                        increase > 0 ? value < end : value > end; value += increase) {
                                        
                arr[index++] = value;
                System.out.printf("arr[%d] : %d\n", index - 1, value);
        }                
        return arr;                
}
}
