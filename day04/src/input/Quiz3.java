package input;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 1. 이름, 국 영 수 점수를 입력 받을 변수를 선언
		// 단, 국 영 수는 정수로
		String name;
		int kor, eng, mat, sum;
		double avg;
		
		
		// 2. 1번의 변수에 데이터를 입력
		// 이때, 국 영 수는 한 줄에 입력 받아 본다
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scan.next();
		
		System.out.print("국 영 수 : ");
		kor = scan.nextInt();
		eng = scan.nextInt();
		mat = scan.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		
		// 3. 결과는 아래와 같다
		// 결과)
		// 이름 : 홍길동
		// 성적 : 국 70, 영 80, 수 98
		// 합계 : 248 (82.67)
		System.out.println("\n이름 : " + name);
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d (%.2f)\n", sum, avg);
		
		scan.close();
	}
}
