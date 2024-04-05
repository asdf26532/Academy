package interaction;

class Ball {
	String type;
	
	public Ball(String type) {
		this.type = type;
	}
}

class Child {
	String name;
	Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		String type = (ball == null) ? "x" : ball.type;
		String msg = "%s (공 : %s)\n";
		
		System.out.printf(msg, name, type);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;
		String msg = "\n%s(이)가 %s(을)를 얻었다\n";
		
		System.out.printf(msg, name, ball.type);
	}
	
	void throwBall(Child tar) {
		String msg = "\n%s(이)가 %s에게 %s(을)를 던진다\n";
		
		System.out.printf(msg, name, tar.name, ball.type);
		
		tar.ball = ball;
		ball = null;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 어린이 (필드 : 이름, 공)
		Child minsu = new Child("민수");
		Child jinho = new Child("진호");
		
		minsu.showInfo();	// 민수 (공 : x)
		jinho.showInfo();	// 진호 (공 : x)
		
		
		// 공 (필드 : 타입)
		Ball baseBall = new Ball("야구공");
		
		// 어린이가 공을 얻는 메서드
		minsu.takeBall(baseBall);
		
		minsu.showInfo();	// 민수 (공 : 야구공)
		jinho.showInfo();	// 진호 (공 : x)
		
		
		// 다른 어린이에게 공을 던지는 메서드
		minsu.throwBall(jinho);
		
		minsu.showInfo();	// 민수 (공 : x)
		jinho.showInfo();	// 진호 (공 : 야구공)
		
	}
}
