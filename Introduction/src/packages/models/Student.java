package packages.models;

public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name=name;
	}
	
	public String getName() {
		getPassword();               // Private can be accessed from its own class members
		return name;
	}
	
	private String getPassword() {
		return "ebhjncj@WED";
	}
	
	String surname() {
		return "Mandal"; 
	}

	

}
