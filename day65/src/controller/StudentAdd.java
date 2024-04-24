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

@WebServlet("/student/add")
public class StudentAdd extends HttpServlet {

	private static final long serialVersionUID = 200L;
	private String path = "/WEB-INF/student/";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher(path + "add.jsp");
		
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		
		StudentVO input = new StudentVO(name, kor, eng, mat);
		StudentDAO dao = new StudentDAO();
		
		int row = dao.insert(input);
		System.out.println("row = " + row);
		
		response.sendRedirect("/day65/student");
	}
}
