package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {                // blocks always executes first, before main method
		
		System.out.println(" in block 1");
	}
	
	static {                  // blocks always executes first, before main method
		
		System.out.println("in block 2");
	}
	

	public static void main(String[] args) { 
		
		A objA = new A();
		B objB = objA.new B();
		
		C objC = new A.C();
		System.out.println("inside main ");
		
		

	}
	
	static {                      // blocks always executes first, before main method
		
		System.out.println("in block 3");
	}

}
