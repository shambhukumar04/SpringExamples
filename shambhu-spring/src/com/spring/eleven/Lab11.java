 package com.spring.eleven;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab11 {
	protected static final Log logger = LogFactory.getLog(Lab11.class);

	public static void main(String[] args) {
		
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
			logger.trace("Inside main method Started trace");//1
			logger.debug("Inside main method Started debug");//2			
			logger.info("Inside main method Started Info");//3
			logger.warn("Inside main method Started warn ");//4
			logger.error("Inside main method Started error ");//5
			logger.fatal("Inside main method Started Fatal ");// 6
			Hello hello = (Hello) ctx.getBean("hello");
			hello.show();
			int s =10;
			logger.info("Inside main method  Finished"+ s);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			logger.error("Inside main method Started");
			e.printStackTrace();
		}
	}

}
