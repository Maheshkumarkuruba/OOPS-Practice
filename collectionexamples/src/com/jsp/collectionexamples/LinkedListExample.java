package com.jsp.collectionexamples;
import java.util.*;
class TestExample implements Comparable<TestExample>{
	String name;
	String id;
	int phno;
	public TestExample(String name, String id, int phno) {
		super();
		this.name = name;
		this.id = id;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "TestExample [name=" + name + ", id=" + id + ", phno=" + phno + "]";
	}
	@Override
	public int compareTo(TestExample o) {
		// TODO Auto-generated method stub
		return phno-o.phno;
	}
}

public class LinkedListExample {
	public  static void test() {
		TestExample t1=new TestExample("mahesh","123@a",123452);
		TestExample t2=new TestExample("mahesh","123@a",123451);
		TestExample t3=new TestExample("mahesh","123@a",123453);
		LinkedList<TestExample> list=new LinkedList<TestExample>();
		list.add(t3);
		list.add(t1);
		list.add(t2);
		Collections.sort(list);
		for(TestExample el:list) {
			System.out.println(el);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}

}
