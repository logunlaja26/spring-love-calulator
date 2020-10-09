package com.lyomann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyomann.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto ){
		
		
		
		return "user-registration-page";
	}
}
