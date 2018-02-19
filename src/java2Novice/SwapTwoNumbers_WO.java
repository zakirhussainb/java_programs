package java2Novice;
class SwapTwoNumbers_WO
{
	/* How to swap two numbers without using temporary variable? */

	public static void main(String args[])
	{
		int n1 = 30;
		int n2 = 90;
		
		System.out.println("Before Swapping.....");
		System.out.println("Number One is " + n1 + " and Number Two is " +n2 );
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println("After Swapping.....");
		System.out.println("Number One is " + n1 + " and Number Two is " +n2 );
		
		
	};
	
	public static void usingThirdVariable(int n1 , int n2)
	{
		int temp = 0;
		
		temp = n1;
		n1 = n2; 
		n2 = temp;
		
		System.out.println("After Swapping Using Temporary Variable.....");
		System.out.println("Number One is " + n1 + " and Number Two is " +n2 );
	}
	
};;