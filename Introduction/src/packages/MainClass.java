package packages;

import java.util.*;

import packages.models.*;

public class MainClass {

	public static void main(String[] args) {
		
		Student obj = new Student("Tom");
		Teacher teacher = new Teacher();
		Scanner sc=new Scanner(System.in);
		obj.getPassword();                     // Private class cant be accessed from other class.
		obj.surname();                        //  Default cannot be accessed from another package
		obj.getName();                       //   Public can be accessed from anywhere through the same packages or sub packages.  
		
	}

}
