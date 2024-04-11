package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.StudentVO;

public class StudentDAO extends DAO {

	private StudentVO mapper(ResultSet rs) throws SQLException {
		StudentVO row = new StudentVO();
		
		row.setEng(rs.getInt("eng"));
		row.setIdx(rs.getInt("idx"));
		row.setKor(rs.getInt("kor"));
		row.setMat(rs.getInt("mat"));
		row.setName(rs.getString("name"));
		
		return row;
	}
	
	public List<StudentVO> selectAll() {
		String sql = "select * from student order by idx desc";
		
		try {
			stmt = getStatement();
			rs = stmt.executeQuery(sql);
			
			List<StudentVO> list = new ArrayList<>();
			
			while (rs.next()) {
				list.add(mapper(rs));
			}
			
			return list;
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	
	public int insert(StudentVO input) {
		String sql = "INSERT INTO "
						+ "student (name, kor, eng, mat) "
						+ "VALUES (?, ?, ?, ?)";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setInt(2, input.getKor());
			pstmt.setInt(3, input.getEng());
			pstmt.setInt(4, input.getMat());
			
			return pstmt.executeUpdate();
		
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	
	public StudentVO selectOne(int idx) {
		String sql = "select * from student where idx = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			return mapper(rs);
		
		} catch(SQLException e) {
			System.err.println("일치하는 학생이 존재하지 않습니다");
			
		} finally {
			close();
		}
		
		return null;
	}

	
	public int update(StudentVO input) {
		String sql = "update student " + 
							"set name = ?, " + 
							"kor = ?, " + 
							"eng = ?, " + 
							"mat = ? " + 
						"where idx = ?";
		
		try {
			pstmt = getPrepared(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setInt(2, input.getKor());
			pstmt.setInt(3, input.getEng());
			pstmt.setInt(4, input.getMat());
			pstmt.setInt(5, input.getIdx());
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int delete(int idx) {
		String sql = "delete from student where idx = ?";
		
		try {
			pstmt = getPrepared(sql);
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.err.println("SQL 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}

	
}
