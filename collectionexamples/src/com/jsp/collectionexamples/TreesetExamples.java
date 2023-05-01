package com.jsp.collectionexamples;
import java.util.*;
class Employee1 implements Comparable<Employee1>{
	String name;
	int id;
	int pass;
	public Employee1(String name,int id,int pass) {
		this.name=name;
		this.id=id;
		this.pass=pass;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", pass=" + pass + "]";
	}
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}

public class TreesetExamples {
	public static void addemp() {
		Employee1 emp1=new Employee1("mahesh",1321,1241);
		Employee1 emp2=new Employee1("rahesh",1322,1242);
		Employee1 emp3=new Employee1("kahesh",1323,1243);
		TreeSet<Employee1> tr=new TreeSet<Employee1>();
		tr.add(emp3);
		tr.add(emp2);
		tr.add(emp1);
//		System.out.println(tr);
		
//		RETRIVE THE ELEMENTS IN FOUR WAYS
//		Iterator<Employee1> t1=tr.iterator();
//		while(t1.hasNext()) {
//			System.out.println(t1.next());
//		}
//					OR
		
//		for(Employee1 ele:tr) {
//			System.out.println(ele);
//		}
//					OR
		tr.forEach(obj->System.out.println(obj));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addemp();
	}

}
