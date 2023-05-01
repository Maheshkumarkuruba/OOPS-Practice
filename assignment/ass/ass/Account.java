package assignment.ass.ass;

public class Account {
	String name="mahesh";
	static String bank_name="andhra prank";
	long accno=2135534454;
	String branch="hindupur";
	String ifsc="1s2e654";
	double bal=5000.0;
	public void showdetails() {
		System.out.println(accno);
		System.out.println(branch);
		System.out.println(ifsc);
		System.out.println(bal);
	}
public static void bankname() {
	System.out.println(bank_name);
}
public void deposite(double amt) {
	bal=bal+amt;
	System.out.println(bal);
}
public void with(double amt) {
	if(bal>amt) {
		bal=bal-amt;
		System.out.println(bal);
	}
	else {
		System.out.println("invalid enterd amount your bal is"+bal );
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bankname();
Account a1=new Account();
a1.showdetails();
bankname();
a1.with(2000.0);
a1.deposite(2000.0);
//System.out.println(a1);  		To find address of object

	}

}
