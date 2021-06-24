// Java Program to Calculate average of numbers using Array......
import java.util.Scanner;

public class average_Array {
	public static void main(String[] args){
		int n, i ;
		double sum = 0 ;
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Enter Size of the Array : ");
		n = scan.nextInt() ;
		int a[] = new int[n];
		System.out.print("Enter elements of the array : ");
		for(i = 0; i<n; i++) {
			a[i] = scan.nextInt() ;
			sum += a[i] ;
		}
		System.out.println("Average of the array : " + sum/n) ;
	}
}