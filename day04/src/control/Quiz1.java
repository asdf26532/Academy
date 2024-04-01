package control;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// ※ 아래는 모두 조건문으로 풀어주세요
		// 1. 정수를 입력 받아서 절대값을 출력
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.print("1. 절대값 : ");
		n1 = sc.nextInt();
		
		if (n1 < 0) {
			n1 *= -1;
		}
		
		System.out.println("n1 = " + n1);
		
		
		// 2. 두 정수를 입력 받아서 큰 수를 출력
		int n2, n3, big;
		
		System.out.print("\n2. 두 정수 입력 : ");
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		big = n2;
		
		if (n2 < n3) {
			big = n3;
		}
		
		System.out.println("큰 수 : " + big);
		
		
		// 3. 정수를 입력 받아서 5의 배수인지 판별해서 출력
		int n4;
		String result = "5의 배수가 아님";
		
		System.out.print("\n3. 5의 배수 : ");
		n4 = sc.nextInt();
		
		if (n4 % 5 == 0) {
			result = "5의 배수";
		}
		
		System.out.println(n4 + "(은)는 " + result);
		
		
		// 4. 세 정수를 입력 받아서 가장 큰 수를 출력
		int a, b, c, max;
		
		System.out.print("\n4. 세 정수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		max = a;
		
		if (max < b) { 
			max = b;
		}
		if (max < c) {
			max = c;
		}
		
		System.out.println("최대값 : " + max);
		sc.close();
	}
}
