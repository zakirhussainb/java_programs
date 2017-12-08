package java2Novice;

class ReverseAStringUsingRecursion
{
	/* Write a program to reverse a string using recursive algorithm. */

	public static void main(String args[])
	{
		String str = "This is a string reverse program";
		String reversedString = "";
		
		reversedString = reverseOfString(str);
		System.out.println("Reversed String is : " + reversedString);		
	}
	public static String reverseOfString(String str)
	{
		String result = "";
		
		if ( str.length() == 1 || str.isEmpty() )
		{
			return str;
		}
		else
		{
			result += str.charAt(str.length()-1) + reverseOfString( str.substring(0,str.length()-1) );
			return result;			
		}
	}
};