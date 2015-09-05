package com.spring.sixteen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {

	private A aobj;

	private B bobj;

	@Autowired
	public Hello(@Qualifier("ao1") A ao, @Qualifier("bo2") B bo) {
		super();
		this.aobj = ao;
		this.bobj = bo;
	}

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
