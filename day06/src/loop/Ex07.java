package loop;

/*
	중첩 반복문
	- 반복문 안에 또 반복문을 구성
	- 단일 반복문의 구문 자체를 반복
*/

public class Ex07 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {		// 바깥 for : 행 반복
			
			for (int j = 1; j <= 5; j++) {	// 안쪽 for : 열 반복
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
		
	}
}
