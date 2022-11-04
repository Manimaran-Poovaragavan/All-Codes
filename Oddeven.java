package com.java.project;

public class Oddeven {
	
	public static void main(String[] args) {
		
		int n =20 ;
		
		System.out.println("odd"+"        "+"even");
		for (int i = 1 ; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			else
			System.out.print(i+"           ");
		}
		
	}

}
