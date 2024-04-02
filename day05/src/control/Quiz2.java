package control;

import java.util.Scanner;

/*
	점수 등급)
	학생의 3과목 성적을 입력 받는다
	성적의 합계와 평균을 출력하고 평균에 따른 등급을 출력하라
	
	등급표)
	100 ~ 90	: A
	89 ~ 80 	: B
	79 ~ 70 	: C
	69 ~ 60 	: D
	59 ~ 0 		: F
*/

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;
		char rank;
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.printf("합계 : %d (= %.1f)\n", sum, avg);
		
		if (avg >= 90) 		rank = 'A';
		else if (avg >= 80) rank = 'B';
		else if (avg >= 70) rank = 'C';
		else if (avg >= 60) rank = 'D';
		else 				rank = 'F';
		
		System.out.println(rank + "등급");
		sc.close();
	}
}
