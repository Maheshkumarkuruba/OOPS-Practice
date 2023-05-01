package com.jsp.stack;
import java.util.*;
public class StackExamples {
static int stack[];
static int top;
static void createStack(int size) {
	stack=new int[size];
	top-=1;
	System.out.println("stack was created with an size of :"+size);
}
static void push(int ele) {
	if(top==stack.length-1) {
		System.out.println("stack overflow");
	}
	else {
		top++;
		stack[top]=ele;
		System.out.println(ele+" elements are insertefd succeefully");
	}
}
static void pop() {
	if(top==-1) {
		System.out.println("stack is undeflow");
	}
	else {
		System.out.println( stack[top]+"element is poped/deleted successfully");
		stack[top]=0;
		top--;
	}
}
static void display() {
	System.out.println("===stack elements===");
	if(isEmpty()) {
		System.out.println("stack is empty...");
		
	}
	else {
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
}
static boolean isEmpty() {
	if(top==-1) {
		return true;
	}
	return false;
}
static boolean isFull() {
	if(top==stack.length-1) {
		return true;
	}
	return false;
}
static void clear() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("===welcome to the datastructure===");
		while(true) {
			System.out.println("==menu==");
			System.out.println("\n1.creat a stack\n2.push\n3.pop\n4.display\n5.isEmpty\n6.isFull\n7.clear\n8.exit");
			System.out.println("==enter the options===");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("==stack creation==");
			System.out.println("==please enter the size of the stack==");
			int size=sc.nextInt();
			createStack(size);
				break;
			case 2:
				System.out.println("==enter the elemnt to push");
				int ele=sc.nextInt();
				push(ele);
				break;
			case 3:
				System.out.println("=====pop======");
				pop();
				break;
			case 4:System.out.println("===display=====");
			display();
				break;
			case 5:boolean ans=isEmpty();
			if(ans) {
				System.out.println("stack is empty");
			}
			else {
				System.out.println("==stack is not empty");
			}
				break;
			case 6:
				boolean ans2=isFull();
				if(ans2) {
					System.out.println("stack is full");
				}
				else {
					System.out.println("==stack is not full");
				}
				break;
			case 7:
				System.out.println("=====clear=======");
				clear();
				break;
			case 8:
				System.out.println("====thankyou for using===");
				System.exit(0);
				break;
			default:
				System.out.println("invalid chpoice entered");
			
			}
		}
	}

}
