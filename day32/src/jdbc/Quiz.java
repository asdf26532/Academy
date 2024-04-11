package jdbc;

import java.util.List;
import java.util.Scanner;

import model.StudentDAO;
import model.vo.StudentVO;

/*
	student 테이블을 사용하기 위한 프로그램을 작성
	
	1. 학생 목록
	2. 학생 추가
	3. 학생 검색
	4. 학생 변경
	5. 학생 삭제
	0. 종료
*/

public class Quiz {
	
	static void showMenu() {
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 추가");
		System.out.println("3. 학생 검색");
		System.out.println("4. 학생 변경");
		System.out.println("5. 학생 삭제");
		System.out.println("0. 종료\n");
		
		System.out.print(">>> ");
	}
	
	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		Scanner sc = new Scanner(System.in);
		int menu;
		
		do {
			showMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:		
				List<StudentVO> list = dao.selectAll();
				
				for (StudentVO row : list) {
					System.out.println(row);
				}
				break;
			case 2:	
				StudentVO stu = new StudentVO();
				stu.input(sc);
				
				if (dao.insert(stu) != 0) {
					System.out.println("추가 성공");
				}
				break;
			case 3:
				System.out.print("검색할 학번 : ");
				int idx = sc.nextInt();
				
				StudentVO row = dao.selectOne(idx);
				
				if (row != null) {
					System.out.println(row);
				}
				break;
			case 4:
				StudentVO input = new StudentVO();
				input.update(sc);
				
				if (dao.update(input) != 0) {
					System.out.println("변경 성공");
				}
				break;
			case 5:
				System.out.print("검색할 학번 : ");
				idx = sc.nextInt();
				
				if (dao.delete(idx) != 0) {
					System.out.println("삭제 성공");
				}
				break;
			case 0:
				System.out.println("종료");
				break;
			default:
				System.out.println("없는 메뉴입니다");
			}
			
		} while (menu != 0);
		
		sc.close();
	}
}
