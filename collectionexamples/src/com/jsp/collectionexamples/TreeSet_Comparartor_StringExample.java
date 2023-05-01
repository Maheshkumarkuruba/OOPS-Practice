package com.jsp.collectionexamples;

import java.util.Comparator;
import java.util.TreeSet;

class StringExample implements Comparator<StringExample>{
	private String name;
	private String id;
	private String branch;

	public StringExample(String name, String id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "StringExample [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	//public int compare(StringExample o1, StringExample o2) {
	//	// TODO Auto-generated method stub
	//	return o1.compareTo(o2);
	//}	
	public int compare(StringExample o1, StringExample o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
public class TreeSet_Comparartor_StringExample {
	public static void test() {
		StringExample s1=new StringExample("naresh","1231","banglore");
		StringExample s2=new StringExample("ajay","1232","london");
		StringExample s3=new StringExample("bhanu","1234","usa");
		//		StringExample sc=new StringExample();
		TreeSet<StringExample> tlist=new TreeSet<StringExample>(s2);
		tlist.add(s3);
		tlist.add(s2);
		tlist.add(s1);
		for(StringExample val:tlist) {
			System.out.println(val);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}


}
