package java2Novice;
import java.util.*;
public class PrimeNumberOrNot
{
	/* Write a program to check the given number is a prime number or not? */
	
	public static void main(String args[])
	{
		System.out.println("Enter the number.....: \n");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean result = true;
		
		for( int i = 2; i <= num/2; i++ )
		{
			if ( num % i == 0)
			{
				result = false;
			}
		}
		if(result)
			System.out.println("\n" + num + " is a prime number");
		else
			System.out.println("\n" + num + " is not a prime number");
		sc.close();
	}
};