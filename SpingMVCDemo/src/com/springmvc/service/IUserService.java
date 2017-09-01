package com.springmvc.service;

import com.springdc.BaseService;
import com.springdc.ResultVO;
import com.springmvc.User;

public interface IUserService extends BaseService<User>{
	public ResultVO<User> query();
}
