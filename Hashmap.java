package com.java.hashmap;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		 
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("dosai", 25);
		hm.put("idly", 10);
		hm.put("vadai", 10);
		hm.put("poori", 30);
		hm.put("chappathi", 30);
		hm.put("tea", 12);
		hm.put("coffe", 15);
		
		for(String i: hm.keySet()) {
			System.out.println("key:"+i+",values:"+hm.get(i));
			
		}
		
		
		
	}

}
