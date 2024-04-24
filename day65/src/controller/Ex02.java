package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test2")
public class Ex02 extends HttpServlet {

	private static final long serialVersionUID = 2L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/ex02.jsp");
		
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// request.setCharacterEncoding("utf-8");
		
		// 1. 필요한 로직을 servlet 메서드에서 처리한다 (= Java 코드)
		String name = request.getParameter("name");
		String msg = "당신의 이름은 " + name + "입니다";

		
		// 2. 처리 후 화면에 띄울 데이터를 Attribute에 담는다
		request.setAttribute("msg", msg);
		
		
		// 3. 해당 페이지로 포워드 시킨다
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/ex02_result.jsp");
		
		rd.forward(request, response);
	}
}
