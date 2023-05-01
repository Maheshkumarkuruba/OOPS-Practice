package com.jsp.filehandlingexamples;
import java.util.*;
import java.io.*;

public class FileReaderExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("java.doc");
		try {
			FileWriter fw=new FileWriter(f);
			fw.write("mahesh");
			fw.flush();
			fw.close();
			System.out.println("date stored");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
