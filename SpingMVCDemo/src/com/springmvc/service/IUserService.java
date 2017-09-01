package com.springmvc.service;

import com.springdc.BaseService;
import com.springdc.BeanResult;
import com.springmvc.User;

public interface IUserService extends BaseService<User>{
	public BeanResult<User> query();
}
