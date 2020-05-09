package oops.interfaces;

public class Person implements Student,YouTuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();  

	}

	@Override
	public void makeVideo() {
		
		System.out.println("Person is studying");
		
	}

	@Override
	public void study() {
		
		System.out.println("Person is maiking Video");
		
	}

	@Override
	public void editVideo() {
		
		System.out.println("Youtuber is editing");
		
	} 
	
	

}
