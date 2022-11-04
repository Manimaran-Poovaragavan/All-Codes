package com.java.project;

public class Overloading {
	void sum (int a, int b)
	{
		int s = a + b ;
		System.out.println("sum of the two num"+s);
	}
	void sum (int a, int b, int c)
	{
		int t = a + b + c ;
		System.out.println("sum of the three num"+t);
		
	}
	public static void main(String[] args) {
		Overloading a = new Overloading();
		     a.sum(20, 12);
		     a.sum(8, 9, 7);
	}
}
	   
 
//    int sum (int x, int y) {
//		int a = x + y ;
//		System.out.println("int num is"+a);
//		return a;
//	}
//	double sum (double x ,double y, double z) {
//		double b = x + y + z ;
//		System.out.println("double num is"+b);
//		return b;
//		
//	}
//public static void main(String[] args) {
//	Overloading O = new Overloading();
//	O.sum(22, 12);
//	O.sum(12.12, 20.20, 21.21);
//}
//}
//     void sum (int x, double y) {
//    	 double a = x * y ;
//    	 System.out.println("sum a is"+"  "+a);
//     }
//     void sum(double x, int y) {
//    	 double b = x * y ;
//    	 System.out.println("sum b is"+"  "+b);
//     }
//     public static void main(String[] args) {
//		Overloading O = new Overloading();
//		O.sum(15, 12.22);
//		O.sum(22.51, 25);
//	}
//}
