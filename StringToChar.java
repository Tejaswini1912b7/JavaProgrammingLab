public class StringToChar
{  
	public static void main(String args[])
	{  
		String s="HELLO WORLD"; 
		System.out.println("Given String : \"HELLO WORLD\"");   
		System.out.println("String To Characters : ");
		for(int i=0; i<s.length();i++)	
		{  
        			char c = s.charAt(i);  
   			
        			System.out.println("Character at index "+i+" is : "+c);  
		}   
	}
}  
