package model;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.vo.PersonVO;

public class PersonDAO extends DAO {

	public List<PersonVO> selectAll() {
		String sql = "select * from person";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<PersonVO> list = new ArrayList<>();
			
			while (rs.next()) {
				PersonVO row = new PersonVO();
				
				Date birth = rs.getDate("birth");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String time = sdf.format(birth);
				
				row.setBirth(time);
				row.setHeight(rs.getDouble("height"));
				row.setName(rs.getString("name"));
				
				list.add(row);
			}
			
			return list;
			
		} catch(SQLException e) {
			System.out.println("select 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public int insert(PersonVO per) {
		String sql = "insert into person values(?, ?, ?)";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, per.getName());
			pstmt.setDouble(2, per.getHeight());
			pstmt.setDate(3, per.getBirth());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int delete(String name) {
		String sql = "delete from person where name = ?";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete 예외 : " + e.getMessage());
		
		} finally {
			close();
		}
		
		return 0;
	}

	public PersonVO selectOne(String name) {
		String sql = "select * from person where name = ?";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			PersonVO row = new PersonVO();
			
			Date birth = rs.getDate("birth");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String time = sdf.format(birth);
			
			row.setBirth(time);
			row.setHeight(rs.getDouble("height"));
			row.setName(rs.getString("name"));
			
			return row;
			
		} catch (SQLException e) {
			System.out.println("selectOne 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public int update(PersonVO per, String oldName) {
		String sql = "update person " + 
						"set " + 
							"name = ?, " + 
							"height = ?, " + 
							"birth = ? " + 
						"where name = ?";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, per.getName());
			pstmt.setDouble(2, per.getHeight());
			pstmt.setDate(3, per.getBirth());
			pstmt.setString(4, oldName);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());

		} finally {
			close();
		}
		
		return 0;
	}
}
