package loop;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 6번)
		Scanner sc = new Scanner(System.in);
		int n, rev = 0;
		
		System.out.print("정수 : ");
		n = sc.nextInt();
		
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		
		System.out.println("rev = " + rev);
		System.out.println("rev * 2 = " + rev * 2);
		sc.close();
	}
}
