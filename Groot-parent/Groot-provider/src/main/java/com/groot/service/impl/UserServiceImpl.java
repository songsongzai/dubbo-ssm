package com.groot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groot.dao.UserDao;
import com.groot.entity.User;
import com.groot.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User login(String name, String password) {
		// TODO Auto-generated method stub
		return userDao.login(name, password);
	}

}
