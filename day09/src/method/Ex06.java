package method;

public class Ex06 {
	
	static int total(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n + total(n - 1);
//		return 3 + total(2);
//				   return 2 + total(1)
//							  return 1

	}
	
	public static void main(String[] args) {
		int sum = total(3);
		
		System.out.println("sum = " + sum);
	}
}
