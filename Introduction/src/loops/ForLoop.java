package loops;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++) {
        	sum=sum+i;
        }System.out.println("The sum of the n number is " + sum);
	}

}
