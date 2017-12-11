package java2Novice;
import java.util.*;
public class BinaryToDecimal 
{
	public static int printDecimalFormat(int bin)
	{
		
		int sum=0,decimal=0,power = 0;
		
		while(true)
		{
			if ( bin == 0 )
			{
				break;
			}
			else
			{
				int temp = bin % 10;
				decimal += temp * Math.pow(2, power);
				bin /= 10;
				power++;
			}
		}
		return decimal;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the binary number to be coverted to decimal...: ");
		Scanner sc = new Scanner(System.in);
		int binNum = sc.nextInt();
		int result = printDecimalFormat(binNum);
		System.out.println("Decimal Equivalent for the given binary No. is... " + result);
		sc.close();
	}

}
