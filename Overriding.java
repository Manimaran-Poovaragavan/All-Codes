package com.java.project;

public class Overriding {
	int amount = 300;
	void payment () {
		System.out.println("mobile bill , Tv recharge , shopping");
	}
	}
     class gpay extends Overriding {
	int amount =200 ;
	void payment () {
		super.payment();
		System.out.println("darect bank to bank transfar"+amount);
		System.out.println("parent amount"+super.amount);
	}
    public static void main(String[] args) {
	       gpay O = new gpay();
	       O.payment();
	     
	     
	}
}
