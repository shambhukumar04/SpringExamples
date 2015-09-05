package com.spring;

public class Hello {
	private A aobj; // s.i
	private B bobj; // c.i

	public A getAobj() {
		return aobj;
	}

	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj");
		this.aobj = aobj;
	}

	public Hello(B bobj) {
		System.out.println("Hello-1arg");
		this.bobj = bobj;
	}

	public void show() {
		aobj.showA();
		bobj.showB();
	}

}
