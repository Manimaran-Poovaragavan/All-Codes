package com.java.project;

import java.util.ArrayList;
import java.util.LinkedList;



public class Linkedlist {
	 public static void main(String[] args) {
		ArrayList<String>cars= new ArrayList<String>();
		
		cars.add("ford");
		cars.add("suzuki");
		cars.add("bmw");
		cars.add("kia");
		cars.add("mg");
		cars.add("hyundai");
		cars.add("honda");
		cars.add("audi");
		System.out.println(cars);
		
		
		LinkedList<String>A = new LinkedList<String>();
	A.addAll(cars);
		System.out.println(A);
		
	  }
		
	}

	

