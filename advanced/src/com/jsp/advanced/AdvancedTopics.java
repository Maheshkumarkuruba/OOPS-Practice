package com.jsp.advanced;
class A{
	
}
public class AdvancedTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mahesh";
		String s1=new String("mahesh");
AdvancedTopics a=new AdvancedTopics();
AdvancedTopics a1=new AdvancedTopics();
A a2=new A();
System.out.println(a.hashCode());
System.out.println(a1.hashCode());
System.out.println(a.toString());
System.out.println(s.hashCode());
System.out.println(s.toString());
System.out.println(s);
System.out.println(s1.toString());
System.out.println(s1.hashCode());
System.out.println(s1.equals(s));
System.out.println(s1==s);
System.out.println(a.equals(a2));
System.out.println(a.equals(a1));
System.out.println(a.equals(a));
	}

}
