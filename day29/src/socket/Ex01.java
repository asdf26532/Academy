package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
	소켓 (socket)
	- 네트워크 통신을 가능하게 하는 프로그래밍 인터페이스를 의미
	- Java는 Socket이라는 객체로 제공 중
	
	서버와 클라이언트
	1. Server : Service를 제공하는 자
	2. Client : Service를 이용하는 자
	
	※ Service
	- 어떠한 기능(= 프로그램)을 제 3자에게 제공하는 것
*/

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 서버 소켓 생성시 접속할 포트 번호를 지정
		ServerSocket ssk = new ServerSocket(10000);
		
		System.out.println("서버 On. 연결 대기 중");
		Socket client = ssk.accept();
		
		System.out.println("\n클라이언트가 연결 되었습니다!!!");
		System.out.println("접속 IP : " + client.getInetAddress());
		System.out.println("접속 Port : " + client.getPort());
		
		
		// 통신이 끝난 후에는 소켓을 제거하자
		System.out.println("\n접속이 해제 되었습니다");
		client.close();
		ssk.close();
	}
}
