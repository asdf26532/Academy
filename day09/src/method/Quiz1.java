package method;

import java.util.*;
// * : wildcard, 만능 문자. 모든 문자를 의미한다
// 즉, java.util 아래 모든 것을 import 한다

/*
	1. 정수를 하나 입력 받는다
	
	2. 입력 받은 정수만큼의 개수를 가지는 정수형 배열을 생성한다
	
	3. 2번에서 생성한 배열에 랜덤으로 정수를 채운다 (1 ~ 100 사이)
	
	4. 선택 정렬로 오름 차순 정렬 후 출력
	
	5. 삽입 정렬로 내림 차순 정렬 후 출력
	
	6. 버블 정렬로 오름 차순 정렬 후 출력
*/
public class Quiz1 {
	static void inputArr(int[] arr) {
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
	}
	
	static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int backUp = arr[i];
					arr[i] = arr[j];
					arr[j] = backUp;
				}
			}
		}
	}
	
	static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					int backUp = arr[i];
					arr[i] = arr[j];
					arr[j] = backUp;
				}
			}
		}
	}
	
	static void bubbleSort(int[] arr) {
		while (true) {
			int count = 0;
			
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int backUp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = backUp;
					
					count++;
				}
			}
			
			if (count == 0) { return; }
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("배열 크기 : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		inputArr(arr);
		System.out.println("arr = " + Arrays.toString(arr));
		
		selectSort(arr);
		System.out.println("\n선택정렬 : " + Arrays.toString(arr));
		
		insertSort(arr);
		System.out.println("삽입정렬 : " + Arrays.toString(arr));
		
		bubbleSort(arr);
		System.out.println("버블정렬 : " + Arrays.toString(arr));
		
		sc.close();
		
	}
}
