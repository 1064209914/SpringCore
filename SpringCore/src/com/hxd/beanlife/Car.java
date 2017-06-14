package com.hxd.beanlife;

public class Car {
	private String brand;
	public Car(){
		System.out.println("构造器方法执行了...");
	}

	public void setBrand(String brand) {
		System.out.println("设值方法执行了。。。");
		this.brand = brand;
	}
	public void init(){
		System.out.println("初始化方法执行了。。。。");
		
	}
	
	public void destory(){
		System.out.println("销毁方法执行了。。。。");
		
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	
}
