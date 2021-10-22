package com.example.SmallWebService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.SmallWebService.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.SmallWebService.service.UserService;

@Controller
@RequestMapping(value = "/LoginPage")
public class UserController {

	@Autowired
	UserService userService;

	@ResponseBody
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public Integer login(@RequestBody UserAccount userAccount) {
		return userService.login(userAccount.getUsername(), userAccount.getPassword()).getErrCode();
	}


}
