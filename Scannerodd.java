package com.java.project;
 import java.util.Scanner ;
public class Scannerodd {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	  System.out.println("enter your number");
	  int n;
	 n = sc.nextInt ();
	  
	  System.out.println("odd");
	  for (int i=1; i<=n; i++) {
		  if (i%2!=0) {
			  System.out.println(i+"");	  
		  }
		  System.out.println();
	  }
	System.out.println("even");
	for (int i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
		System.out.println();
			
		}
		System.out.println("accen");
		for (int i1 = n ; i1 >=0 ; i1--) {
			System.out.println(i1);
			
		}
		System.out.println("decc");
		for (int i2 =0; i2<=n;i2++) {
			System.out.println(i2);
		}
			
		}
		
		
  }



