package com.xorbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xorbank.models.User;
import com.xorbank.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository repo;
	
	public String findOneByEmailAndPassword( String email,String password)
	{
		User user=repo.findOneByEmailAndPassword(email, password);
		if(user==null)
			return "Login failed..!";
		return "Login Succesfull..!";
		
	}

}
