package com.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.springdc.ResultVO;
import com.springmvc.User;
import com.springmvc.service.IUserService;

public class UserServiceImpl implements IUserService{

	@Override
	public ResultVO<User> query() {
		 
		ResultVO<User> rs = new ResultVO<>();
		List<User> list= new ArrayList<>();
		User s = new User();
		s.setName("无敌了");
		list.add(s);
		rs.setResultlist(list);
		return rs;
	}

	
	
}
