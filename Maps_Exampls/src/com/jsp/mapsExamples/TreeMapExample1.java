package com.jsp.mapsExamples;
import java.util.*;
class Student{
	String name;
	String id;
	double fee;
	public Student(String name, String id, double fee) {
		super();
		this.name = name;
		this.id = id;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", fee=" + fee + "]";
	}
}

public class TreeMapExample1 {
	public static void test() {
		Student s1=new Student("mahesh","18bj1a",2000.0);
		Student s2=new Student("ramesh","18bj1a",2000.0);
		Student s3=new Student("suresh","18bj1a",2000.0);
		TreeMap<Integer,Student> tlist=new TreeMap<Integer,Student>();
		tlist.put(1, s1);
		tlist.put(2, s2);
		tlist.put(3, s3);
		System.out.println(tlist.get(1));
		Set<Integer> s=tlist.keySet();
		for(Integer keys:s) {
			System.out.println(keys+" "+tlist.get(keys));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}

}
