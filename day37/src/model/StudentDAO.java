package model;

import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import model.vo.StudentVO;

public class StudentDAO extends DAO {
	public List<StudentVO> selectAll() {
		String sql = "select * from student order by idx desc";
		
		try {
			conn = bds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<StudentVO> list = new ArrayList<>();
			
			while (rs.next()) {
				StudentVO row = new StudentVO();
				
				row.setEng(rs.getInt("eng"));
				row.setIdx(rs.getInt("idx"));
				row.setKor(rs.getInt("kor"));
				row.setMat(rs.getInt("mat"));
				row.setName(rs.getString("name"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("select 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public void std_pro() {
		String sql = "{call std_pro}";
		
		try {
			conn = bds.getConnection();
			cstmt = conn.prepareCall(sql);
			
			cstmt.execute();
			
		} catch(SQLException e) {
			System.err.println("std_pro 예외");
			
		} finally {
			close();
		}
	}

	// 매개변수가 없는 프로시저 호출
	public List<StudentVO> selectSumAll() {
		String sql = "select * from std_sum order by idx desc";
		
		try {
			conn = bds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<StudentVO> list = new ArrayList<>();
			
			while (rs.next()) {
				StudentVO row = new StudentVO();
				
				row.setIdx(rs.getInt("idx"));
				row.setName(rs.getString("name"));
				row.setSummary(rs.getInt("summary"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.err.println("selectSum 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	// 매개변수가 있는 프로시저 호출
	public int test4_pro(int n1, int n2) {
		String sql = "{call test4(?, ?, ?)}";
		
		try {
			conn = bds.getConnection();
			cstmt = conn.prepareCall(sql);
			
			// in 파라미터
			cstmt.setInt(1, n1);
			cstmt.setInt(2, n2);
			
			// out 파라미터
			cstmt.registerOutParameter(3, Types.INTEGER);
			
			cstmt.execute();
			
			return cstmt.getInt(3);
			
		} catch (SQLException e) {
			System.err.println("test4_pro 예외");
			
		} finally {
			close();
		}
		
		return 0;
	}

	// 함수 호출
	public int abs(int n) {
		String sql = "select abs(?) as abs from dual";
		
		try {
			conn = bds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, n);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			return rs.getInt("abs");
			
		} catch (SQLException e) {
			System.err.println("abs 예외");
			
		} finally {
			close();
		}
		
		return 0;
	}
}
