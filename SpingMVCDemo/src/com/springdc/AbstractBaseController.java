package com.springdc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.JsonViewResponseBodyAdvice;

import com.springmvc.User;


public abstract class AbstractBaseController<T> {
	
	@ResponseBody
	@RequestMapping("/page/helloworld")
	public BeanResult<T> query(HttpServletRequest request){

		return getBaseService().query();
	}
	
	protected abstract  BaseService<T> getBaseService();
}
