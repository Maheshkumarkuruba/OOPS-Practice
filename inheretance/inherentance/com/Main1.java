package inheretance.inherentance.com;
class Account{
	public long account;
	public double bal;
	public String owner;
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println("after deposit"+bal);
	}
	public void withdraw(double amt) {
		if(bal>=amt) {
			bal=bal-amt;
			System.out.println("after withdraw"+ bal);
		}
	}
	
	
}
class Savings extends Account{
	double roi=0.5;
	public void calculateroi() {
		bal=bal+bal*roi;
		System.out.println( "after interest"+bal);
	}
	
}
class Current extends Account{
	double min_bal=5000.0;
	public void show_minbal() {
		System.out.println("minimum bal"+min_bal);
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Current c1=new Current();
System.out.println( "minimum bal :"+ c1.min_bal);
c1.deposit(10000);
c1.withdraw(5000);
c1.show_minbal();
Savings s1=new Savings();
s1.deposit(10000);
s1.withdraw(5000);
s1.calculateroi();
	}
}
