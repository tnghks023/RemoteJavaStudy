import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
		# ����ǥ���� (Regular Expression)
		 - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
		 - Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�.
		 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�.
		 
		# Java���� ����ǥ������ �ٷ궧 ����ϴ� Ŭ����
		 - Pattern
		 - Matcher
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regax�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �ü� �ִ��� �����ϴ� ǥ����
		// ��ҹ��� ������
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]eep", "saeep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijk]", "saeep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijkABCDEFG]", "saeeK"));
		
		/*
			[abc] : �ش��ڸ��� a �Ǵ� b �Ǵ� c�� ����Ѵ�. 
			[^abc] : �ش� �ڸ��� abc�� ������ ��� ���� ���
			[a-z] : a���� z���� ��� ���
			[A-Z] : A���� Z���� ��� ���
			[\\-] : ���ڷκ��� -�� ��� (Escape)
			[a-e&&c-z] : a-e �� c-z�� ��� ������Ű�� ���ڸ� ���(������)
			
		 */
		
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]", "saeep"));
		
		/*
			# �ϳ��� ���� ���ڸ� ��Ÿ���� �� 
			 . : ��� ���� 		* [.] : �׳� . |  \. : �׳� .
			 \d : ��� ���� , \�ѹ� �� �ٿ����� 
			 \D : ���ڸ� ������ ���� 
			 \s : ��� ���� (\t, \n, \r, ' ')
			 \S : ������ ������ ����
			 \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 */
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		
		/*
			# �ش� ������ ����� ������ ������ �����ϴ� ���
			
			 [a]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
			 [.]{n,m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ �ؾ��Ѵ�. �����̽��� ����
			 [.]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�.
			 [.]? : ���� ������ 0�� �Ǵ� 1�� ���;���
			 [+]+ : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�.
			 [+]* : * ���� ������ 0�� �̻� ���;� �Ѵ�.
			 
		 */
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", "abc.."));
		System.out.println(Pattern.matches("[.]{2,5}", "....."));
		System.out.println(Pattern.matches("s?heep", "sheep")); // true
		System.out.println(Pattern.matches("s?heep", "heep")); // true
		System.out.println(Pattern.matches("s?heep", "ssheep")); // false
		System.out.println(Pattern.matches("s?heep", "kheep")); // false
		
		System.out.println(Pattern.matches("s+heep", "sssssheep")); // true
		System.out.println(Pattern.matches("s+heep", "heep")); // false
		
		// �������� : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("010-?\\d{4}-?\\d{4}", "010-1111-1111"));
		System.out.println(Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", "01011111111"));
		
		// �������� : �ش� ���ڿ��� �ֹε�Ϲ�ȣ
		System.out.println(Pattern.matches("\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[1-4]\\d{6}", "950512-1111111"));
		
		// ������� : �ش� ���ڿ��� �̸������� �˻��Ҽ� �ִ� ����ǥ����
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?", "asd12322@kor.com"));
		
		// Mathcher ����ؼ� �� ���ڿ� �˻��ϱ�
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("a.{2}le");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true

		while (matcher.find()) {
			System.out.println("ã�� ��: " + matcher.group());
			System.out.println("��ġ: " + matcher.start() + "���� " + matcher.end());
			System.out.println(fruit.substring(matcher.start(), matcher.end()));
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
