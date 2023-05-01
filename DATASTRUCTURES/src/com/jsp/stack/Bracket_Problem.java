package com.jsp.stack;

public class Bracket_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String brac="((((()))";
		char a[] =brac.toCharArray();
for(int i=0;i<a.length;i++) {
	if(a[i]=='(') {
		for(int j=i+1;j<a.length;j++) {
			if(a[j]==')') {
				count++;
				a[j]='\0';
			}
		}
	}
}
if(count==a.length/2) {
	System.out.println("brackets are balanced");
}
else {
	System.out.println("brackets are not balanced");
}
	}

}
