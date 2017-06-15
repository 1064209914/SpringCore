package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import service.UserService;

public class Test {
		public static ApplicationContext ctx;
	
	
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
	UserService userService=(UserService) ctx.getBean("service");
	
	User user=new User();
	user.setId(1);
	user.setUserName("zhangsan");
	user.setPassword("88888888");
	user.setEmail("123132@qq.com");
	userService.addNewUser(user);

	}

}
