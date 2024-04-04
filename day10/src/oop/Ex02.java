package oop;

class Person {
	// 1. 필드, 객체의 속성
	String name;
	int age;
	
	
	// 2. 메서드, 객체의 기능
	void eat(String food) { 
	//   eat(Person this, String food)
		
		String msg = "%s(이)가 %s(을)를 먹는다\n";

		System.out.printf(msg, name, food);
		System.out.printf(msg, this.name, food);
		// 지역변수와 이름이 겹치지 않으면 필드 접근시 this 생략 가능
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 인스턴스 생성
		Person per = new Person();
		
		// 해당 인스턴스를 사용할 땐 참조 변수를 사용한다
		per.name = "홍길동";
		per.age = 22;
		
		// 참조 변수를 출력하면 '해시코드'가 나타난다
		// - oop.Person@15db9742
		// - 패키지명.클래스명@해시코드
		System.out.println("per = " + per);
		
		
		System.out.println("per의 이름 : " + per.name);
		System.out.println("per의 나이 : " + per.age + "\n");
		
		per.eat("햄버거");
//		eat(per, "햄버거");	
		
	}
}
