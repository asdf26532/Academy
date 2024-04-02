package loop;

/*
	반복문 while
	- 조건식이 참이면 종속문을 수행
	- 종속문이 끝나면 다시 반복 처음으로 돌아온다
*/

public class Ex01 {
	public static void main(String[] args) {
		int i = 1;			// 초기값
		
		while (i <= 5) {	// 조건식
			System.out.println(i + " : Hello World!!!");
			i++;			// 증감식
		}
		
		System.out.println("반복 후 i = " + i);
		
		// ※ 반복을 위해선 초기, 조건, 증감의 조합을 잘해야 한다
	}
}
