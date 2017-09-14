package com.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springdc.BeanResult;
import com.springmvc.User;
import com.springmvc.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Override
	public BeanResult<User> query() {
		 
		BeanResult<User> rs = new BeanResult<>();
		List<User> list= new ArrayList<>();
		User s = new User();
		s.setName("无敌了");
		list.add(s);
		rs.setResultlist(list);
		System.out.println(s.getName());
		return rs;
	}
	
	@Override
	public String queryString() {
		 
		BeanResult<User> rs = new BeanResult<>();
		List<User> list= new ArrayList<>();
		User s = new User();
		s.setName("无敌了");
		list.add(s);
		rs.setResultlist(list);
		System.out.println(s.getName());
		return "无敌了";
	}

	
	
}
