package quiz.JiphapQuiz;

import java.util.*;

public class D02_JiphapQuiz<T> {

	/*
		1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
		
		2. 두 컬헥션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
		
		3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	 */
	
	static class Fruit {}
	static class Apple extends Fruit {}
	static class Banana extends Fruit {}
	static class Carrot {}
	
	
	public static void main(String[] args) {
		D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();
		D02_JiphapQuiz<Fruit> jiphap2 = new D02_JiphapQuiz<>();
		
		List<Apple> apple_list = new ArrayList<>();
		Set<Apple> apple_set = new HashSet<>();
		
		
		jiphap2.union(apple_list, apple_set);
		
		List<String> A = new ArrayList<>();
		Set<String> B = new HashSet<>();
		
		A.add("A");
		A.add("B");
		A.add("C");
		
		B.add("B");
		B.add("C");
		B.add("D");
		B.add("E");
		
		System.out.println(jiphap.union(A, B));
		System.out.println(jiphap.intersect(A, B));
		System.out.println(jiphap.difference(A, B));
		
	} // end main
	
	// 생성할때 정했던것으로 T가 정해짐 T == Fruit , extends T 가 없으면 25줄의 Apple이 실행이
	// 안됨 왜냐면 캐스팅이 저절로 안됨.
	HashSet<T> union(Collection<? extends T> c1, Collection<? extends T> c2) {
//		HashSet<T> h1 = new HashSet<>(c1);
//		HashSet<T> h2 = new HashSet<>(c2);
//		h1.addAll(h2);	
//		return h1;
		
		HashSet<T> union = new HashSet<>();
		union.addAll(c1);
		union.addAll(c2);
		
		return union;
	}
	
	HashSet<T> intersect(Collection<? extends T> c1, Collection<? extends T> c2) {
//		HashSet<T> h1 = new HashSet<>(c1);
//		HashSet<T> h2 = new HashSet<>(c2);
//		h1.retainAll(h2);
//		return h1;
		
		HashSet<T> inter = new HashSet<>();
		inter.addAll(c1);
		inter.retainAll(c2);
		return inter;
	}
	
	HashSet<T> difference(Collection<? extends T> c1, Collection<? extends T> c2) {
//		HashSet<T> h1 = new HashSet<>(c1);
//		HashSet<T> h2 = new HashSet<>(c2);
//		h1.removeAll(h2);
//		return h1;
		
		HashSet<T> diff = new HashSet<>();
		diff.addAll(c1);
		diff.removeAll(c2);
		return diff;
	}
}// end class
