package assignment.ass.ass;

public class Employee {
//	int eid;
//	String name;
//	double sal;
	public Employee(int eid,String name,double sal)
	{
//	this.eid=eid;
//	this.name=name;
//	this.sal=sal;
		System.out.println(eid);
		System.out.println(name);
		System.out.println(sal);	
	}
	public void show() {
//		System.out.println(eid);
//		System.out.println(name);
//		System.out.println(sal);
	}
	public static void main(String[] args) {
		Employee a1= new Employee(20,"DFG",20.0);
//		a1.show();
	}

	

}
