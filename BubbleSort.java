// Bubble Sort
import java.util.Scanner;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, c = 0;
		System.out.print("Enter the list size: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter any " + n + " integer numbers: ");
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int temp = 0;
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = 0; j < n - i - 1; j++)
			{
				if(a[j] < a[j+1]) 
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					c++;
				}
			}	
		}
		System.out.println("Sorted Array after Bubble Sort: ");
		for(int i = 0;i < n; i++)
		{
			System.out.print(a[i] +"  ");
		}
		System.out.println("\nTotal number of Interchanges are " + c);
	}
}

