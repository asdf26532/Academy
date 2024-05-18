package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;
import com.itbank.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;

	@GetMapping
	public ModelAndView home(BoardVO input) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("map", bs.getBoards(input));
		mav.setViewName("board/list");
		
		return mav;
	}
	
	@GetMapping("/view")
	public ModelAndView view(@RequestParam(name = "idx") int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(BoardVO input) {
		bs.addBoard(input);
		
		return "redirect:/board";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(name = "idx") int idx) {
		bs.deleteBoard(idx);
		
		return "redirect:/board";
	}

	@GetMapping("update")
	public ModelAndView update(@RequestParam(name = "idx") int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/add");
		
		return mav;
	}
	
	@PostMapping("update")
	public String update(BoardVO input) {
		bs.updateBoard(input);
		
		return "redirect:/board";
	}
}
