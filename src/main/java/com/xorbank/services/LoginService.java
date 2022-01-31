package com.xorbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xorbank.models.LoginCred;
import com.xorbank.models.User;
import com.xorbank.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	private UserRepository repo;

	public String findOneByEmailAndPassword(LoginCred login){
		User user = repo.findOneByEmailAndPassword(login.getEmail(), login.getPassword());

		if (user == null)
			return "Email or password invalid..!";
		else
			return "Login Succesfull..!";

	}

}
