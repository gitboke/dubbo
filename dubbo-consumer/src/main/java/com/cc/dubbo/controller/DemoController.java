package com.cc.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cc.dubbo.service.DemoService;

@Controller
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@ResponseBody
	@RequestMapping("/demo")
	public String say(@RequestParam("name")String name){
		return demoService.sayHello(name);
	}
}
