package com.jsp.collectionexamples;
import java.util.*;
class CustomizeSort implements Comparable<CustomizeSort>{
	private String name;
	private String id;
	private String password;
	public CustomizeSort(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "CustomizeSort [name=" + name + ", id=" + id + ", password=" + password + "]";
	}
	@Override
	public int compareTo(CustomizeSort o1) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o1.id) ;
	}
}

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizeSort c1=new CustomizeSort("mahesh","101","1244");
		CustomizeSort c2=new CustomizeSort("rahesh","103","1245");
		CustomizeSort c3=new CustomizeSort("kahesh","102","1246");
		PriorityQueue<CustomizeSort> pq= new PriorityQueue<CustomizeSort>();
		pq.add(c1);
		pq.add(c2);
		pq.add(c3);
		//		for(CustomizeSort val:pq) {
		//		System.out.println(val);   //if we use foreach loop we will not get proper maner of sorting order to avoid this we use while loop and poll()
		//		}
		while(pq.size()!=0) {
			System.out.println(pq.poll());
		}
	}

}
