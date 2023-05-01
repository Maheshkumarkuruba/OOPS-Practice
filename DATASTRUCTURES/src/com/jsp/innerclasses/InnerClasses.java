package com.jsp.innerclasses;

public class InnerClasses {
	InnerClasses(){
		System.out.println("innerclasses");
	}
	static class Demo{
		Demo(){
			System.out.println("i am inside demo class");
		}
	}

	class Temp{
		Temp(){
			System.out.println("i am inside temp class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InnerClasses ic=new InnerClasses();
Demo d1=new Demo();
Temp t1=ic.new Temp();// using innerclass reference(ic) because Temp class is the non static
	}

}
