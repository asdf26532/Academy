package loop;

import java.util.Scanner;

/*
	연습)
	1. 구구단 2단을 반복으로 출력 (단, x1 ~ x9까지)
	2. 1번을 완료 후 입력문으로 변경해서 입력한 구구단이 출력되게 한다
	3. 그 아래 반복을 하나 더 작성해서 역순으로 출력되게 한다 (x9 ~ x1)
*/

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, dan;
		
		System.out.print("몇 단? ");
		dan = sc.nextInt();
		
		while (i <= 9) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			i++;
		}
		System.out.println();
		
		
		i = 9;
		
		while (i >= 1) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			i--;
		}
		
		sc.close();
	}
}
