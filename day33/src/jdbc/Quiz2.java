package jdbc;

import java.util.List;

import model.EmpDAO;
import model.vo.EmpDepVO;

public class Quiz2 {
	static void printEmpDep(EmpDepVO row) {
		System.out.printf("%d %s %s %d %d %s %s\n",
					row.getIdx(), row.getName(),
					row.getPosition(), row.getSalary(),
					row.getDep_idx(), row.getDep_name(),
					row.getDep_phone());
	}
	
	public static void main(String[] args) {
		// 1. emp(A)와 dep(B)의 inner join한 결과를 출력
		// 단, dep_idx로 오름 차순, A.idx로 내림 차순
		EmpDAO dao = new EmpDAO();
		List<EmpDepVO> list = dao.selectInJoin();
		
		for (EmpDepVO row : list) {
			printEmpDep(row);
		}
		System.out.println();
		
		
		// 2. emp(A)와 dep(B)의 right outer join한 결과를 출력
		// 단, dep_idx로 오름 차순, A.idx로 내림 차순
		list = dao.selectROutJoin();
		
		for (EmpDepVO row : list) {
			printEmpDep(row);
		}
	}
}
