package inheretance.inherentance.com;
class Super2{
	static int c;
public Super2(int a) {
	System.out.println(" int super2 zero arg");
}
}
class Super3 extends Super2 {
	public Super3() {
		super(6);
	System.out.println("super3 zero args");
	}
	public Super3(int a,int c) {
		this();
		this.c=c;
	System.out.println(" int super3 zero args");
	System.out.println(c);
	}
}
public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super3 s=new Super3(3,10);
//System.out.println(Super2().c);

	}

}
