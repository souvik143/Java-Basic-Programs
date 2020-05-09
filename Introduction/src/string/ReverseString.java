package string;

public class ReverseString {
	
	public String reverseWords(String s) {
		
		int i = s.length()-1;
		String ans ="";
		while(i>=0) {
			
			while(i>=0 && s.charAt(i)==' ') i--;
			
			int j=i;
			if(ans.isEmpty()) {
				
				ans = ans.concat(s.substring(i+1 , j+1));
			}
			
			else {
				
				ans = ans.concat(" " + s.substring(i+1 , j+1));
				
			}
		}
		
		return ans;
		
	}

}
