package com.hxd.aspect; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// 1 . 初始化 IOC容器
				ApplicationContext ctx=new ClassPathXmlApplicationContext("aspectDemo.xml");
		//2. 获取bean实例
				Calculator calculator=(Calculator) ctx.getBean("calculator");
		//3.使用bean
				int 	result=calculator.add(5, 7);
				System.out.println(result);
	}

}
