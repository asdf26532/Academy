package constructor;

class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void showInfo() {
		String msg = "%s (%d km/h)\n\n";
		System.out.printf(msg, model, speed);
	}
	
	void accel(int speed) {
		this.speed += speed;
		
		System.out.println(speed + " km/h 가속");
		showInfo();
	}
	
	void break_(int speed) {
		this.speed -= speed;
		
		System.out.println(speed + " km/h 감속");
		showInfo();
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		
		// 아래 코드가 동작하게 클래스를 작성
		Car car = new Car("모닝");		// 필드 : 모델명, 속도
		
		car.showInfo();		// 모닝 (0 km/h)
		
		car.accel(40);		// 40 km/h 가속
							// 모닝 (40 km/h)
		
		car.break_(15);		// 15 km/h 감속
							// 모닝 (25 km/h)
		
	}
}
