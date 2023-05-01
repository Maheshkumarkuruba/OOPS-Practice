package com.jsp.interfa;
//						WE CANNOT USE PROTECTED AND PRIVATE ACCESSPICIFIERS IN INTERFACE
//						WE CAN USE PUBLIC AND PACKAGE LEVEL ACCESSPECIFIERS IN INTERFACE
interface Test{
	abstract protected void demo();
	
}
public class TrickyInterface implements Test{
	public void demo() {
		System.out.println("mahebd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrickyInterface t=new TrickyInterface();
		Test m=t;
		t.demo();
	}

}
