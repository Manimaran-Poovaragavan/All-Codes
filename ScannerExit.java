package com.java.project;
import java.util.Scanner;
public class ScannerExit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name");
		String name = sc.next();
		
		System.out.println("enter your father name");
		String fname = sc.next();
		
		System.out.println("exit");
		String ex = sc.next();
		System.out.println(name+""+fname);
	}
}
