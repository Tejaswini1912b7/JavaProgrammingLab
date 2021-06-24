// Java Program to reverse words in a String......
import java.lang.* ;
import java.util.Scanner ;
import java.io.*;
import java.util.*;

public class reverseString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = scan.next();
		for(int i=s.length()-1; i>=0;i--){  
	        char c = s.charAt(i);  
	        System.out.print(c);  
	} 
	}
}