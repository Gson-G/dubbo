
package com.liuzw.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		context.start();
		System.out.println("dubbo-server服务正在监听，按任意键退出");
		System.in.read();
	}

	public static void main2(String[] args) throws Exception {
		com.alibaba.dubbo.container.Main.main(args);
	}

}
