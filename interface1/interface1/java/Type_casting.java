package interface1.interface1.java;
class Sample{
	int a=12;
	public void test1() {
		System.out.println("test1");
	}
}
class Demo extends Sample{
	int b=11;
}
class Demo1 extends Sample{
	
}

public class Type_casting {
	public void test(Demo d) { 	//Sample s=new Demo();
		System.out.println("test");
		System.out.println(d.a);
		d.test1();
	}
	public static void main(String[]args) {
		/*
		 * Demo d1=new Demo(); Sample s1=d1; Demo d2=(Demo)s1; Demo1 d3=new Demo1();
		 * Type_casting c1=new Type_casting(); c1.test(s1);
		 */
		
		Demo d1=new Demo(); Sample s1=d1;Sample s2=new Sample();Demo d2=(Demo)s1; Demo1 d3=new Demo1();
		System.out.println(d1 instanceof Sample);
		System.out.println(s1 instanceof Demo);
		System.out.println(s2 instanceof Demo);
//		System.out.println(d1 instanceof Demo1);			Error
		System.out.println("================");
		Type_casting c1=new Type_casting(); 
		c1.test(d1);
	}

}
