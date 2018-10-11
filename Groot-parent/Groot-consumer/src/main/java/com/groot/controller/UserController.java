package com.groot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groot.entity.User;
import com.groot.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	

	  @Autowired
	  private UserService userService;
	  
	  @RequestMapping("/login")
		public String login(String name,String password,Model model){
			
			//登录
		  	User user=userService.login(name,password);
			System.out.println("ussks"+user);
			if(user!=null){
				
				model.addAttribute("msg", "成功");
				return "success";
			}
			else
				model.addAttribute("msg", "失败");
			return "login";
			}
}
