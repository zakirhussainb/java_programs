package java2Novice;

import java.util.*;

public class DuplicateNumberFromAList
{
	/* Find out duplicate number between 1 to N numbers */
	
	public static void main(String args[])
	{
		int dup = 0;
		List<Integer> num = new ArrayList<Integer>();
		for( int i=1; i < 30; i++ )
		{
			num.add(i);
		}
		System.out.println("Your List of Numbers is " + num);
		num.add(22);
		dup = findDupNumberUsingList(num);
		System.out.println("Duplicate Number in the List is " + dup);
	}
	public static int getSumArray(int arr[])
	{
		int sum = 0;
		for(int i : arr)
		{
			sum += i;
		}
		return sum;
	}
	public static int findDupNumberUsingList(List<Integer> num)
	{
		int highestNumber = num.size()-1;
		System.out.println("highestNumber.....: " + highestNumber);
		
		int total = getSum(num);
		System.out.println("total.....: " + total);
		
		int duplicate = total - ( highestNumber * ( highestNumber + 1 )/2 );
		System.out.println("duplicate.....: " + duplicate);
		
		
		return duplicate;
	}
	public static int getSum(List<Integer> num)
	{
		int sum = 0;
		for( int i : num )
		{
			sum += i;
		}
		return sum;
	}
};