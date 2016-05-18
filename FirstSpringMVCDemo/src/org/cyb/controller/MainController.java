package org.cyb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/Hello")
	public ModelAndView hellowMvc()
	{
		String message="Welcome in first Spring MVC ";
		return new ModelAndView("First","message",message);
	}
	

}
