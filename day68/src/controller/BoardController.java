package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;

@WebServlet("/board")
public class BoardController extends HttpServlet {

	private static final long serialVersionUID = 300L;
	private String path = "/WEB-INF/board/";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "write.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 유저가 입력한 데이터 받기
		String title = req.getParameter("title");
		String contents = req.getParameter("contents");
		int user_idx = Integer.parseInt(req.getParameter("user_idx"));

		String sql = "insert into "
				+ "board(title, contents, user_idx) "
				+ "values(?, ?, ?)";
		
		DAO dao = new DAO();
		int row = dao.update(sql, title, contents, user_idx);
		
		System.out.println(row == 0 ? "실패" : "성공");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath);
	}
	
}
