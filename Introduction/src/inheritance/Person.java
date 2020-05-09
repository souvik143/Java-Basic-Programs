package inheritance;

public class Person {
	
public Person(String name) {
		
		this.name=name;
		System.out.println("Inside Person constructor");
	}
	
		protected String name;
		
		public void walk() {
			
			System.out.println(name + " is walking ");
		}
		
		public void eat() {
			
			System.out.println(name + " is eating ");
		}
		
        public static void laughing() {
        	
        	System.out.println("Person is laughing");
        }
}
