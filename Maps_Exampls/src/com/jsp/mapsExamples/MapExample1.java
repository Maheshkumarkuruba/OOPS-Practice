package com.jsp.mapsExamples;
import java.util.*;
public class MapExample1 {
	public static void test() {
		HashMap<Integer,String> hlist=new HashMap<Integer,String>();
		hlist.put(1,"mahesh");
		hlist.put(2, "java");
		hlist.put(3, "sql");
		hlist.put(4, null);
		hlist.put(5,"web");
		hlist.put(4, "replace");
	Set<Integer> keys=hlist.keySet();
	System.out.println(hlist.get(0));
	for(Integer key:keys) {
		System.out.println(key+"->"+hlist.get(key));
	}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}

}
