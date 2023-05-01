package com.jsp.hashmap;

public class HasMap {
	static int[] hashmap;
	static int hash;
	static void createHashMap(int size) {
		hashmap=new int[size];
		hash=size;
		for(int i=0;i<hashmap.length;i++) {
			hashmap[i]=-1;
		}
		System.out.println("hashmap is created");
	}
static void insert(int ele) {
	int index=ele%hash;
	if(hashmap[index]!=-1) {
		System.out.println("element already occupied");
		
		
	}
	else {
		hashmap[index]=ele;
		System.out.println("element is been added in key"+index);
	}
}
static void delete(int ele) {
	int index=ele%hash;
	if(hashmap[index]==ele) {
		hashmap[index]=-1;
		System.out.println("element was deleted");
	}
	else {
		System.out.println("element is not present");
	}
}
static void reset() {
	for(int i=0;i<hash;i++) {
		hashmap[i]=-1;
	}
}
static void display() {
	for(int i=0;i<hashmap.length;i++) {
		if(hashmap[i]!=-1) {
		System.out.println(hashmap[i]);
	}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
createHashMap(5);
insert(20);
insert(2);
insert(40);
insert(70);
insert(50);
display();

	}

}
