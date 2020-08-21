package com.k8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/getmessage")
	public String getMessage() {
		return "Good Morning India! Bharat Mata Ki Jai Ho!";
	}
}
