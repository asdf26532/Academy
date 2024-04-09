package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex02Client {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 11000);
		System.out.println("서버에 연결됨");
		
		PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
		Scanner sc = new Scanner(System.in);
		String msg;
		
		do {
			System.out.print("전송 : ");
			msg = sc.nextLine();
			
			pw.println(msg);
			
		} while ("0".equals(msg) == false);
		
		
		client.close();
		System.out.println("접속 종료");
	}
}
