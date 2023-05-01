package test.test1.test1;

public class Member {
	int a=10;
	public void test() {
		int a=25;
		System.out.println(a);
		System.out.println(this.a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Member m1=new Member();
m1.test();
	}

}
