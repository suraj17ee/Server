package com.xorbank.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xorbank.models.User;
import com.xorbank.repository.UserRepository;

@Service
public class AdminService {

	@Autowired
	private UserRepository repo;
	
	public AdminService() {}
	
	public AdminService(UserRepository repo)
	{
		super();
		this.repo=repo;
	}
	
	public Iterable<User> getAllUsers() {
		return  repo.findAll() ;
	}
	
}
