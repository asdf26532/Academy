package thread;

import java.util.Scanner;

public class Ex03 {
	// 입력 진행 동안 같이 실행할 코드
	static Thread timer = new Thread(() -> {
		for (int i = 10; i >= 1; i--) {
			System.err.println(i + "초 남았습니다");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("입력 완료");
				break;
			}
		}
	});
	
	
	public static void main(String[] args) {
		
		// 입력을 진행할 쓰레드
		Thread inputTh = new Thread(() -> {
			Scanner sc = new Scanner(System.in);
			String msg;
			
			System.out.print("입력 : ");
			msg = sc.nextLine();
			
			timer.interrupt();
			
			System.out.println("\n입력한 정보는 " + msg + "입니다");
			sc.close();
		});
		
		
		inputTh.start();
		timer.start();
	}
}
