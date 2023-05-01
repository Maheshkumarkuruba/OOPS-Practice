package com.jsp.solidprinciples;
interface Machine1{
	void scan();
}
interface Machine2{
	void print();
}
interface Machine3{
	void fax();
}
class Canon implements Machine1{
	public void scan() {
	System.out.println("scan1");
	}
}
class Nikon implements Machine1,Machine2{
	public void scan() {
		System.out.println("scan2");
	}
	public void print() {
		System.out.println("print2");
	}
}
class Epson implements Machine1,Machine2,Machine3{
	public void scan() {
		System.out.println("scan3");
	}
	public void print() {
		System.out.println("print3");
	}
	public void fax() {
		System.out.println("fax3");
	}
}
public class Interface_Seggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Epson e=new Epson();
e.scan();
e.print();
e.fax();
	}

}
