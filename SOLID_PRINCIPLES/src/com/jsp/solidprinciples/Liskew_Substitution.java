package com.jsp.solidprinciples;
interface Animal{
	void walk();
}
abstract class Bird implements Animal{
	public void walk() {
		
	}
	public abstract void fly();
}
class Sparrow extends Bird{
	public void fly() {
		System.out.println("flying");
	}
}
class Parrot extends Bird{
	public void fly() {
		System.out.println("flying");
	}
}
class Orstrich implements Animal{
	public void walk() {
	System.out.println("walking");
	}
}
public class Liskew_Substitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
