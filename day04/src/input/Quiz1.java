package input;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 이름, 나이, 신장, 성별 정보를 저장할 변수를 선언
		// 단, 성별은 char로 선언
		String name;
		int age;
		double height;
		char gender;
		
		
		// 2. 1번의 변수에 Scanner를 활용해서 입력 받는다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("신장 : ");
		height = sc.nextDouble();
		
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		
		// 3. 아래와 같이 출력
		// 결과)
		// 이름 : 홍길동 (남, 30세)
		// 신장 : 170.5cm
		String result = "\n이름 : %s (%c, %d세)\n";
		System.out.printf(result, name, gender, age);
		System.out.println("신장 : " + height + "cm");
		
		sc.close();
	}
}
