package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
//		Dog d = new Dog();
//		
//		Pet p = d;
//		Animal a = d;
//		
//		d.walk();
//		p.walk();	                    // Run-time Polymorphism so, it called walk of dog method.

		greetings("Good Morning");
		
		}

	public static void greetings() {      // Compile Time Polymorphism as, it take multiple forms 
		
		System.out.println("Hi, There");
	}
	
	public static void greetings(String s) {     // Compile Time Polymorphism as, it take multiple forms 
		
		System.out.println(s);
		
	}
}
