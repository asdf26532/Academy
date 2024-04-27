package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO;
import model.Mapper;
import model.vo.AccountVO;
import service.HashPw;

@WebServlet("/account/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 400L;
	
	private String path = "/WEB-INF/account/";
	
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
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "login.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String sql = "select * from account where userid = ? and userpw = ?";
		
		// session�� request�� ���� ���� �� �ִ�
		HttpSession session = req.getSession();
		
		String cpath = req.getContextPath();
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
		
		userpw = HashPw.getHash(userpw);
		
		DAO dao = new DAO();
		AccountVO user = dao.queryForObject(sql, mp, userid, userpw);
		
		if (user != null) {
			session.setAttribute("user", user);
		}
		
		resp.sendRedirect(cpath);
	}
}
