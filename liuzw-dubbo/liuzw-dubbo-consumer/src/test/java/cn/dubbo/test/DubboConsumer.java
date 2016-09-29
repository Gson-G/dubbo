package cn.dubbo.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.liuzw.study.test.controller.TestController;


public class DubboConsumer {
	private static final Log log = LogFactory.getLog(DubboConsumer.class);

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
			context.start();
			TestController testController=context.getBean(TestController.class);
			testController.test1();
			log.debug("========================================");
		} catch (Exception e) {
			log.error("== DubboProvider context start error:",e);
		}
		synchronized (DubboConsumer.class) {
			while (true) {
				try {
					DubboConsumer.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:",e);
				}
			}
		}
	}}
