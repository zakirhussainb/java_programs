package geeksForgeeks;

import java.util.*;

class LinearSearch
{
	public static int linearSearch(int arr[] , int num) 
	{
		System.out.println("*********************************Implementing Linear Search***************************************");
		int comparisons = 0;
		for( int i = 0; i < arr.length; i++ )
		{
			comparisons++;
			if ( arr[i] == num ) 
			{
				System.out.println("Number of comparisons made.....: " + comparisons);
				return i;
			}
		}
		return -1;
	}
}

class BinarySearch
{
	public static int binarySearch(int[] arr, int src) 
	{
		//sample array = 2,3,4,5,6,7----num-2,,,,low-0,high-5,mid-4
		int low = 0;
		int high = arr.length - 1;
		int midIx = 0;
		while(low <= high)
		{
			midIx = low + (high - low)/2;
			if (arr[midIx] < src)
			{
				low = midIx + 1;
			}
			else if (arr[midIx] > src)
			{
				high = midIx - 1;
			}
			else
			{
				return midIx;
			}
		}
		return -1;
	}
	
}

public class SearchAlgorithm 
{
	
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();

		//code lines whose time you want to calculate 
		
		int result = 0,num = 0;
		int arr[] = {1,23,45,34,67,78,95,39,29,27,38,98,100,101,95,65};
		System.out.println("Your input array.......: " + Arrays.toString(arr));

		System.out.println("Enter the number you want the index for..: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		
//		result = LinearSearch.linearSearch(arr,num);
//		System.out.printf("The element %d you searched for is present at the index: %d" , num , result);
		
		
		result = BinarySearch.binarySearch(arr,num);
		System.out.printf("The element %d you searched for is present at the index: %d" , num , result);

		long endTime = System.currentTimeMillis();
		System.out.println(" Took "+(endTime - startTime) / 60/60 + " seconds");
		
	}
	
	
	
}