package com.springmvc;

import java.awt.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdc.AbstractBaseController;
import com.springdc.BaseService;

@Controller
public class SpringController extends AbstractBaseController<List>{

	@Override
	protected BaseService<List> getBaseService() {
		return null;
	}
	
	
}
