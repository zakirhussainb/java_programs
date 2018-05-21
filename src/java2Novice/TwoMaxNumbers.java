package java2Novice;

public class TwoMaxNumbers 
{
	public static void getTwoMaxNumbers(int[] arr)
	{
		int maxOne = 0;
		int maxTwo = 0;
		
		for ( int n : arr )
		{
			if ( maxOne < n )
			{
				maxOne = n;
			}
		}
		System.out.println("First Max Number..." + maxOne);
//		System.out.println("Second Max Number..." + maxTwo);
	}
	public static void main(String[] args) 
	{
		int arr[] = {5,1,4,7,2,9,3};//{10,20,30,40,50,60};
		getTwoMaxNumbers(arr);
	}

}
