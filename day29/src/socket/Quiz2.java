package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 쓰레드를 활용한 양방향 통신 (= 전이중)
public class Quiz2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(14000);
		System.out.println("서버 On. 연결 대기중\n");
		
		Socket client = server.accept();
		System.out.println("클라이언트 연결");
		
		Scanner input = new Scanner(client.getInputStream());
		
		
		// 여기는 클라이언트로 부터 받을 코드를 작성
		Thread resive = new Thread(() -> {
			String msg;
			
			while (input.hasNextLine()) {
				msg = input.nextLine();
				System.out.println("\n클라 : " + msg);
			}
		});
		
		// resive.run();
		resive.start();
		
		
		// 여기는 클라이언트로 보낼 코드를 작성
		PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
		Scanner sc = new Scanner(System.in);
		String sendMsg;
		
		do {
			System.out.print("\n입력 : ");
			sendMsg = sc.nextLine();
			
			pw.println(sendMsg);
			
		} while ("0".equals(sendMsg) == false);
		
		sc.close();
		client.close();
		server.close();
		System.out.println("연결 종료");
	}
}
