package static_;

public class Ex04 {
	public static void main(String[] args) {
		// 대표적인 static만 가지는 클래스 Math
		
		System.out.println("원주율 : " + Math.PI);
		System.out.println("자연상수 : " + Math.E);
		
		
		int n = Math.abs(-5);
		
		System.out.println("n = " + n);
		System.out.println("절대값 = " + Math.abs(5));
		
		
		double m = Math.pow(2, 10);
		
		System.out.println("m = " + m);
		System.out.println("3^3 = " + Math.pow(3, 3));
		
		
		double pi = Math.PI;
		double result = Math.round(pi * 1000) / 1000.0;
		
		System.out.println("result = " + result);
		
		
		double root = Math.sqrt(2);
		
		System.out.println("root = " + root);
		System.out.println("√4 = " + Math.sqrt(4));
		
		
		System.out.println(Math.toDegrees(pi / 2));
		System.out.println("sin 90 = " + Math.sin(pi / 2));
		System.out.println("cos 0 = " + Math.cos(0));
	}
}
