package com.hxd.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beanfactory.xml");
		Car car=(Car) ctx.getBean("car");
		Car car1=(Car) ctx.getBean("car1");
		System.out.println(car);
		System.out.println(car1);

	}

}
