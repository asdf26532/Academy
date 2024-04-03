package method;

/*
	1. 전달한 두 정수를 비교 후 큰 수를 반환
	단, 같으면 아무거나
	
	2. 전달한 실수(= 반지름)의 원넓이를 반환
	단, pi = 3.14로 계산
	
	3. 전달한 정수의 절대값을 반환
	
	4. 전달한 정수의 1 ~ n까지의 합계를 반환
	
	5. 전달한 정수가 소수인지 반환
	
*/

public class Quiz1 {
	
	static int compare(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		
		return n2;
	}
	
	static double circle(double r) {
		
		return 3.14 * r * r;
		// 1. return 값은 오직 하나만 가능
		// 2. 수식을 작성해도 된다. 연산 후 리턴 됨
	}
	
	static int absolute(int n) {
		if (n < 0) {
			return -n;
		}
		
		return n;
	}
	
	static int total(int n) {
		int t = 0;
		
		for (int i = 1; i <= n; i++) {
			t += i;
		}
		
		return t;
	}
	
	static boolean isPrime(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// 1번)
		int n = compare(5, 3);
		
		System.out.println("n = " + n);
		System.out.println("compare(5, 3) = " + compare(5, 3));
		
		
		// 2번)
		double cir = circle(3.5);
		
		System.out.println("\ncir = " + cir);
		System.out.println("circle(7.125) = " + circle(7.125));
		
		
		// 3번)
		int abs = absolute(-5);
		
		System.out.println("\nabs = " + abs);
		System.out.println("absolute(5) = " + absolute(5));
		
		
		// 4번)
		int sum = total(10);
		
		System.out.println("\nsum = " + sum);
		System.out.println("total(5) = " + total(5));
		
		
		// 5번)
		boolean prime = isPrime(7);
		
		System.out.println("\nprime  = " + prime);
		System.out.println("isPrime(6) = " + isPrime(6));
		System.out.println();
		
		
		// 6번) 5번의 메서드를 활용해서 1 ~ 1000 사이의 소수를 모두 출력
		int count = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.printf("%3d ", i);
				count++;
				
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		
		
		
		
		
	}
}
