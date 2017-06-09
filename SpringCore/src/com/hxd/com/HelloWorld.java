package com.hxd.com;

import lombok.Setter;

public class HelloWorld {
	@Setter
	private String name;
	
	public void say(){
		System.out.println("Hello   "+name);
	}
	
}
