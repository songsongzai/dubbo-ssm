package com.groot.dao;

import org.apache.ibatis.annotations.Param;

import com.groot.entity.User;

public interface UserDao {

	User login(@Param("name")String name, @Param("password")String password);
}
