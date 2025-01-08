package com.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	@GetMapping("/welcome")
	public String getMsg(@RequestParam String name)
	{
		String msgTxt = name+", Welcome home..";
		
		return msgTxt;
	}
}
