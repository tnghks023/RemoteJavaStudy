package quiz;

public class D04_isJavaVariableCommentary {
	
	public static void main(String[] args) {
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check(str.toCharArray()));
	}
	
	public static boolean check(char[] str) {
		// �ڹ� �������� ù��° ���ڷ� ��������  üũ
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		for (int i =1 ; i < str.length ; i++) {
			// �ڹ� �������� ������ �κ����� �������� üũ
			check  = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}
}
