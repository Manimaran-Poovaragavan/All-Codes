package com.java.polymorphism;

public class Animals {
	public void Animals_sound () {
		System.out.println("The animals make a sound");
	}

}
class dog extends Animals {
	public void Animals_sound () {
		System.out.println("The dog says : bow wow");
	}
}
class big extends Animals {
	public void Animals_sound (){
		System.out.println("the big says : wee wee");
	}
}
class main {
	public static void main(String[] args) {
		Animals myAnimals = new Animals ();
		Animals mydog = new dog ();
		Animals mybig = new big ();
		myAnimals.Animals_sound();
		mydog.Animals_sound();
		mybig.Animals_sound();
		
		
	}
}