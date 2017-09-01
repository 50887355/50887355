package com.springdc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;


public abstract class AbstractBaseController<T> {
	
	@RequestMapping("/page/helloworld")
	public String query(HttpServletRequest request){
		ResultVO<T> rs =getBaseService().query();
		request.setAttribute("result", rs.getResultlist());
		return "index";
	}
	
	protected abstract  BaseService<T> getBaseService();
}
