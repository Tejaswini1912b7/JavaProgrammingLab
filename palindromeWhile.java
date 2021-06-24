//Java Program to check whether the given string is palindrome or not using while loop.
import java.util.Scanner;
class palindromeWhile {
   public static void main(String args[])
   {
      String reverseString="";
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter a string to check if it is a palindrome:");
      String inputString = scanner.nextLine();

      int length = inputString.length();
      int i = length-1;
      while ( i >= 0){
          reverseString = reverseString + inputString.charAt(i);
          i--;
      }
      if (inputString.equals(reverseString))
         System.out.println("Input string is a palindrome.");
      else
         System.out.println("Input string is not a palindrome.");

   }
}
