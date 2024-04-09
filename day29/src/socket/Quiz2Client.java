package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Quiz2Client {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 14000);
		System.out.println("서버에 연결\n");
		
		Scanner input = new Scanner(client.getInputStream());
		
		Thread resive = new Thread(() -> {
			String msg;
			
			while (input.hasNextLine()) {
				msg = input.nextLine();
				System.out.println("\n클라 : " + msg);
			}
		});
		
		resive.start();
		
		
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
		System.out.println("연결 종료");
	}
}
