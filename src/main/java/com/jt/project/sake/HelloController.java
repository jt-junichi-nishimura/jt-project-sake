package com.jt.project.sake;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/top")
	public String top(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
		return "Hello";
	}
}
