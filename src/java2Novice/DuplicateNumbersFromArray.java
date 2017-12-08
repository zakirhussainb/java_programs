package java2Novice;

public class DuplicateNumbersFromArray
{
	void UsingTwoForLoops_M1(int arr[], int arrLen)
	{
		/* Time Complexity: O(n*n)
		Auxiliary Space: O(1) */
		
		System.out.println("\nMethod 1 Basic....Using Two For Loops.....: \n");
		System.out.println("Repeated Elements are.....: ");
		for(int i = 0;i < arrLen; i++)
		{
			for(int j=i+1; j < arrLen; j++)
			{
				if( arr[i] == arr[j] )
					System.out.print(" " + arr[i]);
			}
		}	
	}
	void UsingCountArray_M2(int arr[], int arrLen)
	{
		/* Time Complexity: O(n)
		Auxiliary Space: O(n) */
		
		System.out.println("\n\tMethod 2 ....Using Count Array.....: \n");
		System.out.println("\tRepeated Elements are.....: ");
		int countArr[] = new int[arrLen];
		for(int i=0; i < arrLen; i++)
		{
			// System.out.println("countArr[arr[i]]...: " + countArr[arr[i]]);
			if ( countArr[arr[i]] == 1 )
				System.out.print("\t" + arr[i] + " ");
			else
				 countArr[arr[i]]++;
		}		
	}
	public static void main(String args[])
	{
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		int arrLen = arr.length;
		DuplicateNumbersFromArray dn = new DuplicateNumbersFromArray();
		dn.UsingTwoForLoops_M1(arr,arrLen);
		dn.UsingCountArray_M2(arr,arrLen);
	}	
};