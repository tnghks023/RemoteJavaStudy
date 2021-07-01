import java.util.Comparator;
import java.util.Set;
import java.util.*;
import java.util.TreeSet;

public class D06_TreeSet {

	/*
		# TreeSet
		 - 순서가 있는 Set (순서가 없는 것은 Hash의 특징)
		 - 중복은 허용하지 않는다 (Set의 특징)
		 - 처음 Set에 데이터를 추가할 때 값을 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다.
		 - 미리 정렬이 되어 있기 때문에 정렬된 순서로 값을 꺼내기 편리한 Set이다
		 - 해당 TreeSet 인스턴스에서 사용할 Comparator를 지정할 수 있다.
	 */

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();

		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);

		System.out.println(numbers);

		// TreeSet에 원하는 Comparator를 사용하기 (정수 내림차순)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		numbers2.addAll(numbers);

		System.out.println(numbers2);

		// TreeSet은 Set의 일부분을 리턴하는데에 특화된 기능이 많다.
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);

		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);

		//미리 정렬해놓은 방향과 반대 반향인  Set 인스턴스를 반환한다.
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);

		System.out.println(numbers.first());
		System.out.println(numbers.last());
		System.out.println(numbers.pollFirst()); //첫번째 출력하고 삭제
		System.out.println(numbers);
		System.out.println(numbers.pollLast());
		System.out.println(numbers);

		System.out.println(numbers.subSet(30, 70));

		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());

		TreeSet<Integer> numbers3 = new TreeSet<>(numbers2.comparator());

		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());

		numbers2.contains(42);
		list.contains(42);

		System.out.println(list.containsAll(numbers));
		System.out.println(list.containsAll(desc));
		System.out.println(list.containsAll(numbers3));

		// 학생 인스턴스를 100개 만들고, 트리셋에 평균 점수 순으로 저장한 후
		// 평균 점수가 50점 ~ 70점 사이인 학생이 모두 몇명인지 세어보세요
		TreeSet<Student> stu = new TreeSet<>(new Comparator<Student>() {

			public int compare(Student o1, Student o2) {

				return Double.compare(o1.avg, o2.avg) != 0 ? 
						Double.compare(o1.avg, o2.avg) : Integer.compare(o1.snum, o2.snum);
			}
		});

		while(stu.size() < 100) {
			stu.add(new Student());
		}
		Student from = new Student();
		Student to = new Student();

		from.avg = 50.0;
		to.avg = 70.0;

		System.out.println(stu.subSet(from, to).size());
		
		TreeSet<Snack3> snack3 = new TreeSet<>();
		while(snack3.size() < 100) {
			snack3.add(new Snack3());
		}
		
		Snack3 fromS = new Snack3();
		Snack3 toS = new Snack3();
		fromS.calc = 500;
		toS.calc = 1500;
		System.out.println(snack3.subSet(fromS, toS).size());
	}
	
}
