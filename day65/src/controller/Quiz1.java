package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Quiz1")
public class Quiz1 extends HttpServlet {

	private static final long serialVersionUID = 4L;
	
	private void forward(String url, HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/" + url);
		
		rd.forward(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		forward("quiz1.jsp", request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String sage = request.getParameter("age");
		
		int age = Integer.parseInt(sage);
		String msg = name + "님은 미성년자 입니다";
		
		if (age >= 19) {
			msg = name + "님은 성인 입니다";
		}
		
		request.setAttribute("msg", msg);
		
		forward("quiz1_result.jsp", request, response);
	}
}
