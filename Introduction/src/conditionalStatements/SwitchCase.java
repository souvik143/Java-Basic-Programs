package conditionalStatements;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter the Day Of Week ");
		Scanner sc= new Scanner(System.in);
		int dayOfWeek=sc.nextInt();
		switch(dayOfWeek) {
		case 1:
			System.out.println("I'am on leave");
			break;
		case 2:
			System.out.println("I'am in office");
			break;
		case 3:
			System.out.println("I'am playing football");
			break;
		
		default:
			System.out.println("I don't know wat day it is");	
			}

	}

}
