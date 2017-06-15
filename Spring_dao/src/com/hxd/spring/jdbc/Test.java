package com.hxd.spring.jdbc;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class Test {
		private static final Logger log=Logger.getLogger(Test.class);
		private JdbcTemplate  jdbcTemplate;
		private ApplicationContext ctx;
		
		public void init(){
			ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
			this.jdbcTemplate=ctx.getBean("jdbcTemplate", JdbcTemplate.class);
			
		}
	
		public int insert(User user){
			String sql="insert users (name,pass) values(" +user.getName()+','+user.getPass() +");";
			int count=this.jdbcTemplate.update(sql);
			return count;
		}
		public int update(User user){
			String sql=" update users set name=?,pass=? where id=?; ";
			int count=this.jdbcTemplate.update(sql,user.getName(),user.getPass(),user.getId());
			return count;
		}
		
		public int delete(int id){
			String sql=" delete from users where id=? ;";
			int count=this.jdbcTemplate.update(sql,id);
			return count;
		}
		
		public User getone(int id){
			String sql=" select * from users where id="+id;
			User user =this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class));
			return user;
		}
		
		public long getCount(String name){
			 String sql ="select count(*) from users where name=? ;";
			return this.jdbcTemplate.queryForObject(sql,Long.class);
		}
		
		public List<User> getUserList(){
			String sql = " select * from users ;";
			List<User> list =this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
			return list;
		}
		
		public List<User> getUserList(User user ){
			String sql = " select * from users where 1=1 and name=? and pass=? ;";
			List<User> list =this.jdbcTemplate.query(sql,new Object[] { user.getName(),user.getPass()  } , new BeanPropertyRowMapper<User>(User.class));
			return list;
		}
		
	public static void main(String[] args) {
			Test test =new Test();
			test.init();
			List<User> list=test.getUserList();
			log.info(list);
			log.info(test.delete(5));

	}

}
