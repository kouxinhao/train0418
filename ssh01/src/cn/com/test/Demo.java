package cn.com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.entity.UserTbl;
import cn.com.service.UserService;

public class Demo {
	@Test
	public void test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) context.getBean("userService");
		us.addUser(new UserTbl(0,"admin","admin"));
	}
}
