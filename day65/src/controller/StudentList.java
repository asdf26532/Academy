package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

@WebServlet("/student")
public class StudentList extends HttpServlet {

	private static final long serialVersionUID = 100L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		StudentDAO dao = new StudentDAO();
		
		request.setAttribute("ver", dao.test());
		request.setAttribute("list", dao.selectAll());
		
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/student/list.jsp");
		
		rd.forward(request, response);
	}
}
