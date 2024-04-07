package collection;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list = " + list);
		
		// Comparator를 전달하지 않으면 Comparable로 정렬을 수행
		list.sort(null);
		System.out.println("list = " + list);
		
		// 전달인자로 바로 사용하는 람다식의 반환값은 return을 생략하고 작성한다
		list.sort((Integer o1, Integer o2) -> o2 - o1);
		System.out.println("list = " + list);
		
	}
}
