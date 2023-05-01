package com.jsp.mapsExamples;
import java.util.*;
class TestExample2{
	String name;
	String id;
	int phno;
	public TestExample2(String name, String id, int phno) {
		super();
		this.name = name;
		this.id = id;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "TestExample2 [name=" + name + ", id=" + id + ", phno=" + phno + "]";
	}
	
}
class MapExample2 {
	public static void test() {
TestExample2 t=new TestExample2("mahesh","m1248@",12478);
TestExample2 t2=new TestExample2("mahesh","m1248@",12472);
TestExample2 t3=new TestExample2("mahesh","m1248@",12471);
HashMap<Integer,TestExample2> hlist=new HashMap<Integer,TestExample2>();
hlist.put(1,t);
hlist.put(2, t3);
hlist.put(3, t2);
Set<Integer> s=hlist.keySet();
for(Integer keys:s) {
	System.out.println(keys+" "+hlist.get(keys));
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}

}
