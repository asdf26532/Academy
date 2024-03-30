package variable;

public class Ex08 {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 34;
		double height = 177.4;
		char gender = '남';
		
		System.out.println("이름 : " + name + " (" + age + "세)");
		System.out.println("신장 : " + height + "cm");
		System.out.println("성별 : " + gender + "\n");
		
		
		// printf() : 서식을 활용한 출력
		// 1. %s : String, 문자열 자리
		// 2. %d : Decimal, 10진 정수 자리
		// 3. %f : Float, 실수 자리
		// 4. %c : Character, 문자 자리
		System.out.printf("이름 : %s (%d세)\n", name, age);
		System.out.printf("신장 : %f cm\n", height);
		System.out.printf("성별 : %c\n\n", gender);
		
		// %f는 기본 소수점 6자리를 미리 확보해서 데이터를 채운다
		// %.nf는 n자리만큼 소수점을 제어
		System.out.printf("신장 : %.1f cm\n", height);
		System.out.printf("신장 : %.2f cm\n", height);
		
	}
}
