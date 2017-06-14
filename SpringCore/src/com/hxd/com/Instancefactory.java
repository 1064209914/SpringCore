package com.hxd.com;

import java.util.HashMap;

import com.hxd.factory.Car;

public class Instancefactory {
	private static HashMap<String,Car> cars=new HashMap<>();
	static{
		cars.put("aodi", new Car("aodi", 20000000));
		cars.put("benchi", new Car("benchi", 10000000));
		
	}
	public Car getcar(String name){
		return cars.get(name);
	}
	
}
