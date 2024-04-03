package other;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		// Random을 좀 더 쉽게 제공하는 클래스
		Random ran = new Random();
		int n;
		
		for (int i = 0; i < 5; i++) {
			n = ran.nextInt();		// int 범위 내에서 정수를 랜덤으로 반환 (-21억 ~ 21억)
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		for (int i = 0; i < 5; i++) {
			n = ran.nextInt(10);	// 0 ~ (n - 1)사이의 정수를 반환
			System.out.println("n = " + n);
		}
		System.out.println();
		
		
		// 연습) 11 ~ 35사이 랜덤 정수 3개를 출력
		for (int i = 0; i < 3; i++) {
			n = ran.nextInt(25) + 11;
			System.out.println("n = " + n);
		}
	}
}
