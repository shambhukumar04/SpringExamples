package com.spring.eighteen;

import org.springframework.beans.factory.annotation.Required;

public class Hello {
	private A aobj;
	private B bobj;

	@Required
	public void setAobj(A aobj) {
		System.out.println("Hello setBobj()");
		this.aobj = aobj;
	}

	@Required
	public void setBobj(B bobj) {
		System.out.println("Hello setAobj()");
		this.bobj = bobj;
	}

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
