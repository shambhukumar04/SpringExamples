 package com.spring.seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"jlcindia.xml");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.show();
	}

}
