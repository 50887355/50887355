package com.springdc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.JsonViewResponseBodyAdvice;

import com.springmvc.User;

public abstract class AbstractBaseController<T> {
	
	@ResponseBody
	@RequestMapping("/helloWorld")
	public BeanResult<T> query(){
		System.out.println("OK");
//	public BeanResult<T> query(PageParm pageparm,@RequestParam(value="searcharray", required=false) String searcharray){
		return getBaseService().query();
	}
	
	protected abstract  BaseService<T> getBaseService();
}
