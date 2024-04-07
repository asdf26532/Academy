package abstract_;

import java.util.Arrays;
import java.util.Comparator;

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age + "세";
	}
	
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 실수형 배열을 생성 후 내림 차순 정렬
		Double[] arr1 = new Double[] { 5.1, 3.14, 6.123 };
		
		Comparator<Double> desc = (Double o1, Double o2) -> {
			// return (int)(o2 - o1);
			return o2.compareTo(o1);
		};
		
		Arrays.sort(arr1, desc);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		
		// 2. 문자열 배열을 생성 후 오름 차순 정렬
		String[] arr2 = new String[] { "java", "c++", "visual basic" };
		
		Comparator<String> asc = (String o1, String o2) -> {
			return o1.compareTo(o2);
		};
		
		Arrays.sort(arr2, asc);
		System.out.println("\narr2 = " + Arrays.toString(arr2));
		
		
		// 3. Person 클래스를 생성 후 이름순으로 내림 차순
		// 필드는 이름, 나이만 가진다
		Person[] arr3 = new Person[] { 
			new Person("홍길동", 22),
			new Person("김민수", 26),
			new Person("이나영", 33)
		};
		
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {
			String name1 = o1.getName();
			String name2 = o2.getName();
			
			return name2.compareTo(name1);
		};
		
		Arrays.sort(arr3, ageDesc);
		System.out.println("\narr3 = " + Arrays.toString(arr3));
	}
}
