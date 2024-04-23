package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EncodingFilter implements Filter {

	
	// doFilter : ���� �ּҷ� ��û�� ������ ����Ǵ� �޼���
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// �ʿ��� ������ �����Ѵ�
		HttpServletRequest req = (HttpServletRequest)request;
		
		req.setCharacterEncoding("utf-8");
		req.setAttribute("cpath", req.getContextPath());
		req.setAttribute("encoding", req.getCharacterEncoding());
		
		// �� �� ���� ��û�Ϸ��� �������� �̾��ش�
		chain.doFilter(request, response);
	}

	// init : ���� ����� ���� �ѹ��� ����Ǵ� �޼���
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	// destroy : ���� ����� ���� �ѹ��� ����Ǵ� �޼���
	@Override
	public void destroy() {}
}
