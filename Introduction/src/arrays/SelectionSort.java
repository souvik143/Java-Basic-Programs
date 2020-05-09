package arrays;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the elements of the array : ");
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			int minInd=i;
			for(int j=i; j<n; j++) {
				if(a[j]<a[minInd]) {
					minInd=j;
				}
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
		System.out.print("The sorted list is : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] +" ");

	}

  } 
	
}
