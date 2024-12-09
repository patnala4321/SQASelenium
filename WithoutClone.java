package javaprgs;

class Test { 
	 int x, y; 
	 Test() 
	 { 
	     x = 10; 
	     y = 20; 
	 } 
}

public class WithoutClone {

	public static void main(String[] args) throws InterruptedException {
		Test ob1 = new Test(); 

	     System.out.println(ob1.x + " " + ob1.y); 
	     
	  
	     

	     // Creating a new reference variable ob2  pointing to same address as ob1 
	     Test ob2 = ob1;
	     
	     System.out.println(ob2.x + " " + ob2.y); 
	     
	     

	     // Any change made in ob2 will 
	     // be reflected in ob1 
	   
	     ob1.y=45;

	     System.out.println(ob1.x + " " + ob1.y); 
	     
	     
	     System.out.println(ob2.x + " " + ob2.y); 
	     
	     ob2.y=98;
	     
	     System.out.println(ob1.x + " " + ob1.y); 
	     
	     
	     System.out.println(ob2.x + " " + ob2.y); 
	     
		
	     Thread.sleep(1000);
	}
}
