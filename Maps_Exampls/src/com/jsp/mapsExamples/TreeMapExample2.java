package com.jsp.mapsExamples;

import java.util.Set;
import java.util.TreeMap;

class Student1 implements Comparable<Student1>{
	String name;
	String id;
	int phno;
	public Student1(String name, String id, int phno) {
		super();
		this.name = name;
		this.id = id;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", fee=" + phno + "]";
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.phno-o.phno;
	}
	public void demo() {
		
	}
}

public class TreeMapExample2 {
	public static void test() {
		Student1 s1=new Student1("mahesh","18bj1a",2002);
		Student1 s2=new Student1("ramesh","18bj1a",2001);
		Student1 s3=new Student1("suresh","18bj1a",2003);
		TreeMap<Student1,Integer> tlist=new TreeMap<Student1,Integer>();
		tlist.put(s2,1);
		tlist.put(s1,2);
		tlist.put(s3,3);
//		System.out.println(tlist.get(s1));
		Set<Student1> s=tlist.keySet();
		for(Student1 keys:s) {
			System.out.println(keys+"->"+tlist.get(keys));
		}
	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
test();
	}

}
