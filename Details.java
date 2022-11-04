package com.java.project;



public class Details {
	
	
	public String name ;
	public String fathername;
	public String mothername;
	public int age ;
	public float mark;
	public char grade;
	public long mobilenum;
	public boolean male ;
	public static String nameget;
	public final static String last="kavi"; 
 
	public void setname (String yourname) {
		this.name=yourname;
	}
	public String getname() {
		return this.name;
	}
	public void normalmethod() {
		System.out.println("this is the normalmethod");
		
	}
	public static void staticmethod () {
		System.out.println("this is the staticmethod");
	}
	
	public Details() {}
	public Details(String name,String fathername,String mothername,int age,float mark,char grade,long mobilenum, boolean male) {
		this.name =name;
		this.fathername=fathername;
		this.mothername=mothername;
		this.age=age;
		this.mark=mark;
		this.grade=grade;
		this.mobilenum=mobilenum;
		this.male=male;
				
	}
	
	
	
	public static void main(String[] args) {
		
		Details ram=new Details();
		    ram.name ="Ramkumar";
		    ram.fathername ="Murugaiyan";
		    ram.mothername ="Malarkodi";
		    ram.age = 22 ;
		    ram.mark = 89.2f;
		    ram.grade ='A';
		    ram.mobilenum =8925676173L;
		    ram.male = true;	   
		    
		    Details akash = new Details("Akash", "Manikandan", "Malathi", 22, 82.9f, 'B', 9586302150L, true);
		    Details.nameget="vijay";
           Details sn =new Details();
           sn.setname("Vetri");
           System.out.println(sn.name);
           Details nm = new Details();
           nm.normalmethod();
           
           Details.staticmethod();
		String ramdetails=ram.name+" , "+ram.fathername+" , "+ram.mothername+" , "+ram.age+" , "+ram.mark+" , "+ram.grade+" , "+ram.mobilenum+" , "+ram.male;
		String akashdetails = akash.name+" , "+akash.fathername+" , "+akash.mothername+" , "+akash.age+" , "+akash.mark+" , "+ akash.grade+" , "+akash.mobilenum+" , "+akash.male;
		   
		 
			   System.out.println(ramdetails);
			   System.out.println(akashdetails);
			   System.out.println(nameget);
			   System.out.println(last);
		   }
		   
		}
	   
			
		
	
	
	
		
		    
		    
				
			
	

			
		
		 
		  
		  
	

	
	  
	


