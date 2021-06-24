// Java Program to find Simple_interest......
import java.util.Scanner;

public class simple_Interest {
	public static void main(String[] args){
		double principle, rate, time ;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Principle : ") ;
		principle = scan.nextInt() ;
		System.out.print("Enter Rate : ") ;
		rate = scan.nextInt() ;
		System.out.print("Enter Time : ") ;
		time = scan.nextInt() ;
        double SI = (principle * rate * time) / 100 ;
        System.out.println("Simple Interest : "+ SI) ;
	}
}