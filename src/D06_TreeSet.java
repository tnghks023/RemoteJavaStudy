import java.util.Comparator;
import java.util.Set;
import java.util.*;
import java.util.TreeSet;

public class D06_TreeSet {

	/*
		# TreeSet
		 - ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
		 - �ߺ��� ������� �ʴ´� (Set�� Ư¡)
		 - ó�� Set�� �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������.
		 - �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴�
		 - �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�.
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

		// TreeSet�� ���ϴ� Comparator�� ����ϱ� (���� ��������)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		numbers2.addAll(numbers);

		System.out.println(numbers2);

		// TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����.
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println(head);

		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);

		//�̸� �����س��� ����� �ݴ� ������  Set �ν��Ͻ��� ��ȯ�Ѵ�.
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);

		System.out.println(numbers.first());
		System.out.println(numbers.last());
		System.out.println(numbers.pollFirst()); //ù��° ����ϰ� ����
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

		// �л� �ν��Ͻ��� 100�� �����, Ʈ���¿� ��� ���� ������ ������ ��
		// ��� ������ 50�� ~ 70�� ������ �л��� ��� ������� �������
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
