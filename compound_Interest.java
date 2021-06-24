// Java Program to find Compound_interest
import java.util.Scanner;
public class compound_Interest 
{
	public static void main(String args[])
	{
		double principle, rate, time ;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Principle : ") ;
		principle = scan.nextInt() ;
		System.out.print("Enter Rate : ") ;
		rate = scan.nextInt() ;
		System.out.print("Enter Time : ") ;
		time = scan.nextInt() ;
        		double CI = principle *(Math.pow((1 + rate / 100), time)) ;
        		System.out.println("Compound Interest is "+ CI) ;
	}
}