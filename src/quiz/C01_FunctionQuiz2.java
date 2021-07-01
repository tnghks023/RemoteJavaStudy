package quiz;

public class C01_FunctionQuiz2 {

	/*
		1. 최대값을 매개변수로 전달받으면 0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는 range 함수를 만들기
		ex) range(10)의 결과 -> [0,1,2,3,4,5,6,7,8,9]
 	
 		2. 최소값과 최대값을 매개변수로 전달받으면 그 사이에 존재하는 모든 정수값을 포함하는 int배열을 생성하여 반환하는 range 함수를 만들기.
 		ex)(5,10)의 결과 -> [5,6,7,8,9]
 		
 		3. 최소값과 최대값과 증가값을 매개변수로 전달받으면 최소값부터 최대값 미만까지 증가값만큼 증가하는 int배열 생성하여 반환하는 range함수 만들기
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
