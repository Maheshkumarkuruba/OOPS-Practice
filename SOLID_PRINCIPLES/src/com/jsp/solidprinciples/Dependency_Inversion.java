package com.jsp.solidprinciples;
interface User{
	 void transaction(int choice,double amt);
}
class Account{
	double bal;
	public Account(double bal) {
		this.bal=bal;
	}
	public void withdraw(double amt) {
		if(bal>amt) {
			bal=bal-amt;
		}
		else {
			System.out.println("invalid amount entered");
		}
	}
	public void deposit(double amt) {
		bal=bal+amt;
	}
}
class Atm extends Account implements User{
	public void transaction(int choice,double amt){
		if(choice==1) {
		deposit(amt);
		}
		else {
			withdraw(amt);
		}
	}
	public Atm(double bal) {
		super(bal);
	}
	
}
class Service{
	
}
public class Dependency_Inversion {

}
