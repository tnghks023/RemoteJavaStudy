import java.util.*;
import java.util.Map.Entry;


public class D07_HashMap {

	/*
		# MAP
		 - �����͸� Key �� Value �� ������ �����ϴ� ����� �ڷᱸ��
		 - Key���� ���� Value�� ������ �� �ִ�
		 - Key�� �ߺ��� ������� �ʴ´�
	 */

	public static void main(String[] args) {
		// ù ���� ���׸��� Key �� Ÿ���̰�, �ι�° ���׸��� Value�� Ÿ���̴�
		HashMap<String, String> addr = new HashMap<>();
		// Map.put(key, value)
		// �ʿ� �����͸� �߰��Ѵ�
		// Map.putAll(Map)
		// �ٸ� ���� �����͸� ��� �߰��Ѵ�.
		// Map.putIfAbsent(key, value)
		// ��������� �ְ�, ���� ������ Ŀ���ش� , ������� null����
		addr.put("�츮��", "����� ���۱� �뷮�� 1��");
		addr.put("����", "����Ư���� ������ �������84�� 16 11, 12��");
		addr.put("����2", "����Ư���� ���α� ����3��");

		addr.put("����", "������");// ���� �ٲ�


		System.out.println(addr.get("�츮��"));
		//���� ������ Ÿ�Ե� ����� �� �ִ�.
		HashMap<Integer, Student> students = new HashMap<>();

		students.put(1, new Student());
		students.put(2, new Student());

		System.out.println(students.get(1));

		//�������� Ÿ���� ����� �� �ִ�
		HashMap<String, Object> info = new HashMap<>();

		info.put("�̸�", "ȫ�浿");
		info.put("����", "23");
		info.put("��ȭ��ȣ", "010-1234-1234");
		info.put("�����ϴ°�", new String[] {"��ȭ", "�", "�ܹ���"});
		info.put("ģ�� ���", new ArrayList<>());
		
//		ArrayList<String> friends = (ArrayList<String>) info.get("ģ�� ���");
//		
//		friends.add("ö��");
//		friends.add("����");
//		friends.add("�μ�");
		
		((ArrayList<String>) info.get("ģ�� ���")).add("ö��");
		((ArrayList<String>) info.get("ģ�� ���")).add("����");
		((ArrayList<String>) info.get("ģ�� ���")).add("�μ�");
		
		/*
			# �ݺ������� MapŸ�� Ȱ���ϱ�
			 - Map.KeySet() : Key��� �̷���� Set�� ��ȯ�Ѵ�
			 - Map.values() : ����� �̷���� Set�� ��ȯ�Ѵ�.
			 - Map.entrySet() : Entry<Key, value>�� �̷��� Set�� ��ȯ�Ѵ�
		 */

		System.out.println(info.keySet());
		
		for(String key : info.keySet()) {
			System.out.println(info.get(key));
		}
		
		System.out.println("--------------------------------");
		
		System.out.println(info.values());
		
		List value_list = new ArrayList<>(info.values());
		System.out.println(value_list);
		
		for(Object value : info.values()) {
			System.out.println(value);
		}
		
		
		System.out.println("--------------------------------");
		for( Entry<String, Object> entry : info.entrySet()) {
			System.out.println(entry.getKey() + "\t: ");
			System.out.println(entry.getValue());
		}
		
		
	}

}


