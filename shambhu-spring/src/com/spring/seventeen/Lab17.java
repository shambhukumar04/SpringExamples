package com.spring.seventeen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.eleven.Lab11;

public class Lab17 {
	protected static final Log logger = LogFactory.getLog(Lab17.class);

	public static void main(String[] args) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"jlcindia17.xml");
			logger.info("Inside main method Started Info");
			System.out.println("---Spring container is now Ready---");
			Hello hello = (Hello) ctx.getBean("hello");
			hello.show();
			int s = 17;
			logger.info("Inside main method  Finished :" + s);
		} catch (BeansException e) {
			logger.error("Inside main method Started");
			e.printStackTrace();
		}
	}

}
