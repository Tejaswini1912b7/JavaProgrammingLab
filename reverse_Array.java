// Java Program to Reverse an Array......
import java.util.Scanner;

public class reverse_Array {
	public static void main(String[] args){
		int n, i, j ;
		double sum = 0 ;
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Enter Size of the Array : ");
		n = scan.nextInt() ;
		int a[] = new int[n];
		int b[] = new int[n];
		j = n-1 ;
		System.out.println("Enter elements of the array : ");
		for(i = 0; i<n; i++) {
			a[i] = scan.nextInt() ;
		}
		for(i = 0; i<n; i++) {
			b[i] = a[j];
			j-- ;
		}
		System.out.println("Reversed elements of the array : ");
		for(i = 0; i<n; i++) {
			System.out.println(b[i]) ;
		}
	}
}