package com.jsp.collectionexamples;

import java.util.Collections;
import java.util.Vector;
import java.lang.*;

class Customer1 implements Comparable<Customer1>{
	String name;
	String id;
	int password;
	public Customer1(String name,String id,int password) 
	{
		super();
		this.name=name;
		this.id=id;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Customer1 [name=" + name + ", id=" + id + ", password=" + password + "]";
	}

	@Override
	public int compareTo(Customer1 o) {
		// TODO Auto-generated method stub
		return this.password-o.password;
	}
}

public class VectorExample1 {
public static void addVector() {
	Customer1 emp1=new Customer1("mahesh","18bj1a0321",12341);
	Customer1 emp2=new Customer1("ramesh","18bj1a0322",12342);
	Customer1 emp3=new Customer1("rakesh","18bj1a0323",12343);
	Vector<Customer1> vlist=new Vector<Customer1>();
	vlist.add(emp3);
	vlist.add(emp2);
	vlist.add(emp1);
	Collections.sort(vlist);
	for(int i=0;i<vlist.size();i++) {
		System.out.println(vlist.get(i));
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
addVector();
	}

}
