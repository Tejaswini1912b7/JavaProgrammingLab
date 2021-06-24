//Java Program to check whether the given string is palindrome or not using for loop.....
import java.util.Scanner;
class palindromeFor {
   public static void main(String args[])
   {
      String reverseString="";
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter a string to check if it is a palindrome:");
      String inputString = scanner.nextLine();

      int length = inputString.length();

      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverseString = reverseString + inputString.charAt(i);

      if (inputString.equals(reverseString))
         System.out.println("Input string is a palindrome.");
      else
         System.out.println("Input string is not a palindrome.");

   }
}
