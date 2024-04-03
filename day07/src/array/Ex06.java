package array;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		// 1차 배열 : 지정 자료형의 데이터를 일렬로 저장
		int[] arr1 = new int[] { 10,20,30,40 };
		
		
		// 2차 배열 : 1차 배열을 요소로 가지는 배열
		int[][] arr2 = new int[][] {
			{ 10,20,30,40 },	// 0행
			{ 11,21,31,41 },	// 1행
			{ 12,22,32,42 }		// 2행
		//     0  1  2  3열
		};
		
		// ※ 일렬로 작성시 아래와 같다
		arr2 = new int[][] { { 10,20,30,40 }, { 11,21,31,41 }, { 12,22,32,42 } };
		//				     {      0      }  {      1      }  {      2      }
		//					 {  0  1  2  3 }  {  0  1  2  3 }  {  0  1  2  3 }
		
		
		System.out.println("arr2 = " + arr2);
		System.out.println("arr2 = " + Arrays.deepToString(arr2));
		// - n차 배열은 deepToString()을 사용하면 문자열로 받을 수 있다
		
		System.out.println("\narr2[0] = " + arr2[0]);
		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		
		System.out.println("\narr2[0][2] = " + arr2[0][2]);
	}
}
