package com.jsp.collectionexamples;

import java.util.Arrays;

class Employee{
	String eid;
	String name;
	double sal;
	public Employee(String eid,String name,double sal){
		this.eid=eid;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

public class EmployeeObject {
	public static void addempdetails() {
	Employee emp1=new Employee("121s","mahesh",121.45);
	Employee emp2=new Employee("122s","mahesh",122.45);
	Employee emp3=new Employee("123s","mahesh",123.45);
	Employee alist[]= {emp1,emp2,emp3};
	for(int i=0;i<alist.length;i++) {
		System.out.println(alist[i]);	
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeObject em=new EmployeeObject();
em.addempdetails();
	}

}
