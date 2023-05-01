package com.jsp.handling;

public class WithOutError {
public static void check(int a)throws Exception {
	System.out.println(a);
	 throw new Exception();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	   check(1);	
		}
		catch(Exception a1) {
		System.out.println("invalid");	
		}
	}

}
