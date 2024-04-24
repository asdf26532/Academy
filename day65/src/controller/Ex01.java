package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Ex01 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// GET으로 /home으로 요청시 아래 메서드가 수행된다
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		// response.sendRedirect("/day65/WEB-INF/ex01.jsp");
		// - 리다이렉트 메세지를 받은 클라이언트가 직접 이동
		// - WEB-INF는 클라이언트에서 직접 접근이 불가능
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/WEB-INF/ex01.jsp");
		
		rd.forward(request, response);
	}
	
}
