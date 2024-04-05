package accessModifier;

import other.Person;

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 27, 171.3);
		
		p1.name = "홍진호";
		
		// p1.age = 22;
		// p1.height = 172.22;
		// - package는 외부 패키지에서 접근 불가능
		// - private는 클래스 외부에서 접근 불가능
		
		// System.out.println("p1의 키 : " + p1.height);
		// - height는 결국 외부에서 '직접 접근이 불가능'하다
		
		p1.showInfo();
		// - 하지만, public으로 공개된 메서드를 통해서
		// - 간접적으로 height의 데이터를 확인할 수 있다
		
		// 중요!) 이 간접적으로 접근하는 행위에서 안정성이 따라온다
		
	}
}
