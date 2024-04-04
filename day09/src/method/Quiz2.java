package method;

import java.util.Arrays;
import java.util.Random;

/*
	1. 60,000개 크기의 정수형 배열을 생성 후 랜덤으로 값을 채운다
	단, 범위는 1 ~ 120,000
	
	2. 삽입 정렬을 구현 후 소요시간을 출력
	단, 오름/내림 차순 관계 없이 아무거나
*/

public class Quiz2 {
	
	static void inputArr(int[] arr) {
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(120000) + 1;
		}
	}
	
	static void insertSort(int[] arr) {
		int backUp;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					backUp = arr[i];
					arr[i] = arr[j];
					arr[j] = backUp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[60000];
		long start, end;
		
		inputArr(arr);
		
		start = System.currentTimeMillis();
		insertSort(arr);
		end = System.currentTimeMillis();
		
		double time = (end - start) / 1000.0; 
		
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("개수 : " + arr.length);
		System.out.println("소요 시간 : " + time + "초");
	}
}
