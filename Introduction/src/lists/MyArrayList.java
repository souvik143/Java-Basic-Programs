package lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List <String> fruits = new ArrayList();
		List<String> vegetables = new ArrayList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		for(String e: temp) {
			
			System.out.println(e);
		}
		
//		System.out.println(fruits.isEmpty());              // to check weather the list is empty or not.
		
//		System.out.println(fruits.contains("Guava"));      // to check weather its in the list or not.
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple"); 
//		toRemove.add("Hi");		
//		fruits.removeAll(toRemove);           // remove particular things by selecting.
		
//		fruits.remove(2);                      // remove method is used to remove 
		
//		fruits.clear();                    // clear is used to clear everything in a second.
		
//		fruits.set(1," Banana ");	          // set method is used to replace 
		
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		
//		fruits.addAll(vegetables);              // addAll is uses to join lists
		
		System.out.println(fruits);
		
//		System.out.println(fruits.get(1));               // get for index 
		
//		ArrayList <Integer> marks = new ArrayList();
//		
		Pair <String , Integer>p1 = new Pair("Souvik" , 111);
		Pair <Boolean , String>p2 = new Pair(true ,"Hello");
		
		p1.getDescription();
		p2.getDescription(); 
	}

}
