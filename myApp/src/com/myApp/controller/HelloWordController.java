package com.myApp.controller;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloWordController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView helloWorld(){
	
		//String message = "";
		System.out.println("Inside controller");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		
		return new ModelAndView("welcome", "message", message);
		
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView helloWorldPost(){
	
		//String message = "";
		System.out.println("Inside controller");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		
		return new ModelAndView("welcome", "message", message);
		
	}
}
