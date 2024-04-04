package method;

/*
 	※ 재귀 : 다시 되돌아 오다

	재귀 함수 (Recursive Method)
	- 함수 내부에서 자기 자신을 호출해서 구현 가능
	- 다양한 자료구조 구현 및 알고리즘에 자주 사용되므로 숙지하면 좋다
*/

public class Ex05 {
	
	static void func(int n) {
		if (n == 0) {					// 재귀는 종료가 될 조건이 필요하다
			return;						// 그렇지 않으면 무한 루프에 빠진다
		}
		
		System.out.println("n = " + n);	// 재귀 전
		
		func(n - 1);					// 재귀 시작
		
		System.out.println("n = " + n);	// 재귀 후
		
	}
	
	public static void main(String[] args) {
		
		func(3);
		
	}
}
