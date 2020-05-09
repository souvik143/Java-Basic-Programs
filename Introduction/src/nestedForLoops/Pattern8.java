package nestedForLoops;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1; j<=n-1; j++) {
			for(int i=1; i<=j; i++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
