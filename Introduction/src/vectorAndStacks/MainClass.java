package vectorAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
			
		MyStack<Integer> stack = new MyStack<>();
			
			stack.push(12);
			stack.push(34);
			stack.push(67);
			
			int popped = stack.pop();			
				System.out.println(popped);      // the last element inserted will be popped
			
			 popped = stack.pop();
				System.out.println(popped);     // the 2nd last element inserted will be popped
				
			int peeked = stack.peek();
				System.out.println(peeked);    // the head elementg will be displayed 
			
	}

}
