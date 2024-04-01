package input;

import java.util.Scanner;

/*
	Scanner의 함수
	1. next() : 문자열을 읽어 온다
	2. next자료형() : 지정 자료형으로 읽어 온다
*/

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
	
		System.out.print("true/false : ");
		bo = sc.nextBoolean();
		
		System.out.println("bo = " + bo);
		
		
		System.out.print("\nbyte : ");
		by = sc.nextByte();
		
		System.out.println("by = " + by);
		
		
		System.out.print("\nshort : ");
		sh = sc.nextShort();
		
		System.out.println("sh = " + sh);
		
		
		System.out.print("\nint : ");
		it = sc.nextInt();
		
		System.out.println("it = " + it);
		
		
		System.out.print("\nlong : ");
		lo = sc.nextLong();
		
		System.out.println("lo = " + lo);
		
		
		System.out.print("\nfloat : ");
		fl = sc.nextFloat();
		
		System.out.println("fl = " + fl);
		
		
		System.out.print("\ndouble : ");
		db = sc.nextDouble();
		
		System.out.println("db = " + db);
		
		sc.close();
	}
}
