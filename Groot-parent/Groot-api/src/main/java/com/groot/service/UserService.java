package com.groot.service;

import com.groot.entity.User;

public interface UserService {
	/**
	 * 验证登录demo
	 * @param name
	 * @param password
	 * @return
	 */
	public User login(String name,String password);
}
