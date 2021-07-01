import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

public class D08_String {

	public static void main(String[] args) {

		String fruits = "apple/banana/orange/pineapple/kiwi";
		
		//splite(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�.
		String[] splitted = fruits.split("/");
		for(int i = 0; i < splitted.length ; i++) {
			System.out.println(i + ": " + splitted[i] );
		}
		
		//String.join(delim, �̾� ���̰� ������) : ���� ���ڿ��� ���ϴ� �����ڸ� �߰��Ͽ� �̾���δ�.
		String after = String.join("," , splitted); 
		System.out.println(String.join("-", "����", "���","����", "����", "����"));
		
		printRabbitWithMessage("Ŀ��", "����", "�ֽ�");
		
		//substring(start) : ���ڿ��� start ���� ���������� �ڸ���
		//substring(start, end) : ���ڿ��� start ���� end�̸� ���� �ν��Ͻ��� ��ȯ
		
		String year = "991231-1234567".substring(0,2);
		String month = "991231-1234567".substring(2,4);
		String date = "991231-1234567".substring(4,6);
		System.out.println(year);
		
		//contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻�
		String ph = "010-1234-1234";
		System.out.println("ph�� 1234����?" + ph.contains("1234"));
		
		//startWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ� �˻�
		System.out.println("ph�� 010���� ����?" + ph.startsWith("010"));
		//endWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻�
		System.out.println("ph�� 4�� ��?" + ph.endsWith("4"));
		
		// replace(old, new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�
		String result = ph.replace("1234", "abcd");
		System.out.println("����: " + ph + ", ��� : " + result);
		
		// getBytes() : ���ڿ��� byte[]�� ��ȯ�Ѵ� (������ ���� �غ�)
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes()));
		
		// � ��Ģ(���ڵ� Ÿ��)�� ����� byte[]�� ��ȯ���� ������ �� �ִ�
		try {
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-8")));
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-16")));
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("EUC-KR")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ִ�
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		
		System.out.println(new String(message));
		
		//trim() : ���ڿ� �ٱ����� ������ �������ش�.
		String user_input = " java \n";
		String answer = "java";
		System.out.println(user_input.trim().equals(answer));
		
		//toUpperCase() : �빮�ڷ� ��ȯ
		//toLowerCase() : �ҹ��ڷ� ��ȯ
		String text = "hello, java";
		System.out.println(text.toUpperCase());
		
		//indexOf(seq) : ���ϴ� ���ڿ��� �ε����� ��ȯ.
		//indexOf(seq, start) : ������ġ���� ���ϴ� ���ڿ��� �ε����� ��ȯ.
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
	// Type... : ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�.
	// �������ڴ� �׻� �޼����� �������� �����ؾ� �Ѵ�.
	static void printRabbitWithMessage(String... msgs ) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >)");
		System.out.println(Arrays.toString(msgs));
	}
	
}
