package control;

import java.util.Scanner;

/*
	엘리베이터 호출)
	현재 건물에 엘리베이터 3대가 있다
	각 엘리베이터는 A : 5층, B : 7층, C : 9층에 머물러 있다
	이때, 현재 층을 입력 받아서 가장 가까운 엘리베이터를 호출한다
	만약, 동일한 층 수 차이면 앞의 엘리베이터를 호출한다
*/

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 5, B = 7, C = 9;
		int cur;
		
		System.out.print("현재 층? ");
		cur = sc.nextInt();
		
		// 1. 거리 차 구하기
		int disA = A - cur;
		int disB = B - cur;
		int disC = C - cur;
		
		// 2. 절대값 처리
		if (disA < 0) disA *= -1;
		if (disB < 0) disB *= -1;
		if (disC < 0) disC *= -1;
		
		// System.out.printf("디버깅) A : %d, B : %d, C : %d\n", disA, disB, disC);
		
		// 3. 최소값 처리
		int min = disA;
		char name = 'A';
		
		if (min > disB) {
			min = disB;
			name = 'B';
		}
		if (min > disC) {
			min = disC;
			name = 'C';
		}
		
		// System.out.println("가장 가까운 거리 : " + min);
		System.out.println("가까운 " + name + " 엘리베이터를 호출");
		sc.close();
	}
}
