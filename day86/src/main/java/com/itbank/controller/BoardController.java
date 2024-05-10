package com.itbank.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;
import com.itbank.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired 
	private BoardService bs;
	
	@GetMapping("view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/view");
		
		return mav;
	}

	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public ModelAndView write(BoardVO input, MultipartFile file) throws IOException {
		ModelAndView mav = new ModelAndView("message");
		
		int idx = bs.write(input, file);
		
		mav.addObject("row", 1);
		mav.addObject("msg", "작성 완료");
		mav.addObject("path", "/board/view/" + idx);
		
		return mav;
	}
}
