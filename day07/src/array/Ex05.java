package array;

import java.util.Arrays;

/*
	1. 크기가 4인 실수형 배열을 생성한다
	
	 
	2. 1번의 실수에 아무 값이나 채운다
	
	
	3. 배열 요소 모두를 일렬로 출력
	
	
	4. 배열 요소 전체의 합계/평균을 출력
*/

public class Ex05 {
	public static void main(String[] args) {
		double[] arr = new double[] { 3.14, 6.1, 9.34, 5.123 };
		double sum = 0;
		
		System.out.println("arr = " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			// System.out.printf("arr[%d] = %f, sum = %f\n", i, arr[i], sum);
		}
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (sum / arr.length));
	}
}
