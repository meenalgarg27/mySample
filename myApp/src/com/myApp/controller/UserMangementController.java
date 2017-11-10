package com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserMangementController {
	
	@RequestMapping(value="page",method=RequestMethod.GET)
	public String enrollPage(){
		System.out.println("Inside enrollment");
		return "enrollment";
	}
	
	@RequestMapping(value = "/user" , method=RequestMethod.POST)
	public ModelAndView enrollUser(){
		System.out.println("Inside post method of enrollment");
		String message = "Enrollment has been done successfully.";
		return new ModelAndView("success", "message", message);
	}
	

	@RequestMapping(value = "/user/{id}" , method=RequestMethod.PUT)
	public ModelAndView updateUser(@RequestBody String id){
		System.out.println("Inside post method of enrollment");
		String message = "Updation has been done successfully.";
		return new ModelAndView("success", "message", message);
	}
	@RequestMapping(value = "/user/{id}" , method=RequestMethod.DELETE)
	public ModelAndView deleteUser(){
		System.out.println("Inside post method of enrollment");
		String message = "User has been deleted successfully.";
		return new ModelAndView("success", "message", message);
	}
	@RequestMapping(value = "/user/{id}" , method=RequestMethod.GET)
	public ModelAndView searchUser(){
		System.out.println("Inside post method of enrollment");
		String message = "Search completed successfully.";
		return new ModelAndView("success", "message", message);
	}
}
