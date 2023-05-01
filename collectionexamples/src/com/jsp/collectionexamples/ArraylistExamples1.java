package com.jsp.collectionexamples;
import java.util.*;
class Customer implements Comparable<Customer>{
	String name;
	int phno;    
	String pass;
	public Customer(String name,int phno,String pass) {
		this.name=name;
		this.phno=phno;
		this.pass=pass;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phno=" + phno + ", pass=" + pass + "]";
	}
	public int compareTo(Customer o) {
		return this.phno-o.phno;
	}
}

public class ArraylistExamples1 {
	public  static void addemp() {
		Customer emp1=new Customer("12s1",999992,"abc@121");
		Customer emp2=new Customer("12s2",999991,"abc@122");
		Customer emp3=new Customer("12s3",999993,"abc@123");	
		ArrayList<Customer> alist=new ArrayList<Customer>();
		alist.add(emp3);
		alist.add(emp2);
		alist.add(emp1);
//		alist.add(null);
		System.out.println(alist);
		Collections.sort(alist);
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArraylistExamples1 a2=new ArraylistExamples1();
		addemp();
	}

}
