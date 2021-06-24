import java.util.Scanner;

public class bubbleSortStrings {
   public static void main(String []args) {
//	String str[] ;
	String temp;
	System.out.print("Enter number of strings : ");
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt() ;
    String str[] = new String[n];
    System.out.println("Enter strings : ");
    for(int i = 0; i<n; i++) {
    	str[i] = scan.next() ;
    }
	System.out.println("Strings in sorted order:");
	for (int i = 0; i < str.length; i++) {
   	   for (int j = i + 1; j < str.length; j++) {
		if (str[j].compareTo(str[i]) < 0) {
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
	   }
	   System.out.println(str[i]);
	}
   }
}