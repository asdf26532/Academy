package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAO {
	private Context ct;
	private DataSource ds;
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DAO() {
		try {
			ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/oracle");
			
		} catch (NamingException e) {
			System.out.println("������ ���� : " + e.getMessage());
			
		} finally {
			close();
		}
	}
	
	private void close() {
		try {
			if (rs != null) 	rs.close();
			if (pstmt != null) 	pstmt.close();
			if (stmt != null) 	stmt.close();
			if (conn != null)	conn.close();
				
		} catch(Exception e) {}
	}
	
	public String test() {
		String sql = "select banner from v$version";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString("banner");
			
		} catch (SQLException e) {
			System.out.println("test ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public <T> List<T> query(String sql, Mapper<T> mp) {
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<T> list = new ArrayList<T>();
			
			while (rs.next()) {
				list.add(mp.maping(rs));
			}
			
			return list;
			
		} catch(SQLException e) {
			System.out.println("query ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return null;
	}

	public int update(String sql, Object... args) {
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update ���� : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
}
