package quiz;

public class D04_isJavaVariableCommentary {
	
	public static void main(String[] args) {
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check(str.toCharArray()));
	}
	
	public static boolean check(char[] str) {
		// 자바 변수명의 첫번째 글자로 적합한지  체크
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		for (int i =1 ; i < str.length ; i++) {
			// 자바 변수명의 나머지 부분으로 적합한지 체크
			check  = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}
}
