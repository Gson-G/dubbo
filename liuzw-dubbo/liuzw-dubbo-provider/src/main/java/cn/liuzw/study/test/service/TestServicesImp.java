package cn.liuzw.study.test.service;

import java.util.List;

import org.springframework.stereotype.Service;


import cn.liuzw.study.test.apis.TestService;
import cn.liuzw.study.test.bean.TestBean;

@Service("testService")
public class TestServicesImp implements TestService {

	@Override
	public void test1() {
		System.out.println("执行 cn.liuzw.study.test.service.TestServicesImp.test1... ");
	}

	@Override
	public List<TestBean> test2() {
		System.out.println("执行 cn.liuzw.study.test.service.TestServicesImp.test2... ");
		return null;
	}

	@Override
	public void test3(TestBean b) {
		System.out.println("执行 cn.liuzw.study.test.service.TestServicesImp.test3... ");
	}

}
