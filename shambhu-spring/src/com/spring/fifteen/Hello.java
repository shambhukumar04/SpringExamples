package com.spring.fifteen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	@Autowired
	@Qualifier("ao2")
	private A aobj;
	@Autowired
	@Qualifier("bo1")
	private B bobj;

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
