package com.xorbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xorbank.models.User;
import com.xorbank.repository.UserRepository;

@Service
public class SignUpService {
	
	@Autowired
	private UserRepository repo;
	
	public SignUpService() {}
	public SignUpService(UserRepository repo)
	{
		super();
		this.repo=repo;
	}
	public void saveUser(User user)
	{
		repo.save(user);
	}

}
