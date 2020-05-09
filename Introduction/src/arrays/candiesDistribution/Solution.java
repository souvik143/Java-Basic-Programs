package arrays.candiesDistribution;

import java.util.Arrays;

public class Solution {          // Only the function is here, the full code is not here.
	
	static long candies(int n , int[] a) {
		
		int c[] = new int[n];
		Arrays.fill(c, 1);
		
		for(int i=1; i<n; i++) {
			
			if(a[i] > a[i-1]) {
				c[i] = c[i-1]+1;
			}
		}
		
		for(int i=n-2; i>=0; i--) {
			
			if(a[i] > a[i+1]) {
				c[i] = Math.max(c[i+1]+1, c[i]);
			}
		}
		
		long sum=0;
		
		for(int i=0; i<n; i++) {
			
			sum = sum + (long)c[i];
		}
		
		return sum;
	}

}
