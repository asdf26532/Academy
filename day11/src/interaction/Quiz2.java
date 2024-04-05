package interaction;

class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}
}

class Taxi {
	String model;
	int speed;
	Human[] sits = new Human[4];
	// - 0 index : 운전석
	// - 나머지 : 보조석
	
	Taxi(String model) {
		this.model = model;
	}
	
	String isHuman(Human human) {
		// 사람이 있으면 이름을
		if (human != null) {
			return human.name;
		}
		
		// 없으면 빈좌석을 반환
		return "빈좌석";
	}
	
	void showInfo() {
		String msg = "[";
		String name;
		int i;
		
		for (i = 0; i < sits.length - 1; i++) {
			// 좌석(i)에 사람이 있는지 확인 후 결과 문자열에 누적 
			name = isHuman(sits[i]);
			msg += name + ", ";
		}
		
		name = isHuman(sits[i]);
		msg += name + "]";
		
		System.out.println(msg);
		System.out.printf("%s (%d km/h)\n\n", model, speed);
	}
	
	void rideOn(int i, Human human) {
		if (sits[i] != null) {
			System.out.println(i + "번째에는 이미 " + sits[i].name + "님이 탑승 중");
			return;
		}
		
		sits[i] = human;
		System.out.println(i + "번 좌석에 " + human.name + "탑승");
	}
	
	void accel(int speed) {
		if (sits[0] == null) {
			System.out.println("운전자가 없습니다!!!");
			showInfo();
			return;
		}
		
		this.speed += speed;
		
		System.out.println(speed + " km/h 가속");
		showInfo();
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Taxi car = new Taxi("아반떼");

		Human hong = new Human("홍길동");
		Human kim = new Human("김민수");
		Human lee = new Human("이수민");
		
		car.showInfo();			// 아반떼 : [빈좌석, 빈좌석, 빈좌석, 빈좌석]
		
		car.rideOn(0, hong);	// 0번석(= 운전석)에 홍길동 탑승
		car.rideOn(1, kim);		// 1번석에 김민수 탑승
		
		car.rideOn(1, lee);		// 1번은 이미 사람이 앉은 좌석 -> 탑승 불가
		car.rideOn(3, lee);		// 3번석에 이수민 탑승
		
		car.showInfo();			// 아반떼 : [홍길동, 김민수, 빈좌석, 이수민]
		
		car.accel(30);			// 자동차 가속 메서드
								// 운전자가 없으면 실행x
		
		
	}
}
