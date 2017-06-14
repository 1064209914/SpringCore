package com.hxd.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("初始化执后"+arg0+"---Bean名字---"+arg1);
		Car car =new Car();
		car.setBrand("奔驰");
		return car;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("初始化执行前"+arg0+"---Bean名字---"+arg1);
		return arg0;
	}

}
