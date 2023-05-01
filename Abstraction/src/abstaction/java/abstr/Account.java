package abstaction.java.abstr;
public class Account {
	double bal;
	public Account() {
		
	}
	public Account(double bal) {
		this.bal=bal;
	}
public void deposit(double amt) {
	bal=bal+amt;
	System.out.println(bal +"after deposit ");
}
public void withdraw(double amt) {
	if(bal>=amt) {
		bal=bal-amt;
		System.out.println(bal +"after withdraw ");
	}
	else {
		System.out.println("invalid amount");
	}
}
}
