package com.jsp.collectionexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

class Student implements Comparable<Student>{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}


public class LinkedHashSetExample {
	public static void test() {
		Student s1= new Student("mahesh",22);
		Student s2= new Student("rahesh",22);
		Student s3= new Student("kahesh",22);
		LinkedHashSet<Student> li=new LinkedHashSet<Student>();
		li.add(s2);
		li.add(s1);
		li.add(s3);
		ArrayList<Student> alist=new ArrayList<Student>(li);
		Collections.sort(alist);
		for(Student val:alist) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample.test();
	}

}
