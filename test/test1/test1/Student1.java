package test.test1.test1;

public class Student1 {
	String name;
	String eidno;
	 static String col_name;
	double fee;
	int marks;
	String branch;
	public Student1(String name,String eidno,double fee,int marks,String col_name,String branch) {
		this.name=name;
		this.eidno=eidno;
		this.fee=fee;
		this.marks=marks;
		this.col_name=col_name;
		this.branch=branch;
	}
	public void marks() {
		if(marks>40) {
			System.out.println(marks+"he is pass");
		}
		else {
			System.out.println(marks+"he his fail");
		}
	}
	public void branch() {
		if(branch=="cs" || branch=="is" || branch=="ec" || branch=="eee") {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	public void fee() {
		if(fee==10000.0) {
			System.out.println("he paid");
		}
		else {
			System.out.println("he not paid");
		}
	}
	
	public void paidfee(double amt) {
		fee=fee+amt;
		System.out.println(fee);
	}
	public static void colname() {
		System.out.println(col_name);
	}
	public void show() {
		System.out.println(name);
		System.out.println(eidno);
		System.out.println(fee);
		System.out.println(marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Student1 s1=new Student1("mahesh","18bj1a0324",5000.0,25,"st.marry","cs");
		s1.marks();
		s1.fee();
		s1.paidfee(5000.0);
		s1.show();
		colname();
		s1.branch();
		System.out.println("------");
		Student1 s2=new Student1("naresh","18bj1a0424",1000.0,90,"james","mech");
		s2.marks();
		s2.fee();
		s2.paidfee(5000.0);
		s2.show();
		s2.branch();
		colname();
		
	}


}
