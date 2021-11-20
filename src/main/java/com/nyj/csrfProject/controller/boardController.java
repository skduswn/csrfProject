package com.nyj.csrfProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
}
