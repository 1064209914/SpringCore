package com.hxd.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean_life.xml");
		Car car=(Car) ctx.getBean("car");
		ctx.close(); 
		System.out.println(car);
	}

}
