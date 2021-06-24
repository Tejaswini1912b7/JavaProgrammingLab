// Java Program to convert char Array to String......
import java.util.Arrays;
import java.util.Scanner;

public class charArray2String {
	public static void main(String[] args){
		int n, i, j ;
		Scanner scan = new Scanner(System.in) ;
//		System.out.print("Enter Size of the Array : ");
//		n = scan.nextInt() ;
//		char c[] = new char[n];
		System.out.println("Enter elements of the array : ");
		char[] a = scan.next().toCharArray();
		String str = String. valueOf(a);
		System.out.println(str) ;
	}
}