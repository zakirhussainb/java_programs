package java2Novice;

class ReverseAStringWO_Recursion
{
	/* Write a program to reverse a string without using recursive algorithm. */

	public static void main(String args[])
	{
		String str = "This is a string reverse program without using recursion";
		String reversedString = "";
		
		for( int i = str.length()-1 ; i >= 0 ; i-- )
		{
			reversedString += str.charAt(i);
		}
		System.out.println("Reversed String is............: " + reversedString);
	} 
};