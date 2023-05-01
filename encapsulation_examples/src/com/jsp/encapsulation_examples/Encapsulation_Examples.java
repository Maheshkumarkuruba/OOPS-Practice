package com.jsp.encapsulation_examples;
class Bean{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class Encapsulation_Examples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bean b=new Bean();
b.setName("mahesh");
System.out.println(b.getName());

	}

}
