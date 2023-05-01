package com.jsp.interfa;

public class Final_datamembers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int m=10;
		final String s="mah";
		System.out.println(m); // o/p==5
		m=15; //ERROR WE CANNOT REINITIALIZE FINAL DATAMEMBERS
	}

}
