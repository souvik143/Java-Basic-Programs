package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>();          
//		Set<String> fruits = new LinkedHashSet<>();    // The "Linked" here works as to maintain the order of output.
//		Set<String> fruits = new TreeSet<>();         // It give the output in a sorted order.(Here Alphabetically)
//		
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set<Integer> y = new HashSet<>();
		y.add(3);
		y.add(1);
		y.add(16);
		
//		x.addAll(y);                                           // Union
//		System.out.println(x);
		
//		x.retainAll(y);                                      // Intersection
//		System.out.println(x);
		
		System.out.println(x.containsAll(y));

	}

}
