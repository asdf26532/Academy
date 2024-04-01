package control;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// if ~ else와 if ~ if 차이는?
		
		Scanner sc = new Scanner(System.in);
		String adult = "";
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age > 19) {
			adult += "성인";
		}
		if (age < 19) {
			adult += "미성년자";
		}
		
		System.out.println(adult + " 입니다");
		
		sc.close();
		
		// 흐름)
		// 이전 -> if_1 -> if_2 -> 다음
		
	}
}
