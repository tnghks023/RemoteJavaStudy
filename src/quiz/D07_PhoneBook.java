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
			
			return "이름: " + name + "\n이메일: " + email;
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
					System.out.println("그룹: " + entry.getKey());
					System.out.println("전화번호: " + entryin.getKey());
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
					System.out.println("그룹: " + entry.getKey());
					System.out.println("전화번호: " + entryin.getKey());
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
		p1.groupGener("가족");
		p1.groupGener("친구");
		Info i1 = new Info("홍길동", "qwe123@naver.com");
		Info i2 = new Info("홍가나", "asd123@naver.com");
		Info i3 = new Info("나홍다", "zxc123@naver.com");
		Info i4 = new Info("김라다", "ddfg123@naver.com");
		p1.addNum("가족", i1, "010-1234-1234");
		p1.addNum("가족", i2, "010-2345-2345");
		p1.addNum("친구", i3, "010-3456-3456");
		p1.addNum("친구", i4, "010-4567-4567");
		System.out.println();
		System.out.println("================ 이름 찾기 ==================");
		System.out.println();
		p1.containName("나");
		System.out.println();
		System.out.println("================ 번호 찾기 ==================");
		System.out.println();
		p1.containNum("6");
		System.out.println();
		System.out.println("================ 이름 정렬 ==================");
		System.out.println();
		p1.sortOfName();
		System.out.println();
		System.out.println("================ 이름 내림차순정렬 ==================");
		System.out.println();
		p1.sortOfNameReverse();
	}
	
}


/*
		# HashMap을 이용해 전화번호부를 구현해보세요
		 1. phonebook에는 그룹 / 전화번호 / 정보를 저장할 수 있다.
		 2. 그룹명을 키값으로 넣으면 해당 그룹에 해당하는 HashMap을 꺼낼 수 있다.
		 3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다.

		# 구현해야 할 메서드
		 1. 새로운 그룹을 추가하는 메서드
		 2. 그룹에 새로운 전화번호를 등록하는 메서드
		 3. 등록된 모든 번호를 선택한 항목 기준(Info 항목)으로 오름/내림차순으로 보여주는 메서드
		 4. 이름을 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
		 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
 */

class nameSort implements Comparator<Info> {

	@Override
	public int compare(Info o1, Info o2) {
		return (o1.name.compareTo(o2.name)) != 0 ? o1.name.compareTo(o2.name) : 
			o1.email.compareTo(o2.email);
		
	}
}

