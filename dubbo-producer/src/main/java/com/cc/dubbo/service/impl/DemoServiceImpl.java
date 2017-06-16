package com.cc.dubbo.service.impl;

import com.cc.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "hello "+name;
	}

}
