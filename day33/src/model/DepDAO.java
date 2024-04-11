package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.EmpDepVO;

public class DepDAO extends DAO {
	
	public List<EmpDepVO> selectAll() {
		String sql = "select idx, dep_name, dep_phone "
						+ "from dep "
						+ "order by idx";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmpDepVO> list = new ArrayList<>();
			
			while (rs.next()) {
				EmpDepVO row = new EmpDepVO();
				
				row.setDep_idx(rs.getInt("idx"));
				row.setDep_name(rs.getString("dep_name"));
				row.setDep_phone(rs.getString("dep_phone"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectAll 예외 : " + e.getMessage());
		
		} finally {
			close();
		}
		
		return null;
	}
}
