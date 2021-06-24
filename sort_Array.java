// Java Program to sort an Array......
import java.util.Arrays;
import java.util.Scanner;

public class sort_Array {
	public static void main(String[] args){
		int n, i, j ;
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Enter Size of the Array : ");
		n = scan.nextInt() ;
		int a[] = new int[n];
		System.out.println("Enter elements of the array : ");
		for(i = 0; i<n; i++) {
			a[i] = scan.nextInt() ;
		}
		Arrays.sort(a);  
		System.out.println("Elements of the sorted array : ");
		for(i = 0; i<n; i++) {
			System.out.println(a[i]) ;
		}
	}
}