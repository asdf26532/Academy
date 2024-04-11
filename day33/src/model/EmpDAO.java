package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.EmpDepVO;

public class EmpDAO extends DAO {

	public List<EmpDepVO> selectAll() {
		String sql = "select dep_idx, idx, name, position, salary "
						+ "from emp "
						+ "order by dep_idx, idx desc";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmpDepVO> list = new ArrayList<>();
			
			while (rs.next()) {
				EmpDepVO row = new EmpDepVO();
				
				row.setDep_idx(rs.getInt("dep_idx"));
				row.setIdx(rs.getInt("idx"));
				row.setName(rs.getString("name"));
				row.setPosition(rs.getString("position"));
				row.setSalary(rs.getInt("salary"));
				
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

	public List<EmpDepVO> selectInJoin() {
		String sql = "select A.idx, name, position, salary, dep_idx, dep_name, dep_phone "
						+ "from emp A "
						+ "inner join dep B "
						+ "on A.dep_idx = B.idx "
						+ "order by dep_idx, A.idx desc";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmpDepVO> list = new ArrayList<>();
			
			while (rs.next()) {
				EmpDepVO row = new EmpDepVO();
				
				row.setIdx(rs.getInt("idx"));
				row.setName(rs.getString("name"));
				row.setPosition(rs.getString("position"));
				row.setSalary(rs.getInt("salary"));
				row.setDep_idx(rs.getInt("dep_idx"));
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

	public List<EmpDepVO> selectROutJoin() {
		String sql = "select A.idx, name, position, salary, dep_idx, dep_name, dep_phone "
						+ "from emp A "
						+ "right outer join dep B "
						+ "on A.dep_idx = B.idx "
						+ "order by dep_idx, A.idx desc";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<EmpDepVO> list = new ArrayList<>();
			
			while (rs.next()) {
				EmpDepVO row = new EmpDepVO();
				
				row.setIdx(rs.getInt("idx"));
				row.setName(rs.getString("name"));
				row.setPosition(rs.getString("position"));
				row.setSalary(rs.getInt("salary"));
				row.setDep_idx(rs.getInt("dep_idx"));
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
