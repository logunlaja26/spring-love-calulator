package com.lyomann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lyomann.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomepage() {
		
		// read the existing property by fetching it from the dto
		
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
		//writing the value to the properties by fetching to the url
		System.out.println("user name is " + userInfoDTO.getUserName());
		System.out.println("crush name is " + userInfoDTO.getCrushName());
//
		model.addAttribute("userInfo", userInfoDTO);
//		model.addAttribute("crushName", crushNameParam);

		return "result-page";
	}

}
