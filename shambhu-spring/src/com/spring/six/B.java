package com.spring.six;

public class B {
	private int b;
	private String str;

	public B(int b, String str) {
		System.out.println("class--B");
		this.b = b;
		this.str = str;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", str=" + str + "]";
	}

}
