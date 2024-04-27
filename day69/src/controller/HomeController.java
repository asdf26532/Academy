package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.BoardVO;
import service.Paging;

@WebServlet("/home")
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 100L;
	
	private Mapper<BoardVO> mp = (ResultSet rs) -> {
		BoardVO row = new BoardVO();
		
		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("idx"));
		row.setNick(rs.getString("nick"));
		row.setTitle(rs.getString("title"));
		row.setV_count(rs.getInt("v_count"));
		row.setW_date(rs.getDate("w_date"));
		
		return row;
	};
	
	private Mapper<Integer> bmp = (ResultSet rs) -> {
		int boardCount = rs.getInt("total");
		
		return boardCount;
	};
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 1. 사용자가 요청한 페이지 번호
		String reqPage = req.getParameter("reqPage");
		int rp = 1;
		
		if (reqPage != null) {
			rp = Integer.parseInt(reqPage);
		}
		
		
		// 2. board 테이블 전체 게시글 수 
		DAO dao = new DAO();
		
		String bcnt = "select count(*) as total from board"; 
		List<Integer> boardCount = dao.query(bcnt, bmp);
		
		int bc = boardCount.get(0);
		
		
		// 3. 1 ~ 2번 값으로 페이징 진행
		Paging pg = new Paging(rp, bc);
		
		
		String sql = "select * from board_view "
					+ "order by idx desc "
					+ "offset ? rows "
					+ "fetch first ? rows only";
		
		
		// 4. 테이블(list)와 페이징(pg)을 지정 jsp로 전달
		req.setAttribute("list", dao.query(sql, mp, pg.getOffset(), pg.getBoardCount()));
		req.setAttribute("pg", pg);
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/WEB-INF/home.jsp");
		
		rd.forward(req, resp);
	}

}
