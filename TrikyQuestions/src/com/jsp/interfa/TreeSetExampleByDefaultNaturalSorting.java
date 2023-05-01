package com.jsp.interfa;

import java.util.TreeSet;

public class TreeSetExampleByDefaultNaturalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<String>();
		t.add("mahesh");
		t.add("kumar");
		t.add("ajay");
		for(String val:t) {
			System.out.println(val);
		}

	}

}
