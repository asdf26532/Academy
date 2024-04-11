package jdbc;

import model.AccountDAO;
import model.vo.AccountVO;

public class Ex01 {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		
		System.out.println(dao.test() + "\n");
		// select banner from v$version
		
		
		for (AccountVO row : dao.selectAll()) {
			// select * from account order by idx desc
			System.out.println(row);
		}
	}
}