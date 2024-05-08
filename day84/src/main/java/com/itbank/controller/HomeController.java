package com.itbank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;

@Controller
public class HomeController {
	
	private static Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", bs.getBoards());
		mav.setViewName("home");
		
		return mav;
	}
	
	@GetMapping("/log")
	public String logTest() {
		log.error("에러");
		log.warn("경고");
		log.info("정보");
		log.debug("디버그");
		log.trace("추적");
		
		return "redirect:/";
	}
	
	@GetMapping("/test")
	public String txTest() {
		bs.txTest();
		
		return "redirect:/";
	}
	
}
