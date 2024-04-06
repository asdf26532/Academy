package generic;

class Po <T extends Number> {
	private T x, y;
	
	Po(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Po<Integer> p1 = new Po<>(5, 6);
		Po<Double> p2 = new Po<>(3.12, 6.7);
		
		// Po<String> p3;
		// - Number를 상속 받지 않는 클래스는 생성 불가능
		
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
	}
}
