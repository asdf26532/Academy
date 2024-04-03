package array;

import java.util.Arrays;
import java.util.Scanner;

/*
	1. 학생 5명의 점수를 저장할 정수형 배열을 선언
	
	2. 반복과 입력을 활용해서 배열에 순서대로 학생 점수를 입력 받는다
	
	3. 입력 받은 점수를 일렬로 모두 출력
	
	4. 학생들의 점수 합계/평균을 출력
	
	5. 1등의 점수와 꼴등의 점수를 출력
*/

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int sum = 0, max = 0, min = 100;
		double avg;
		
		for (int i = 0; i < scores.length; i++) {
			// 입력
			System.out.print(i + 1 + "번째 학생 : ");
			scores[i] = sc.nextInt();
			
			// 합계
			sum += scores[i];
			
			// 최대, 최소
			if (max < scores[i]) { max = scores[i]; }
			if (min > scores[i]) { min = scores[i]; }
		}
		
		System.out.println("\n점수 목록 : " + Arrays.toString(scores));
		
		avg = sum / (double)scores.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg + "\n");
		
		System.out.println("1등 : " + max);
		System.out.println("꼴등 : " + min);
		
		sc.close();
	}
}
