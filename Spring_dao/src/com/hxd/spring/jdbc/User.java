package com.hxd.spring.jdbc;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class User {
		private int id;
		private String name;
		private String pass;
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", pass=" + pass + "]";
		}
	
}
