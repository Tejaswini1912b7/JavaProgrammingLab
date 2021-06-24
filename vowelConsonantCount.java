import java.util.Scanner;
public class vowelConsonantCount
 {
	public static void main(String[] args)
	{
		int count = 0 ;
		System.out.print("Enter a String : ");
		Scanner scan = new Scanner(System.in);
	    	String s = scan.next() ;
	    	char[] c = s.toCharArray();
	    	for(int ch = 0; ch < c.length; ch++) 
		{
	    		if(c[ch] == 'a' || c[ch] == 'e' || c[ch] == 'i' || c[ch] == 'o' || c[ch] == 'u' || c[ch] == 'A' || c[ch] == 'E' || c[ch] == 'I' || c[ch] == 'O' || c[ch] == 'U')
	    		count++ ;
	    	}
	    	System.out.println("Vowels count : " + count);
	    	System.out.println("Consonants count : " + (c.length - count));
	}
}
