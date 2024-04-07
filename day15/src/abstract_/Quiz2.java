package abstract_;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
	private String name;
	private int kor, eng, mat;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int total() {
		return kor + eng + mat;
	}
	
	@Override
	public String toString() {
		String msg = "%s (국 %d, 영 %d, 수 %d) - 합 %d";
		msg = String.format(msg, name, kor, eng, mat, total());
		
		return msg;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}

public class Quiz2 {
	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Student 클래스를 작성한 후 
		// 성적 합계 순으로 내림 차순한다
		// 필드는 이름, 국 영 수를 가진다
		Student[] stus = new Student[] {
			new Student("홍길동", 79, 88, 90),
			new Student("박민지", 98, 70, 80),
			new Student("김수진", 70, 98, 82)
		};
		
		Arrays.sort(stus);
		printArr(stus);
		
		Comparator<Student> rank = 
				(Student o1, Student o2) -> {
			
			return o2.total() - o1.total();
		};
		
		Arrays.sort(stus, rank);
		printArr(stus);
		
		
		
		
	}
}
