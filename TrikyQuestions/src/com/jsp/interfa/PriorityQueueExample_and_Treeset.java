package com.jsp.interfa;
import java.util.*;
public class PriorityQueueExample_and_Treeset {
public static void main(String[] args) {
	int a=10,b=20,c=15,d=25,e=11,f=1;
	PriorityQueue p=new PriorityQueue();
	p.add(a);
	p.add(b);
	p.add(c);
	p.add(d);
	p.add(e);
	p.add(f);
	TreeSet t=new TreeSet();
	t.add(a);
	t.add(b);
	t.add(c);
	t.add(d);
	t.add(e);
	t.add(f);
	System.out.println(p);
	System.out.println("----------------------");
	System.out.println(t);
}
}
