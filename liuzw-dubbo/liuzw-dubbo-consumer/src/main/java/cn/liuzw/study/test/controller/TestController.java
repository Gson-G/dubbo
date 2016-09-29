package cn.liuzw.study.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.liuzw.study.test.apis.TestService;

@Service
public class TestController {
	
	@Autowired
	private TestService testService;
	
	public void test1(){
		testService.test1();
	}

}
