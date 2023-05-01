package inheretance.inherentance.com;
class Account1{
	public long account;
	public double bal;
	public String owner;
	 public String branch;
	 public Account1(long account,double bal,String owner,String branch) {
		    this.account=account;
			this.bal=bal;
			this.owner=owner;
			this.branch=branch; 
	 }
	public void deposit(double amt) {	
		bal=bal+amt;
		System.out.println("after deposit :"+bal);
	}
	public  void withdraw(double amt) {
	
		if(bal>=amt) {
			bal=bal-amt;
			System.out.println("after withdraw saving accou :"+ bal);
		}
	}
	
	
}
class Saving extends Account1{
	double roi=0.5;
	public  Saving(long account,double bal,String owner,String branch) {
		super( account, bal,owner,branch);	
		bal=bal+bal*roi;
	}
	public void showdetail() {
//		System.out.println( "after interest"+bal);
		System.out.println(account);
		System.out.println(bal);
		System.out.println(owner);
		System.out.println(branch);
		}
	
}
class Current1 extends Account1{
	double min_bal=5000.0;
	public  Current1(long account,double bal,String owner,String branch) {
		super(account, bal,owner,branch);
		System.out.println("minimum bal :"+min_bal);
	}
	@Override
	public void withdraw(double amt) {
		if(bal>amt && bal-amt>=min_bal) {
			bal=bal-amt;
			System.out.println("After withdraw current account :"+bal);
		}
		else {
			System.out.println("Entered invalid amount your min_bal is :"+min_bal);
		}
	}
}

public class Account_multy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Saving s1= new Saving(1214343,0.0,"mahesh","hindupur");
//s1.showdetail();
//s1.deposit(10500.0);
//s1.withdraw(5000.0);
System.out.println("============");
//Saving s2= new Saving(115443542,0.0,"naresh","hindupur");
//s2.showdetail();
//s1.deposit(10000.0);
//s1.withdraw(1000.0);
Current1 c1=new Current1(1214343,0.0,"mahesh","hindupur");
c1.deposit(5500.0);
c1.withdraw(50.0);
	}

}
