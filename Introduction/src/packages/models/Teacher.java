package packages.models;

public class Teacher {

	   public static void main(String[] agrs) {
		   
		   Student obj= new Student("Harry");
		   obj.surname();       // Default can be accessed from same package 
		   
		   obj.getName();
	   }
}
