package interaction;

// 서로 다른 클래스 객체 간에 상호작용을 적용

class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
}


class Car {
	String model;	// 모델명
	int speed;		// 속도
	Person driver;	// 운전자 (= 사람)
	
	Car(String model) {
		this.model = model;
	}
	
	void showInfo() {
		// 운전자가 없는지(=null) 판별
		// - null인 상태에서 멤버를 참조하면 에러
		String name = (driver == null) ? "없음" : driver.name;
		
		String msg = "%s (%d km/h, %s)\n\n";
		System.out.printf(msg, model, speed, name);
	}
	
	void rideOn(Person driver) {
		this.driver = driver;
		
		System.out.println(driver.name + "님 탑승");
		showInfo();
	}
	
	void rideOff() {
		if (speed != 0) {
			System.out.println("정차 후 하차해 주세요!!!");
			return;
		}
		
		System.out.println(driver.name + "님 하차");
		
		driver = null;
		showInfo();
	}
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			return;
		}
		
		this.speed += speed;
		
		System.out.println(speed + " km/h 가속");
		showInfo();
	}
	
	void break_(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			return;
		}
		
		this.speed -= speed;
		
		System.out.println(speed + " km/h 감속");
		showInfo();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person hong = new Person("홍길동");
		Car car = new Car("아우디");

		car.showInfo();
		
		car.rideOn(hong);
		
		// 연습) 자동차 가속 메서드
		// 1. 전달한 정수만큼 속도를 증가
		// 2. 단, 운전자가 없으면 속도 증가가 되지 않게 한다
		car.accel(30);
		
		// 감속 메서드. 마찬가지로 운전자 있어야 함
		car.break_(30);
		
		// 하차 메서드. 단, 속도가 0이 아니면 불가능
		car.rideOff();
	}
}
