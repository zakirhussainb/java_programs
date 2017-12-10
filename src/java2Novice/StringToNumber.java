package java2Novice;

public class StringToNumber 
{
	/*Write a program to convert string to number without using Integer.parseInt() method.*/
	public static void main(String[] args) 
	{
		int result = 0;
		String num = "1234";
		result = convertToNumber(num);
		System.out.println("result....: " + result);
		
		/*result = Integer.parseInt(num);
		System.out.println("result....: " + result);*/
	}
	public static int convertToNumber(String num)
	{
		char[] chars = num.toCharArray();
		int sum = 0,zeroASCII = '0';
		for (char ch : chars)
		{
			int tempASCII = ch;
			sum = ( sum * 10 ) + ( tempASCII - zeroASCII ) ;
		}
		return sum;
	}

}
