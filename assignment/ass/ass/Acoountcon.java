package assignment.ass.ass;
                        // This is used for multy users ,creating multiple Constuctors
public class Acoountcon {
	String name;
	static String bank_name; 
	long accno;
	String branch;
	String ifsc;
	double bal;
	public Acoountcon(String name,long accno,String branch,String ifsc,double bal) {
		this.name=name;
		this.accno=accno;
		this.branch=branch;
		this.ifsc=ifsc;
		this.bal=bal;
	}
	public void show() {
		System.out.println(name);
		System.out.println(accno);
		System.out.println(branch);
		System.out.println(ifsc);
		System.out.println(bal);
	}
	public void with(double amt) {
		if(bal>amt) {
			bal=bal-amt;
			System.out.println(bal);
		}
		else {
			System.out.println("enter valid amount");
		}
	}
	public void dep(double amt) {
		bal=bal+amt;
		System.out.println(bal);
	}
	public static void bankname() {
		System.out.println(bank_name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Acoountcon a1=new Acoountcon("mahesh",1521456877,"hindupur","1s2de30",5000.0);
a1.show();
a1.with(1000.0);
a1.dep(2000.0);

	}

}
