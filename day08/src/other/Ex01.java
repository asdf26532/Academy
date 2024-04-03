package other;

/*
	Java에서 난수(= 무작위 수, 랜덤)을 사용하는 방식
	1. Math 클래스의 random() 메서드
	2. Random 클래스
*/

import java.lang.Math;
// ※ java.lang은 import 불필요

public class Ex01 {
	public static void main(String[] args) {
		// 1. Math는 수학 관련 기능을 제공하는 클래스
		double n;
		int m;
		
		for (int i = 0; i < 5; i++) {
			n = Math.random();	// 0.0 ~ 0.999999...
			n *= 100;			// 0.0 ~ 99.99999...
			m = (int)n;			// 0 ~ 99
			m %= 11;			// 0 ~ 10
			
			System.out.println("m = " + m);
		}
		System.out.println();
		
		
		for (int i = 0; i < 5; i++) {
			m = (int)(Math.random() * 100) % 10;
			// 0 ~ 9
			
			System.out.println("m = " + m);
		}
		System.out.println();
		
		
		// a ~ b 사이의 랜덤 추출
		// - a를 0으로 만들고 시작하면 쉽다
		//
		// ex) 6 ~ 11?
		// 1. 0 ~ 5		(-6을 적용)
		// 2. n % 6
		// 3. n % 6 + 6
		for (int i = 0; i < 5; i++) {
			m = (int)(Math.random() * 100) % 6 + 6;
			
			System.out.println("m = " + m);
		}
		
	}
}
