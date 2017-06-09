package com.hxd.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// 创建 IOC 容器 对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 从 IOC容器中获取对象
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloworld");
		
		//  调用其方法
		helloWorld.say();
		
	}

}
