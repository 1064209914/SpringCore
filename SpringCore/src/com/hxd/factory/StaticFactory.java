package com.hxd.factory;

import java.util.HashMap;

import com.hxd.factory.Car;

public class StaticFactory {
		public static HashMap<String,Car> cars=new HashMap<String, Car>();
		static{
			cars.put("aodi",new Car("aodi",2000000));
			cars.put("benchi",new Car("benchi", 500000000));
		}
		
	
	public static Car getcar(String name){
		return cars.get(name);
	}
}
