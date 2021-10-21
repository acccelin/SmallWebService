package com.example.SmallWebService.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.SmallWebService.UserAccount;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
public class UserController {
	
	   
	   @GetMapping("/LoginPage")
	    public String userAccountForm(Model model) {
	        model.addAttribute("userAccount", new UserAccount());
	        return "LoginPage";
	    }

//	    @PostMapping("/userAccount")
//	    public String userAccountSubmit(@ModelAttribute UserAccount userAccount) {
//	        return "LoginPage";
//	    }

}
