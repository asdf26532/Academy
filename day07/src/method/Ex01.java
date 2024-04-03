package method;

/*
	함수(function) : 일정 길이의 코드를 저장하고 재사용 하는 방식
	
	※ 메서드(method)
	- 객체가 사용하는 메서드로, 클래스 안에 선언된 함수를 의미
	- 즉, 객체 지향의 개념이 추가된 함수를 의미한다
	- java는 모든 함수가 클래스 안에서만 작성 가능하기 때문에 모두 메서드에 해당
*/

public class Ex01 {
	
	// 메서드 선언 : 실행 코드가 작성된 곳
	static void hello() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello();	// 메서드 호출 : 선언된 메서드를 사용하는 것
		
		hello();	// 재사용성 : 한번 선언한 메서드는 몇 번이건 사용 가능
		
		hello();
		
		// 중요!) 메서드 호출 순서
		// 1. 메서드를 호출하면 현재 위치(= 줄)을 기억하고 해당 메서드 위치로 이동
		// 2. 메서드로 이동 후 종속문을 순차적으로 수행
		// 3. 메서드가 종료되면 1번에서 기억한 위치로 되돌아와서 남은 코드를 마저 수행
	}
}
