package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

        //@RequestMapping(method = RequestMethod.GET)
		@RequestMapping("/helloWorld")
		public String hello(ModelMap model) {
            model.addAttribute("name", "Hello World!");
            return "inter";

        }

    }