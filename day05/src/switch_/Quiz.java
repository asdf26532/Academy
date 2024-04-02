package switch_;

import java.util.Scanner;

/*
	control.Quiz2의 문제를
	switch로 변경해서 다시 풀어보세요
*/

public class Quiz {
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
		
		int tmp = (int)(avg / 10);
		System.out.println("tmp = " + tmp);
		
		switch(tmp) {
		case 10: case 9:	rank = 'A'; break;
		case 8:				rank = 'B';	break;
		case 7:				rank = 'C';	break;
		case 6:				rank = 'D'; break;
		default:			rank = 'F';
		}
		
		System.out.printf("합계 : %d (%.1f)\n", sum, avg);
		System.out.println(rank + " 등급");
		sc.close();
	}
}
