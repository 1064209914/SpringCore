package com.hxd.aspect;
import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component @Aspect
public class LoggingAspect {
		//声明这是一个前置通知	  并说明监听的方法
	@Before("execution(public int com.hxd.aspect.Calculator.*(int, int))")
	public void before()throws Throwable {
		System.out.println("我输出了。。。。");
	}
	
}
