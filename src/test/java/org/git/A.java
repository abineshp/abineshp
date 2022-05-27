package org.git;

public class A {
	private void m1() {
		System.out.println("m1");
	}
	private void m2() {
		System.out.println("m2");
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m2();
	}

}
