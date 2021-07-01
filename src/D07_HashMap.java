import java.util.*;
import java.util.Map.Entry;


public class D07_HashMap {

	/*
		# MAP
		 - 데이터를 Key 와 Value 한 쌍으로 저장하는 방식의 자료구조
		 - Key값을 통해 Value에 접근할 수 있다
		 - Key는 중복을 허용하지 않는다
	 */

	public static void main(String[] args) {
		// 첫 번쨰 제네릭은 Key 의 타입이고, 두번째 제네릭은 Value의 타입이다
		HashMap<String, String> addr = new HashMap<>();
		// Map.put(key, value)
		// 맵에 데이터를 추가한다
		// Map.putAll(Map)
		// 다른 맵의 데이터를 모두 추가한다.
		// Map.putIfAbsent(key, value)
		// 비어있으면 넣고, 뭔이 있으면 커내준다 , 넣은경루 null리턴
		addr.put("우리집", "서울시 동작구 노량진 1동");
		addr.put("직장", "서울특별시 강남구 강남대로84길 16 11, 12층");
		addr.put("직장2", "서울특별시 종로구 종로3가");

		addr.put("직장", "없어짐");// 값이 바뀜


		System.out.println(addr.get("우리집"));
		//직접 정의한 타입도 사용할 수 있다.
		HashMap<Integer, Student> students = new HashMap<>();

		students.put(1, new Student());
		students.put(2, new Student());

		System.out.println(students.get(1));

		//여러가지 타입을 사용할 수 있다
		HashMap<String, Object> info = new HashMap<>();

		info.put("이름", "홍길동");
		info.put("나이", "23");
		info.put("전화번호", "010-1234-1234");
		info.put("좋아하는것", new String[] {"영화", "운동", "햄버거"});
		info.put("친구 목록", new ArrayList<>());
		
//		ArrayList<String> friends = (ArrayList<String>) info.get("친구 목록");
//		
//		friends.add("철수");
//		friends.add("영희");
//		friends.add("민수");
		
		((ArrayList<String>) info.get("친구 목록")).add("철수");
		((ArrayList<String>) info.get("친구 목록")).add("영희");
		((ArrayList<String>) info.get("친구 목록")).add("민수");
		
		/*
			# 반복분으로 Map타입 활용하기
			 - Map.KeySet() : Key들로 이루어진 Set을 반환한다
			 - Map.values() : 값들로 이루어진 Set을 반환한다.
			 - Map.entrySet() : Entry<Key, value>로 이뤄진 Set을 반환한다
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


