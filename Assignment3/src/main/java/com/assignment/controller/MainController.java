package com.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@GetMapping("/welcome")
	public ModelAndView getMsg(@RequestParam String name)
	{
		String msgTxt = name+", Welcome home..";
		ModelAndView mav= new ModelAndView();
		System.out.println(msgTxt);
		mav.addObject("msg",msgTxt);
		mav.setViewName("index");
		return mav;
	}
}
