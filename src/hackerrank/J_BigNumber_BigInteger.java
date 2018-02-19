package hackerrank;

import java.math.*;
import java.util.*;

public class J_BigNumber_BigInteger 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BigInteger b1 = new BigInteger(sc.next());
		BigInteger b2 = new BigInteger(sc.next());
		sc.close();
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
		
	}
}
