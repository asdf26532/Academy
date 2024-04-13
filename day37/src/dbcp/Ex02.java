package dbcp;

import model.StudentDAO;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 파라미터가 있는 프로시저 호출
		StudentDAO dao = new StudentDAO();
		
		System.out.println(dao.test4_pro(5, 7));
		System.out.println(dao.test4_pro(1, 10));
		
		
		// 2. 함수는 select 문에서 그대로 호출 후 사용 가능
		System.out.println(dao.abs(-5));
		System.out.println(dao.abs(5));
		
		
		// 3. 트리거는 직접 호출이 아닌 특정 테이블에 이벤트 발생시 수행
	}
}
