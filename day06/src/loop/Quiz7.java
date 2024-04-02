package loop;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("몇 줄? ");
		n = sc.nextInt();
		
		// 1번
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 2번
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3번
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 4번
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 5번
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 6번
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
