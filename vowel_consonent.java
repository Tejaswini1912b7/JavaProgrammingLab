// Java Program to check whether input character is vowel or consonant ......
import java.util.Scanner;

public class vowel_consonent {
	public static void main(String[] args){
		System.out.print("Enter a character : ");
	    Scanner scan = new Scanner(System.in);
	    char ch = scan.next().charAt(0) ;
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is VOWEL");
        else
            System.out.println(ch + " is CONSONANT");
	}
}
