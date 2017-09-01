package com.springmvc;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdc.AbstractBaseController;
import com.springdc.BaseService;
import com.springmvc.service.IUserService;

@Controller
@RequestMapping("/user")
public class SpringController extends AbstractBaseController<User>{
	
	public SpringController(){
		
	}
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;

	@Override
	protected BaseService<User> getBaseService() {
		return this.userService;
	}
	
	
	
}
