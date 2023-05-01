package com.jsp.interfa;
class Test1{
	public static void demo() {
		System.out.println("demo1");
	}
	public void sample() {
		System.out.println("sample1");
	}
}
class Test2 extends Test1{
	public static void demo() {
		System.out.println("demo2");
	}
	public void sample() {
		System.out.println("sample2");
	}
}
public class StaticMethodOverriding {
	public static void main(String[] args) {
		Test2 t=new Test2();
		Test1 t1=new Test1();
		t.demo();
		t.sample();
		t1.demo();
		t1.sample();

	}
}
