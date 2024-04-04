package method;

/*
	1. 재귀 함수를 이용해서 factorial을 구현(= 누적곱)
	
	
	2. 재귀 함수를 이용해서 피보나치 수열을 구현
	
	
	※ 피보나치 수열
	- 인접한 두 항을 합이 다음 항의 값이 된다
	- 재귀식 : f(n) = f(n - 1) + f(n - 2)
	- 단, f(1) = f(2) = 1이다
	
	ex)
	1 1 2 3 5 8 13 21 34 55 89 ...
*/

public class Quiz3 {
	static int fac(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * fac(n - 1);
	}
	
	static long fibo(int n) {
		if (n <= 2) { return 1; }
		
		return fibo(n - 1) + fibo(n - 2);
	}
	
	public static void main(String[] args) {
		System.out.println("10 fac = " + fac(10));
		
		System.out.println("fibo(7) = " + fibo(49));
		
	}
}
