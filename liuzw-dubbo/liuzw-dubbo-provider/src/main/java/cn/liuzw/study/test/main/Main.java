
package cn.liuzw.study.test.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		context.start();
		System.out.println("dubbo-server服务正在监听，按任意键退出");
		System.in.read();
	}

}
