package constructor;

/*
	생성자
	- 인스턴스 생성시 한번 실행되는 메서드
	- 클래스의 이름과 동일해야 하며, 반환형을 가지지 않음
	- 주로, 필드 초기화 하는 용도로 자주 사용된다
	
	※ 기본 생성자
	- 클래스에 생성자를 작성하지 않으면, 자동으로 만들어지는 생성자
	- 매개변수를 가지지 않는 생성자다
*/

class Person {
	// 클래스와 배열은 초기화 하지 않으면 기본값이 자동으로 적용된다
	String name = "미정";
	int age;
	double height;
	
	Person(String name, int age, double height) {
		// 지역변수와 필드명이 같으면 this를 작성해야 필드로 인식된다
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	// 생성자는 클래스명이랑 같아야 하므로 오버로딩으로 여러 생성자를 작성할 수 있다 
	Person() {
		name = "N/A";	// 필드 초기화 -> 생성자
	}
	
	Person(String name) {
		this.name = name;
		age = -1;
		height = -1.0;
	}
	
	void showInfo() {
		String msg = "%s (%d세, %.1fcm)\n";
		System.out.printf(msg, name, age, height);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person minsu = new Person("김민수", 33, 168.5);
		Person sujin = new Person();
		
		minsu.showInfo();
		sujin.showInfo();
		
		
		// 연습)
		Person jinho = new Person("박진호");
		
		jinho.showInfo();	// 박진호 (-1세, -1.0cm);
	}
}
