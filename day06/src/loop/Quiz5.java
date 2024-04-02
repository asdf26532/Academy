package loop;

import java.util.Scanner;

/*
 	※ 아래 문제들은 for문을 사용해서 풀어주세요
	1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
	
	2. 정수를 입력 받아서 약수를 모두 출력
	
	3. 정수를 입력 받아서 소수인지 판별
*/

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		// 1번
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// 2번
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.printf("(%d개)\n", count);
		
		
		// 3번
		if (count == 2) {
			System.out.println("소수 입니다");
		}
		else {
			System.out.println("소수가 아닙니다");
		}
		
		sc.close();
	}
}
