package java2Novice;
import java.util.*;
public class DecimalToBinary 
{
	public static void printBinaryFormat(int num)
	{
		int binary[] = new int[25];
		int index = 0;
		
		while ( num > 0 )
		{
			binary[ index++ ] = num % 2;
			num = num / 2;
		}		
		for ( int i = index - 1; i >= 0; i-- )
		{
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the decimal number to be coverted to binary...: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printBinaryFormat(num);
		
//		num = 45;
//		System.out.println(Integer.toBinaryString(num));
		sc.close();
	}

}
