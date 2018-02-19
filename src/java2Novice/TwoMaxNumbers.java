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
				maxTwo = maxOne;
				maxOne = n;
			}
			else
			{
				maxTwo = n;
			}
		}
		System.out.println("First Max Number..." + maxOne);
		System.out.println("Second Max Number..." + maxTwo);
	}
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50,60};
		TwoMaxNumbers tms = new TwoMaxNumbers();
		tms.getTwoMaxNumbers(arr);
	}

}
