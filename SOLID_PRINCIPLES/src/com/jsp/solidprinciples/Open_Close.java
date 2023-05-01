package com.jsp.solidprinciples;
interface Manager{
	void report();
}
class Employee1 implements Manager{
	public void report() {
	System.out.println("reporting");	
	}
}
class Employee2 implements Manager{
	public void report() {
		System.out.println("reporting");
	}
}

public class Open_Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager m=new Employee1();
m.report();
	}

}
