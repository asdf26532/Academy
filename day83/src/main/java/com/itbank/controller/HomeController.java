package com.itbank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itbank.service.BoardService;

@Controller
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BoardService bs;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("list", bs.getBoards());
		
		return "home";
	}
	
	@GetMapping("/log")
	public String logTest() {
		bs.logTest();
		
		return "redirect:/";
	}

	@GetMapping("/transaction")
	public String transactionTest() throws Exception {
		bs.inserTest();
		
		return "redirect:/";
	}
}
