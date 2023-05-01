package constractor.overloadind.com;

public class Constructoroverloading {
	static int a;
	static double b;
	public Constructoroverloading() {
		this(22.0);
		System.out.println("zero para");
	}
	public Constructoroverloading(int a) {
		this.a=a;
		System.out.println(a);
	}
	public Constructoroverloading(double b) {
		this(20,12.0);
		this.b=b;
		System.out.println(b);
	}
	public Constructoroverloading(int a,double b) {
		this(20.0,20);
		System.out.println(a+" "+b);
	}
	public Constructoroverloading(double b,int a) {
		this(20);
		System.out.println(b+" "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Constructoroverloading();
//new Constructoroverloading(40);
//new Constructoroverloading(20.0);
//new Constructoroverloading(40,40.0);
//new Constructoroverloading(40.0,40);
	}

}
