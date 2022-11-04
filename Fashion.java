package com.java.inheritance;

public class Fashion {
	
	String shoping  = "Online Fashion Shop" ;
	String offers = "buy one get one" ;
	
	void show_details () {
		System.out.println(shoping);
		System.out.println(offers);                               
		System.out.println("mens, womens, kids");
	}

}
     class mens extends Fashion {
    	 void mens_items() {
    
    		 System.out.println("t-shirts, jeans, trousers");
    	 }
     }
     class womens extends mens {
    	 void womens_items() {
    	  System.out.println("salwar suits, designer sarees,western tpos, ladies bags");

    	 }
    	 
     }
     class kids extends womens {
    	 void kids_items() {
    		 System.out.println("dress, toys, chappals, shoes");
    	}
     
    	 public static void main(String[] args) {
	       kids k1 = new kids ();
	       k1.show_details();
	       k1.mens_items();
	       k1.womens_items();
	       k1.kids_items();
		
		      
		}
     }
     
     