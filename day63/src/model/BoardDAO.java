package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.vo.BoardVO;
import service.Paging;

public class BoardDAO extends DAO {
	private BoardVO mapper(ResultSet rs) throws SQLException {
		BoardVO row = new BoardVO();
		
		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("idx"));
		row.setNick(rs.getString("nick"));
		row.setTitle(rs.getString("title"));
		row.setView_count(rs.getInt("view_count"));
		row.setW_date(rs.getDate("w_date"));
		
		return row;
	}
	
	public int totalBoard() {
		String sql = "select count(*) as count from board";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getInt("count");
			
		} catch (SQLException e) {
			System.out.println("totalBoard ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public Map<String, Object> selectAll(int reqPage) {
		// ����¡ ��ü�� ����Ʈ�� ��� ���� Map�� ����
		Map<String, Object> map = new HashMap<>();
		
		// ����¡ ����
		Paging pg = new Paging(reqPage, totalBoard());
		
		
		String sql = "select * from board " + 
				"order by idx desc " + 
				"offset ? rows " + 
				"fetch first ? rows only";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, pg.getOffset());
			pstmt.setInt(2, pg.getBoardCount());
			
			rs = pstmt.executeQuery();
			
			List<BoardVO> list = new ArrayList<>();
			
			while (rs.next()) {
				list.add(mapper(rs));
			}
			
			// �ʿ� ��ȯ�� ��ü�� ����
			map.put("list", list);
			map.put("pg", pg);
			
			return map;
			
		} catch (SQLException e) {
			System.out.println("selectAll ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public int viewUp(int idx) {
		String sql = 
				"update board " + 
						"set view_count = view_count + 1 " + 
				"where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("viewUp ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public BoardVO selectOne(int idx) {
		String sql = "select * from board where idx = ?";
		
		try {
			viewUp(idx);
			
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			return mapper(rs);
			
		} catch (SQLException e) {
			System.out.println("selectOne ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public int insert(BoardVO input) {
		String sql = "insert into "
				+ "board(title, nick, contents) "
				+ "values(?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getTitle());
			pstmt.setString(2, input.getNick());
			pstmt.setString(3, input.getContents());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			close();
		}
		
		return 0;
	}

	public int delete(int idx) {
		String sql = "delete from board where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete ���� : " + e.getMessage());
		}
		
		return 0;
	}

	public int update(BoardVO input) {
		String sql = "update board "
				+ "set "
					+ "title = ?, "
					+ "contents = ? "
				+ "where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getTitle());
			pstmt.setString(2, input.getContents());
			pstmt.setInt(3, input.getIdx());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
}
