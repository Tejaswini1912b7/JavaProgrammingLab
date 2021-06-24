import java.util.Scanner;  
public class ReadNumfromSTDIN 
{  
	public static void main(String[] args)   
	{  	
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");  

		int num = sc.nextInt();   
		sc.close();  
		System.out.println("The number entered by the user is: "+num);  
	}  
}