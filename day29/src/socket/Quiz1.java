package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 양방향 (반이중)
// - 클라이언트와 서버가 서로 1번씩 메세지를 주고 받는 코드를 작성
public class Quiz1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12000);
		System.out.println("서버 On. 연결 대기 중\n");
		
		Socket client = server.accept();
		System.out.println("클라이언트 연결");
		
		// 클라이언트에 보내기 위한 객체
		PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
		Scanner sc = new Scanner(System.in);
		String serverMsg;
		
		// 클라이언트에서 받기 위한 객체
		Scanner input = new Scanner(client.getInputStream());
		String clientMsg;
		
		while (input.hasNextLine()) {
			clientMsg = input.nextLine();
			System.out.println("\n클라 : " + clientMsg);
			
			System.out.print("\n전송 : ");
			serverMsg = sc.nextLine();
			
			pw.println(serverMsg);
		}
		
		sc.close();
		client.close();
		server.close();
		System.out.println("연결 종료");
	}
}
