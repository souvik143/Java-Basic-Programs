package whileLoops;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev;
		while(temp>0) {
		    rev=rev*10;
			rev=rev+(temp%10);
			temp=temp/10;
		}
	if(rev==n)
		System.out.println(n + "is Palindrome");

	}

}
