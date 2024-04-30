package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService as;
	
	@GetMapping("/view")
	public ModelAndView view() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ver", as.test());
		mav.addObject("list", as.list());
		mav.setViewName("account/view");
		
		return mav;
	}

	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(Model model, AccountVO input) {
		
		int row = as.addAcc(input);
		String msg = (row == 0) ? "등록 실패" : "등록 성공";
		
		model.addAttribute("msg", msg);
		// 2. model은 request를 대체한다. 즉, forward에만 유지됨
		
		return "redirect:/account/view";
		// 1. view 이름 접두어로 redirect:를 작성시 리다이렉트 된다
	}

	@GetMapping("/delete")
	public String delete(int idx) {
		System.out.println(idx);
		
		as.delAcc(idx);
		
		return "redirect:/account/view";
	}

	@GetMapping("/update")
	public ModelAndView update(int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", as.oneAcc(idx));
		mav.setViewName("account/add");
		
		return mav;
	}
}
