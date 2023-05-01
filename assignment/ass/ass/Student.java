package assignment.ass.ass;
//                     Developing the multiple constructor for multiple users
public class Student {
	String name;
	String eidno;
	 static String col_name;
	double fee;
	int marks;
	public Student(String name,String eidno,double fee,int marks) {
		this.name=name;
		this.eidno=eidno;
		this.fee=fee;
		this.marks=marks;
	}
	public void marks() {
		if(marks>40) {
			System.out.println(marks+"   he is pass");
		}
		else {
			System.out.println(marks+"  he is fail");
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
	public void pendfee(double amt) {
		fee=fee-amt;
		System.out.println("pendd fee  "+fee);
	}
	public static void colname(String col_name) {
		System.out.println(col_name);
	}
	public void show() {
		System.out.println(name);
		System.out.println(eidno);
		System.out.println(fee);
		System.out.println(marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colname("s.tmarrys");
Student s1=new Student("mahesh","18bj1a0324",10000.0,35);
s1.show();
s1.fee();
s1.pendfee(5000.0);
s1.marks();
System.out.println("===========");
Student s2= new Student("naresh","dbs435",10000.0,70);
s2.show();
s2.fee();
s2.pendfee(8000.0);
s2.marks();
	}

}
