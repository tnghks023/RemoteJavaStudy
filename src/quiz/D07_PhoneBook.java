package quiz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

import quiz.D07_PhoneBook.Info;

public class D07_PhoneBook {

	public static class Info {
		String name;
		String email;

		public Info(String name, String email) {
			this.name = name;
			this.email = email;
			
		}
		public String toString() {
			
			return "�̸�: " + name + "\n�̸���: " + email;
		}

	}
	
	HashMap<String, HashMap<String, Info>> phonebook;
	
	
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
	}

	public void groupGener(String group) {
		phonebook.put(group, new HashMap<String, Info>());
	}

	public void addNum(String group, Info info, String num) {
		phonebook.get(group).put(num, info);
	}

	public void containName(String name) {
		for(Entry<String, HashMap<String, Info>> entry : phonebook.entrySet() ) {
			for(Entry<String, Info> entryin : entry.getValue().entrySet()) {
				if(entryin.getValue().name.contains(name)) {
					System.out.println("�׷�: " + entry.getKey());
					System.out.println("��ȭ��ȣ: " + entryin.getKey());
					System.out.println(entryin.getValue());
					System.out.println("=====================================");
				}
			}
		}
	}
	
	public void containNum(String getNum) {
		for(Entry<String, HashMap<String, Info>> entry : phonebook.entrySet() ) {
			for(Entry<String, Info> entryin : entry.getValue().entrySet()) {
				if (entryin.getKey().contains(getNum)) {
					Info info = entryin.getValue();
					System.out.println("�׷�: " + entry.getKey());
					System.out.println("��ȭ��ȣ: " + entryin.getKey());
					System.out.println(info);
					System.out.println("=====================================");
				}
			}
		}
	}
	
	public void sortOfName() {
		ArrayList<Info> infoSort = new ArrayList<>();
		for(HashMap<String, Info> hm : phonebook.values()) {
			for(Info list : hm.values()) {
				infoSort.add(list);
			}
		}
		Collections.sort(infoSort, new nameSort());
		for(Info num : infoSort) {
			containName(num.name);
		}
	}
	
	public void sortOfNameReverse() {
		ArrayList<Info> infoSort = new ArrayList<>();
		for(HashMap<String, Info> hm : phonebook.values()) {
			for(Info list : hm.values()) {
				infoSort.add(list);
			}
		}
		
		Collections.sort(infoSort, Collections.reverseOrder(new nameSort()));
		for(Info num : infoSort) {
			containName(num.name);
		}
	}
	
	public static void main(String[] args) {
		D07_PhoneBook p1 = new D07_PhoneBook();
		p1.groupGener("����");
		p1.groupGener("ģ��");
		Info i1 = new Info("ȫ�浿", "qwe123@naver.com");
		Info i2 = new Info("ȫ����", "asd123@naver.com");
		Info i3 = new Info("��ȫ��", "zxc123@naver.com");
		Info i4 = new Info("����", "ddfg123@naver.com");
		p1.addNum("����", i1, "010-1234-1234");
		p1.addNum("����", i2, "010-2345-2345");
		p1.addNum("ģ��", i3, "010-3456-3456");
		p1.addNum("ģ��", i4, "010-4567-4567");
		System.out.println();
		System.out.println("================ �̸� ã�� ==================");
		System.out.println();
		p1.containName("��");
		System.out.println();
		System.out.println("================ ��ȣ ã�� ==================");
		System.out.println();
		p1.containNum("6");
		System.out.println();
		System.out.println("================ �̸� ���� ==================");
		System.out.println();
		p1.sortOfName();
		System.out.println();
		System.out.println("================ �̸� ������������ ==================");
		System.out.println();
		p1.sortOfNameReverse();
	}
	
}


/*
		# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
		 1. phonebook���� �׷� / ��ȭ��ȣ / ������ ������ �� �ִ�.
		 2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�.
		 3. ���� HashMap�� ��ȭ��ȣ�� ������ �̸��� ���� �� �ִ�.

		# �����ؾ� �� �޼���
		 1. ���ο� �׷��� �߰��ϴ� �޼���
		 2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
		 3. ��ϵ� ��� ��ȣ�� ������ �׸� ����(Info �׸�)���� ����/������������ �����ִ� �޼���
		 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
		 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
 */

class nameSort implements Comparator<Info> {

	@Override
	public int compare(Info o1, Info o2) {
		return (o1.name.compareTo(o2.name)) != 0 ? o1.name.compareTo(o2.name) : 
			o1.email.compareTo(o2.email);
		
	}
}

