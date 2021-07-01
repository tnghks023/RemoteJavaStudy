import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class D08_String {

	public static void main(String[] args) {

		String fruits = "apple/banana/orange/pineapple/kiwi";
		
		//splite(delimiter) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환한다.
		String[] splitted = fruits.split("/");
		for(int i = 0; i < splitted.length ; i++) {
			System.out.println(i + ": " + splitted[i] );
		}
		
		//String.join(delim, 이어 붙이고 싶은것) : 여러 문자열을 원하는 구분자를 추가하여 이어붙인다.
		String after = String.join("," , splitted); 
		System.out.println(String.join("-", "연어", "장어","광어", "으락", "도미"));
		
		printRabbitWithMessage("커피", "우유", "주스");
		
		//substring(start) : 문자열을 start 부터 마지막까지 자른다
		//substring(start, end) : 문자열을 start 부터 end미만 까지 인스턴스를 반환
		
		String year = "991231-1234567".substring(0,2);
		String month = "991231-1234567".substring(2,4);
		String date = "991231-1234567".substring(4,6);
		System.out.println(year);
		
		//contains(seq) : 문자열에 해당 문자열이 포함되어 있는지 검사
		String ph = "010-1234-1234";
		System.out.println("ph에 1234포함?" + ph.contains("1234"));
		
		//startWith(seq) : 문자열이 해당 문자열로 시작하는 검사
		System.out.println("ph가 010으로 시작?" + ph.startsWith("010"));
		//endWith(seq) : 문자열이 해당 문자열로 끝나는지 검사
		System.out.println("ph가 4로 끝?" + ph.endsWith("4"));
		
		// replace(old, new) : 문자열을 다른 문자열로 교체한 인스턴스를 반환한다
		String result = ph.replace("1234", "abcd");
		System.out.println("원본: " + ph + ", 결과 : " + result);
		
		// getBytes() : 문자열을 byte[]로 변환한다 (데이터 전송 준비)
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("안녕하세요".getBytes()));
		
		// 어떤 규칙(인코딩 타입)을 사용해 byte[]로 변환할지 결정할 수 있다
		try {
			System.out.println(Arrays.toString("안녕하세요".getBytes("UTF-8")));
			System.out.println(Arrays.toString("안녕하세요".getBytes("UTF-16")));
			System.out.println(Arrays.toString("안녕하세요".getBytes("EUC-KR")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//byte[]로 나눠졌던 데이터들을 다시 문자열로 합칠 수 있다
		byte[] message = "안녕하세요 반갑습니다.".getBytes();
		
		System.out.println(new String(message));
		
		//trim() : 문자열 바깥쪽의 공백을 제거해준다.
		String user_input = " java \n";
		String answer = "java";
		System.out.println(user_input.trim().equals(answer));
		
		//toUpperCase() : 대문자로 변환
		//toLowerCase() : 소문자로 변환
		String text = "hello, java";
		System.out.println(text.toUpperCase());
		
		//indexOf(seq) : 원하는 문자열의 인덱스를 반환.
		//indexOf(seq, start) : 시작위치부터 원하는 문자열의 인덱스를 반환.
		String languages = "Java, Python, C, C++, C#, kotlin, JavaScript";
		
		languages += languages; 
		languages += languages; 
		languages += languages; 
				
		ArrayList<Integer> strList = new ArrayList<>();
		int i = 0;
		while(true) {
			i = languages.indexOf("Java", i+1);
			if(i == -1) {
				break;
			}
			strList.add(i);
		}
		System.out.println(strList.toString());
		
	}
	// Type... : 가변인자, 정해지지 않은 개수의 인자를 해당 타입 배열로 넘겨받을 수 있다.
	// 가변인자는 항상 메서드의 마지막에 정의해야 한다.
	static void printRabbitWithMessage(String... msgs ) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >)");
		System.out.println(Arrays.toString(msgs));
	}
	
}
