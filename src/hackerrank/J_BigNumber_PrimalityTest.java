package hackerrank;

import java.math.*;
import java.util.*;

public class J_BigNumber_PrimalityTest 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BigInteger b1 = sc.nextBigInteger();
		sc.close();
		
		boolean value = b1.isProbablePrime(100);
		if ( value )
			System.out.println("prime");
		else
			System.out.println("not prime");
		
	}
}
