
package com.liuzw.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.liuzw.study.test.apis.TestService;

public class Consumer {

    public static void main(String[] args) throws Exception {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        context.start();
        // 获取远程服务代理
        TestService helloService = (TestService) context.getBean("testService");
        helloService.test1();; // 执行远程方法
       System.out.println("远程方法成功执行"); // 显示调用结果
    }

}
