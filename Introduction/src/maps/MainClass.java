package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
//		Map<String , Integer> numbers = new HashMap<>();
//		
//		numbers.put("one" , 1);
//		numbers.put("two" , 2);
//		numbers.put("three" , 3);
//		
//		System.out.println(numbers.get("two"));
//		
//		Set<Entry<String , Integer>> entries = numbers.entrySet();
//		
//		for(Entry<String , Integer> entry : entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		
//		System.out.println(numbers);
		
		System.out.println(getHash("CAT"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i=0; i<s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
