package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.AccountVO;
import service.HashPw;

@WebServlet("/account/findPw")
public class FindPwController extends HttpServlet {

	private static final long serialVersionUID = 700L;
	
	private Mapper<AccountVO> mp = (ResultSet rs) -> {
		AccountVO row = new AccountVO();
		
		row.setEmail(rs.getString("email"));
		row.setIdx(rs.getInt("idx"));
		row.setJ_date(rs.getDate("j_date"));
		row.setNick(rs.getString("nick"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		
		return row;
	};
	
	String path = "/WEB-INF/account/";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "findPw.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String sql = "select * from account where userid = ? and email = ?";
		String userid = req.getParameter("userid");
		String email = req.getParameter("email");
		
		DAO dao = new DAO();
		AccountVO user = dao.queryForObject(sql, mp, userid, email);
		
		String newPw = "일치하는 데이터가 존재하지 않습니다";
		
		if (user != null) {
			sql = "update account set userpw = ? where idx = ?";
			newPw = UUID.randomUUID().toString().substring(0, 6);
			
			String hashPw = HashPw.getHash(newPw);
			
			int row = dao.update(sql, hashPw, user.getIdx());
		}
		
		req.setAttribute("newPw", newPw);
		
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "msg.jsp");
		
		rd.forward(req, resp);
	}
}
