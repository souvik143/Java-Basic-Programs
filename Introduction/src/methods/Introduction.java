package methods;

public class Introduction {

	public static void main(String[] args) {
		int firstNo=34;
		int secondNo=23;
		int result=maxOf(firstNo,secondNo);
		System.out.println(result);

	}
	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	

}
