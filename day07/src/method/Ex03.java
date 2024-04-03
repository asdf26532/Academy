package method;

public class Ex03 {
	
	// 매개변수는 콤마로 구분해서 여러개 작성 가능
	static void test(int n1, int n2) {
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		System.out.printf("%d + %d = %d\n\n", n1, n2, n1 + n2);
	}
	
	public static void main(String[] args) {
		// 전달인자는 매개변수에 순서대로 채워진다
		test(5, 4);
		
		test(4, 5);
		
		
		// 타입이나 개수를 맞추지 않으면 에러
		// test(4, 5.0);		타입x
		// test(4);				개수 부족
		// test(4, 5, 6);		개수 과다
	}
}