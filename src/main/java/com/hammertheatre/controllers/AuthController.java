package com.hammertheatre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

	@RequestMapping(value="/login")
	String login() {
		return "Login";
	}
}
