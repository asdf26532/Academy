package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO를 활용해서 Person 테이블을 모두 출력
class PersonDAO extends DAO {
	
	List<PersonVO> selectAll() {
		String sql = "select * from person";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<>();
			
			while (rs.next()) {
				PersonVO row = new PersonVO();
				
				row.setBirth(rs.getDate("birth"));
				row.setHeight(rs.getDouble("height"));
				row.setName(rs.getString("name"));
				
				list.add(row);
			}
			
			return list;
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
		
		} finally {
			close();
		}
		
		return null;
	}
}


public class Quiz1 {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		
		for (PersonVO row : dao.selectAll()) {
			System.out.println(row);
		}
	}
}
