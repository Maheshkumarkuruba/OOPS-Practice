package constractor.overloadind.com;
                                 // Best example for constructor overloading ,Facebook
public class Facebooklogin {
	String email;
	long phno;
	String pw;
	public Facebooklogin(String email,String pw) {
//		System.out.println(email);
		this.email=email;
		this.pw=pw;
		
	}
public Facebooklogin(long phno,String pw) {
	this.phno=phno;
	this.pw=pw;	
}
public void display() {
	System.out.println("emal "+email);
	System.out.println("phno "+phno);
	System.out.println("pw "+pw);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebooklogin a1=new Facebooklogin("abs@123","asx2431");
		a1.display();
		System.out.println("==========================");
		Facebooklogin a2=new Facebooklogin(213236,"asx2431");
		a2.display();
	}

}
