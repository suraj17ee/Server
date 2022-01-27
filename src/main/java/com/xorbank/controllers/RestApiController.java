package com.xorbank.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xorbank.models.User;
import com.xorbank.services.SignUpService;

@RestController
@RequestMapping("/signup")
public class RestApiController {
	
	@Autowired
	private SignUpService signupService;
	
	@PostMapping("/save")
	@Transactional
	public String signUpUser(User user)
	{
		signupService.saveUser(user);
		return "SignUp Successful..!";
		
	}

}
