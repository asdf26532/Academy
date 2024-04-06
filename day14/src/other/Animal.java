package other;

public abstract class Animal {
	protected String type;
	
	public Animal(String type) {
		this.type = type;
	}
	
	// 추상 메서드 -> 자식에서 오버라이딩
	public abstract void bark();
	
	public void eat(String food) {
		String msg = "%s(이)가 %s(을)를 먹는다\n";
		System.out.printf(msg, type, food);
	}
}
