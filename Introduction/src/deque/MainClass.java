package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(12);
		ad.addFirst(34);
		
		ad.pop();
		System.out.println(ad.peek());
	}

}
