package control;

import java.util.Scanner;

/*
	버스 소요 시간)
	버스는 각 역 평균 이동 시간이 2분이다.
	하지만 10 정거장이 넘어가면 이동 시간이 4분으로 늘어나는 규칙을 가지고 있다
	이때, 사용자에게 정거장 수를 입력 받아서 소요 시간을 출력한다
	또, 60분이 넘어가면 시간/분으로 나누어 출력
	
	ex)
	1. 입력 : 5 -> 출력 : 10분
	2. 입력 : 11 -> 출력 : 24분
	3. 입력 : 21 -> 출력 : 1시간 4분 (20 + 44 = 64분)
*/

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int station, total;
		
		System.out.print("정거장 수? ");
		station = sc.nextInt();
		
		if (station <= 10) {
			total = station * 2;
			System.out.printf("소요 시간 %d분\n", total);
		}
		else {
			total = 20;
			station -= 10;
			
			total += station * 4;
			
			if (total < 60) {
				System.out.printf("소요 시간 %d분\n", total);
			}
			else {
				int hour = total / 60;
				int minute = total % 60;
				
				System.out.printf("소요 시간 %d시간 %d분\n", hour, minute);
			}
		}
		
		sc.close();
	}
}
