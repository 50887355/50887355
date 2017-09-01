package com.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.springdc.BeanResult;
import com.springmvc.User;
import com.springmvc.service.IUserService;

public class UserServiceImpl implements IUserService{

	@Override
	public BeanResult<User> query() {
		 
		BeanResult<User> rs = new BeanResult<>();
		List<User> list= new ArrayList<>();
		User s = new User();
		s.setName("无敌了");
		list.add(s);
		rs.setResultlist(list);
		return rs;
	}

	
	
}
