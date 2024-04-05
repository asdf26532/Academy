package quiz;

public class Car {
	private String model;
	private int speed;
	private Person driver;
	
	public Car(String model) {
		this.model = model;
	}
	
	public void showInfo() {
		String name = (driver == null) ? "x" : driver.getName();
		String msg = "%s (%d km/h, %s)\n\n";
		
		System.out.printf(msg, model, speed, name);
	}
	
	public void rideOn(Person driver) {
		this.driver = driver;
		
		System.out.printf("%s(이)가 탑승\n", driver.getName());
		showInfo();
	}
	
	public void accel(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			showInfo();
			return;
		}
		
		this.speed += speed;
		
		System.out.printf("%d km/h 가속\n", speed);
		showInfo();
	}
}
