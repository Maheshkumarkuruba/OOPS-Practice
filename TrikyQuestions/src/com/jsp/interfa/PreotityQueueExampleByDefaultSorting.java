package com.jsp.interfa;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PreotityQueueExampleByDefaultSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> t=new PriorityQueue<String>();
		t.add("mahesh");
		t.add("kumar");
		t.add("ajay");
		t.add("banu");
		for(String val:t) {
			System.out.println(val);
		}

	}

}
