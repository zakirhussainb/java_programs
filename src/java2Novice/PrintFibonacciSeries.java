package java2Novice;
class PrintFibonacciSeries
{
	/* Write a program to print fibonacci series. */
	
	public static void main(String args[])
	{
		String s = new String("zakir");
		String m = "zakir";
		System.out.println(s == m);//false
		System.out.println(s.equals(m));//false
		System.exit(0);
		usingRecursion();
		withoutUsingRecursion();	
	}
	private static void withoutUsingRecursion() 
	{
		int n1=0,n2=1,n3=0;
		
		System.out.print(n1 + " " + n2);
		
		for ( int i = 2; i <=10; i++ )
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);			
		}
	}
	private static void usingRecursion() 
	{
		int n1=0,n2=1;
		
		System.out.print(n1 + " " + n2);
		
		for ( int i = 2; i <= 10; i++ )
		{
			System.out.print(" " + fibonacci(i));
		}
	}
	private static int fibonacci(int number) 
	{
		if( number == 1 || number == 2)
		{ 
			return 1; 
		}
		return fibonacci(number-1) + fibonacci(number-2); //tail recursion
	}	
};