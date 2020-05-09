package sets;

/*
 * Given an array, Find if there exists a subarray with sum equals to zero.
 */

import java.util.*;
public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		
//		int a[] = {2, 1, -3, 4, 2};                    // it will take O(n*n)time..
//		boolean found = false;
//		
//		for(int i = 0; i<a.length; i++) {
//			int sum = 0;
//			for(int j=i; j<a.length; j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
//		
//		System.out.println("found " + found);
		
		
		int a[] = {2, 1, -3, 4, 2};                    // it will take O(n)time by doing with set 
    	boolean found = false;
    	
    	Set<Integer> set = new HashSet<>();
    	int sum = 0;
    	for(int element : a) {
    		set.add(sum);
    		sum += element;
    		if(set.contains(sum)) {
    			found = true;
    			break;
    		}
    	}
    	System.out.println("found " + found);
		
	}

}
