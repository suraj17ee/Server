package com.xorbank.controllers;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xorbank.models.LoginCred;
import com.xorbank.models.User;
import com.xorbank.services.AdminService;
import com.xorbank.services.LoginService;
import com.xorbank.services.SignUpService;

@RestController
@RequestMapping("/server")
public class RestApiController {
	
	@Autowired
	private SignUpService signupService;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/save")
	@Transactional	
	public String signUpUser(@RequestBody User user)
	{
		signupService.saveUser(user);
		return user.getFirstname()+"  SignUp Successful..!";
		
	}
	
	
	@GetMapping("/all-users")
	public ResponseEntity<Iterable<User>> getAllUsers() {
		return ResponseEntity.ok().body(adminService.getAllUsers()) ;
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> findOneByEmailAndPassword( @RequestBody LoginCred login){
		return ResponseEntity.ok().body(loginService.findOneByEmailAndPassword(login)) ;
	}
}
