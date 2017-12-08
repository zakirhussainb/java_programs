package java2Novice;

public class PrimeNumbers_1000
{
	/* Write a program to find the sum of the first 1000 prime numbers. */
	
	public static void main(String args[])
	{
		int num = 2;
		int count = 0,sum = 0;
		while( count < 1000 )
		{
			if (isPrimeNumber(num))
			{
				sum += num;
				count++;
			}
			num++;
//			System.out.println("num....." + num);
		}
		System.out.println("Sum of first 1000 prime no.s is...." + sum);
	}
	public static boolean isPrimeNumber(int num)
	{
		for ( int i = 2; i <= num/2; i++ )
		{
			if ( num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
};