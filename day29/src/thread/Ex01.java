package thread;

/*
	Thread : 쓰레드
	- 한 프로그램 내의 실행 흐름을 의미
	- java는 기본적으로 main에서 한개의 thread가 생성되고 코드가 순차적으로 수행된다
	- 이 thread는 여러개를 생성 후 실행도 가능하다. 이를 멀티 쓰레드라고 한다
*/

// Thread 클래스를 상속 받아서 생성 가능
class Test1 extends Thread {
	
	// 새로 생성할 쓰레드의 코드는 run()을 오버라이딩 한다
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		// t1.run();	실행할 코드는 run()에 구현한다
		// t2.run();
		
		t1.start();		// 새 쓰레드를 만들어 실행하려면 start()를 호출한다
		t2.start();
		
		System.out.println("끝?");
	}
}
