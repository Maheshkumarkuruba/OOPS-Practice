package inheretance.inherentance.com;
abstract class Account3{
	String name;
	String branch;
	 String bank;
	long acco_no;
	double bal;	
	public Account3(String name,String branch,String bank,long acco_no,double bal) {
	this.name=name;
	this.branch=branch;
//	this.bank=bank;
	this.acco_no=acco_no;
	this.bal=bal;
	}	
	public void show() {
		System.out.println(name);
		System.out.println(branch);
		System.out.println(acco_no);
		System.out.println(bal);
	}
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println("AFTER DEPOSIT YOUR BAL IS : "+bal);
	}
	public abstract void withdraw(double amt); 	
}
class Saving3 extends Account3{
	public Saving3(String name,String branch,String bank,long acco_no,double bal) {
		super(name,branch,bank,acco_no,bal);
	}
public void withdraw(double amt) {
	if(bal>amt) {
	bal=bal-amt;
	System.out.println("(SAVING) AFTER WITHDRAW REMAINING BAL IS :"+bal);
	}
	else {
		System.out.println("ENTER VALID AMMOUNT");
	}
}
public void inter(double inter) {
	bal=bal+bal*inter;
System.out.println("AFTER WITHDRAW INTER "+bal);
}
}
class Current3 extends Account3{
	public Current3(String name,String branch,String bank,long acco_no,double bal) {
		super(name,branch,bank,acco_no,bal);
	}
	public void withdraw(double amt) {
		double min_bal=5000.0;
		if(bal>amt && bal-amt>=min_bal) {
			bal=bal-amt;
			System.out.println("(CURRENT)AFTER WITHDRAW BAL IS :"+bal);
		}
		else {
			System.out.println("ENTER VALID AMOUNT YOUR MIN_BAL IS :"+ min_bal);
		}
		
	}
}

public class Acco_Abstrac_tOverid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saving3 s1=new Saving3("mahesh","hindupr","andra",53154326,0.0);
		s1.show();
		s1.deposit(10000.0);
		s1.withdraw(50000.0);
		s1.inter(0.50);
		System.out.println("CURRENT=============================CURRENT ");
		Current3 c1=new Current3("mahesh","hindupr","andra",53154326,0.0);
		c1.show();
		c1.deposit(10000.0);
		c1.withdraw(5000.0);
	}

}
