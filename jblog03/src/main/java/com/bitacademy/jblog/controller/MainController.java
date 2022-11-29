package com.bitacademy.jblog.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitacademy.jblog.controller.MainController;

@Controller
public class MainController {
	private static final Log Logger = LogFactory.getLog(MainController.class);
	
	@RequestMapping("")
	public String index() {
		return "main/index";
	}
}