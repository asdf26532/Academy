package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;
import model.vo.StudentVO;

@WebServlet("/student/update")
public class StudentUp extends HttpServlet {
	
	private static final long serialVersionUID = 400L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String sidx = request.getParameter("idx");
		int idx = Integer.parseInt(sidx);
		
		StudentDAO dao = new StudentDAO();
		StudentVO stu = dao.selectOne(idx);
		
		request.setAttribute("stu", stu);
		
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/student/add.jsp");
		
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		int idx = Integer.parseInt(request.getParameter("idx"));
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		
		StudentVO input = new StudentVO(name, kor, eng, mat);
		input.setIdx(idx);
		
		StudentDAO dao = new StudentDAO();
		int row = dao.update(input);
		
		response.sendRedirect("/day65/student");
	}
}
