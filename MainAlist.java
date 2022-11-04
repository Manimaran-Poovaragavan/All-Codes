package com.java.project;

import java.util.ArrayList;
import java.util.Collections;

public class MainAlist {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();

	names.add ("ram");
	names.add("satheesh");
	names.add ("bhuvanesh");
	names.add("vetri");
	names.add("vijay");
	names.add("thilipan");
	names.add("paul");
	names.add("kabil");
	names.add("akash");
	names.add("kalai");
	names.add("suriya");
	names.add("sriram");
System.out.println(names);	

	names.set(1, "siva");
	System.out.println(names);
	
	names.remove(7);
	System.out.println(names);
	Collections.sort(names);
	

	for(int i=0; i<names.size(); i++) {
	System.out.println(names.get(i));
	
	}
}
}
	
	
	
	