package javaprgs;

class Test_x implements Cloneable {
	int x, y;

	Test_x() {
		x = 10;
		y = 20;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneTest {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		Test_x ob1 = new Test_x();

		System.out.println(ob1.x + " " + ob1.y);

		// Creating a new reference variable ob2 pointing to same address as ob1
		Test_x ob2 = ob1;

		System.out.println(ob2.x + " " + ob2.y);

		// Any change made in ob2 will
		// be reflected in ob1

		ob1.y = 45;

		System.out.println(ob1.x + " " + ob1.y);

		System.out.println(ob2.x + " " + ob2.y);

		ob2.y = 98;

		System.out.println(ob1.x + " " + ob1.y);

		System.out.println(ob2.x + " " + ob2.y);

		Thread.sleep(1000);

		Test_x ob3 = (Test_x) ob1.clone();

		ob3.x = 50;
		
		//Observe ob1 value/s not changed after cloning; 
		//Because cloning create seperate references to different memory locations

		System.out.println(ob1.x + " " + ob1.y);

		System.out.println(ob3.x + " " + ob3.y);

	}
}
