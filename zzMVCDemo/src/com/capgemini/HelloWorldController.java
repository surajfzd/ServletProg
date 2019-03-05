package com.capgemini;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "Hello Spring mvc";
		return new ModelAndView("hellopage", "message", message);
	}

}
