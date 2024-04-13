package dbcp;

import java.util.List;

import model.StudentDAO;
import model.vo.StudentVO;

public class Ex01 {
	public static void main(String[] args) {
		// 1. student 테이블을 모두 출력할 DAO를 작성
		// 단, DBCP를 활용해서 구현
		StudentDAO dao = new StudentDAO();
		List<StudentVO> list = dao.selectAll();
		
		for (StudentVO row : list) {
			System.out.printf("%d %s %d %d %d\n", 
					row.getIdx(), row.getName(),
					row.getKor(), row.getEng(), row.getMat());
		}
		System.out.println();
		
		
		// 2. sqldeveloper에서 std_pro라는 프로시저를 생성
		// 기능은, 학번 이름 국 영 수 합계 점수를 구해서 std_sum 테이블에 insert
		
		dao.std_pro();
		list = dao.selectSumAll();
		
		for (StudentVO row : list) {
			System.out.printf("%d %s %d\n", row.getIdx(),
					row.getName(), row.getSummary());
		}
		
	}
}
