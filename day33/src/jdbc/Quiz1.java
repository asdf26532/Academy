package jdbc;

import java.util.List;

import model.DepDAO;
import model.EmpDAO;
import model.vo.EmpDepVO;

public class Quiz1 {
	static void printEmp(EmpDepVO row) {
		System.out.printf("%d %d %s %s %s\n",
					row.getDep_idx(), row.getIdx(),
					row.getName(), row.getPosition(),
					row.getSalary());
	}
	
	static void printDep(EmpDepVO row) {
		System.out.printf("%d %s %s\n", 
							row.getDep_idx(),
							row.getDep_name(),
							row.getDep_phone());
	}
	
	public static void main(String[] args) {
		// 1. emp 테이블의 정보를 모두 출력
		// 단, dep_idx 오름 차순, idx 내림차순
		EmpDAO edao = new EmpDAO();
		List<EmpDepVO> list = edao.selectAll();
		
		for (EmpDepVO row : list) {
			printEmp(row);
		}
		System.out.println();
		
		
		// 2. dep 테이블의 정보를 모두 출력
		// 단, idx로 오름 차순
		DepDAO ddao = new DepDAO();
		list = ddao.selectAll();
		
		for (EmpDepVO row : list) {
			printDep(row);
		}
	}
}
