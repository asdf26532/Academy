package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.exception.LoginException;
import com.itbank.service.AccountService;
import com.itbank.vo.AccountVO;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService as;

	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", as.getAccounts());
		
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public ModelAndView login(AccountVO input, HttpSession session) 
			throws LoginException {
		
		ModelAndView mav = new ModelAndView();
		
		session.setAttribute("user", as.login(input));
		
		mav.addObject("row", 1);
		mav.addObject("path", "/");
		mav.addObject("msg", "로그인을 환영합니다");
		mav.setViewName("message");
				
		return mav;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView("message");
		
		session.removeAttribute("user");
		mav.addObject("row", 1);
		mav.addObject("msg", "로그아웃 되었습니다");
		
		return mav;
	}
	
	@GetMapping("/myPage")
	public void myPage() {}
	
	@GetMapping("/signUp")
	public void signUp() {}
	
	@PostMapping("/signUp")
	public ModelAndView signUp(AccountVO input) {
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", as.signUp(input));
		mav.addObject("msg", "가입이 환영 합니다");
		mav.addObject("path", "/account/login");
		
		return mav;
	}
}
