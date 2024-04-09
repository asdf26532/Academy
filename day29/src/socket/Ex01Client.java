package socket;

import java.io.IOException;
import java.net.Socket;

public class Ex01Client {
	public static void main(String[] args) throws IOException, IOException {
		// Socket client = new Socket("192.168.112.7", 10000);
		
		// 127.0.0.1은 자기 자신의 서버를 테스트 하기 위한 Loopback 주소라고 한다
		Socket client = new Socket("127.0.0.1", 10000);
		
		System.out.println("서버에 연결 되었습니다!!!");
		
		client.close();
		System.out.println("\n연결 해제");
	}
}
