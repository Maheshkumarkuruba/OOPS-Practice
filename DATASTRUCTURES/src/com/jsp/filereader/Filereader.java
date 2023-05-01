package com.jsp.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Filereader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
String line;
int wc=0,lc=0;
FileReader f=new FileReader("test1.txt");
BufferedReader br=new BufferedReader(f);
while((line=br.readLine())!=null) {
	String[] arr=line.split(" ");
	wc+=arr.length;
	lc++;
}
System.out.println("word count:"+wc);
System.out.println("line count:"+lc);
	}

}
