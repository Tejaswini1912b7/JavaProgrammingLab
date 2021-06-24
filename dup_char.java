// Java Program to find duplicate characters in a String......
//import java.util.Arrays;
import java.util.Scanner;

public class dup_char {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = scan.next();
		char[] c= s.toCharArray();
		 int count;    
	        System.out.print("Duplicate characters in the string are : ");  
	        for(int i = 0; i <c.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <c.length; j++) {  
	                if(c[i] == c[j] && c[i] != ' ') {  
	                    count++;  
	                    c[j] = '0';  
	                }  
	            }  
	            if(count > 1 && c[i] != '0')  
	                System.out.print(c[i] + "     ");  
	        }
	 }
}