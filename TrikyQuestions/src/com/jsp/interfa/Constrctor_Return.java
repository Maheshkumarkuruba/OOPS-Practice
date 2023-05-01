package com.jsp.interfa;
//								WE USE RETURN TYPE WITHOUT ANY VALUES OR PRINT STATEMEMTS
class Mahesh{
//	 static int a;
	protected Mahesh() {
		System.out.println("mahesh kum");
	}
	public static void test() {
	int  a=10;
	}
}
public class Constrctor_Return {
	private Constrctor_Return() {
		System.out.println("mahesh kumar");
//		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrctor_Return r=new Constrctor_Return();
		Mahesh m=new Mahesh();
	}

}
