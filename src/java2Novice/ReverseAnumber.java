package java2Novice;
import java.util.*;
class ReverseAnumber
{
	/* Write a program to reverse a number. */
	
	public static void main(String args[])
	{
		System.out.println("Enter the no. to be reversed ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int reversedNumber = 0;
		
		while ( num > 0 )
		{
			reversedNumber = (reversedNumber * 10) + (num % 10);
			num /= 10;
		}
		System.out.println("The reversed no. is " + reversedNumber);
		sc.close();
	}
};