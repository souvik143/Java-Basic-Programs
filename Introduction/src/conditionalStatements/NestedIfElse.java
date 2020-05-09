package conditionalStatements;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
			int result=0;
			   result = a>b?a>c?a:c:b>c?b:c;
			   System.out.println("The largest of the Three Number is " + result);
	}

}
