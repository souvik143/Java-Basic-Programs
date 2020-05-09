package methods;

public class PassByValue {

	public static void main(String[] args) {
		int c=43;
		int d=12;
		swap(c,d);
		System.out.println(c+" "+d);

	}
	
	static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}
