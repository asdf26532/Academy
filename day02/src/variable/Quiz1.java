package variable;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 학생의 이름, 국영수 점수를 저장할 변수를 선언
		// 단, 국영수는 정수 타입으로
		String name = "김민지";
		int kor = 92, eng = 88, mat = 95;
		
		
		// 2. 1번의 변수에 값을 채운 후 아래와 같이 출력
		//
		// 결과)
		// 이름 : 김민지
		// 성적 : 국(92), 영(88), 수(95)
		System.out.println("이름 : " + name);
		System.out.printf("성적 : 국(%d), 영(%d), 수(%d)\n", kor, eng, mat);
	}
}
