package com.demo;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerEx {

	//@RequestMapping("/sub")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView obj = new ModelAndView();

		obj.setViewName("index.jsp");

		return obj;

	}

}