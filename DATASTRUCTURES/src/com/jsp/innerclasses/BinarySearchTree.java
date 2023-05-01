package com.jsp.innerclasses;

public class BinarySearchTree {
	static class Node{
		int data;
		Node left,right;
		Node(int value){
			data=value;
		}
	}
	static void insert(Node n,int value) {
		if(n.data>value) {
			if(n.left!=null) {
				insert(n.left,value);
			}
			else {
				System.out.println("inserted:"+value+" towards left of:"+n.data);
				n.left=new Node(value);
			}
		}
		else if(n.data<value) {
			if(n.right!=null) {
				insert(n.right,value);
			}
			else {
				System.out.println("inserted:"+value+" towards right of:"+n.data);
				n.right=new Node(value);
			}
		}

	}
	//  in order techique
	static void inorder(Node n) {
		if(n!=null) {
			inorder(n.left);
			System.out.println(n.data+" ");
			inorder(n.right);
		}
	}
	static void preorder(Node n) {
		if(n!=null) {
			System.out.println(n.data+" ");
			preorder(n.left);
			preorder(n.right);
		}
	}
	static void postorder(Node n) {
		if(n!=null) {
			postorder(n.left);
			postorder(n.right);
			System.out.println(n.data+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node root=new Node(5);
		//insert(root,3);
		//insert(root,2);
		//insert(root,7);
		//insert(root,8);
		//insert(root,12);
		//insert(root,1);
		int[] arr= {70,18,7,19,90,80,96,101,17,77,86};
		Node root=new Node(arr[0]);
		for(int i=1;i<arr.length;i++) {
			insert(root,arr[i]);
		}
		System.out.println("====inorder traversing");
		inorder(root);
		System.out.println("====preorder traversing");
		preorder(root);
		System.out.println("====postorder traversing");
		postorder(root);



	}

}
