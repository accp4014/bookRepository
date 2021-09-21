package com.java1234.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java1234.dao.UserDao;
import com.java1234.entity.UserEntity;
import com.java1234.model.UserModel;

@Controller
@RequestMapping("/book")
public class LoginController {
	
	@Resource
	private UserDao userDao;

	@RequestMapping("/index")
	public String index() {
		
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String login(UserModel userModel) {
		UserEntity userEntity = null;
		try { 
			 userEntity = userDao.getUserInfo(userModel.getUserName(), userModel.getPassword());
		}catch(Exception e) {
			e.printStackTrace();
			return "login";
		}
		if(userEntity == null) {
			return "login";
		}
		return "forward:/list";
	}
}
