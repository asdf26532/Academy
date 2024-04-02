package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 5번)
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, count = 0;
		double avg;
		
		do {
			System.out.print("정수 (0 : 종료) ");
			n = sc.nextInt();
			
			sum += n;
			count++;
			
			System.out.println("n = " + n + "\n");
			
		} while(n != 0);
		
		count--;
		avg = sum / (double)count;
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
		// System.out.println("횟수 : " + count);
		
		sc.close();
	}
}
