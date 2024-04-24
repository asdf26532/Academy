package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

@WebServlet("/student/delete")
public class StudentDel extends HttpServlet {

	private static final long serialVersionUID = 300L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String sidx = request.getParameter("idx");
		int idx = Integer.parseInt(sidx);
		
		StudentDAO dao = new StudentDAO();
		int row = dao.delete(idx);
		
		response.sendRedirect("/day65/student");
	}
}
