package com.xorbank.repository;

import org.springframework.data.repository.CrudRepository;

import com.xorbank.models.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	User findOneByEmailAndPassword(String email,String password);

}
