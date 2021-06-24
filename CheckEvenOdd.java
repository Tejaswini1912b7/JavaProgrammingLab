// b) Java Program to Check Even or Odd Number
import java.util.Scanner;

class CheckEvenOdd
{
  	public static void main(String args[])
  	{
   		 int num;
    		 System.out.println("Enter an Integer number:");
	                    //The input provided by user is stored in num
  		  Scanner input = new Scanner(System.in);
    		  num = input.nextInt();
    		  if ( num % 2 == 0 )
       			 System.out.println("Entered number is even");
     		  else
       			 System.out.println("Entered number is odd");
  	}
}