import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet {

	/*
		# Set
		 - ������ �����س��� Ŭ����
		 - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�.

		# Hash
		 - �̸��� Hash�� �پ��ִ� Ŭ������ Hash �˰����� ����Ѵ�.
		 - ���� ���� ������ �׻� ������ ���� ������ �˰���
		 - ����� �ٸ� ���� �ִ��� ���� ���� �Ұ����� ���� ���;� �Ѵ�
		 - Hash �˰������� ������ Ŭ�������� ������ �������� �ʴ´�.
		 - �ߺ� üũ�ÿ� �پ ������ ���δ�
	 */

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(50);
		numbers.add(50);
		numbers.add(60);

		System.out.println(numbers);

		// HashSet���� index�� ���� ������ �����θ� ���� �� �ִ�
		numbers.remove(50);

		// HashSet�� index�� ���� ������ for-each�� ����� �� �ִ�.
		for (Integer number : numbers) {
			System.out.println(number);
		}

		// �÷��ǳ����� ��ȯ�� �����Ӵ�
		ArrayList<Integer> number_list = new ArrayList<>(numbers);

		System.out.println(number_list);

		// ����Ʈ �÷����� ���� �v�� ũ������� ������ �� �ִ�
		Collections.sort(number_list);
		System.out.println("���� �� : " + number_list);

		// Collection.addAll(Collection) �÷����� ��� ������ �ٸ� �÷��ǿ� �߰��ϱ�(������)
		HashSet<String> animals = new HashSet<>();
		ArrayList<String> animal_list = new ArrayList<>();

		animal_list.add("dog");
		animal_list.add("cat");
		animal_list.add("cow");
		animal_list.add("lion");
		animal_list.add("tiger");

		animals.add("lion");
		animals.add("tiger");
		animals.add("horse");
		animals.add("zebra");
		animals.add("giraffe");

		animals.addAll(animals);
		System.out.println(animals);

		// Collection.removeAll(Collection) : ������ �÷��Ű� ���� ������ ��� ����(������)

		animals.removeAll(animal_list);

		System.out.println(animals);
		
		//Collection.retainAll(Collection) : �� �÷��ǿ� ��� �����ϴ� ���� ����(������)
		HashSet<Double> avg = new HashSet<>();
		HashSet<Double> avg2 = new HashSet<>();
		
		avg.add(1.8);
		avg.add(1.9);
		avg.add(2.0);

		avg2.add(2.0);
		avg2.add(38.8);
		avg2.add(40.1);
		
		System.out.println(avg.retainAll(avg2));
		System.out.println(avg);
		
	}
}





















