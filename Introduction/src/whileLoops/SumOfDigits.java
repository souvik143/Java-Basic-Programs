package whileLoops;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		int sum=0;
		while(temp>0) {
			int lastDigit=temp%10;
			temp/=10;
			sum=sum+lastDigit;
			
		}
	System.out.println("The sum of the digits is " + sum);	

	}

}
