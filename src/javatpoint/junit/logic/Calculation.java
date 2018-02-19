package javatpoint.junit.logic;
import java.util.*;
public class Calculation 
{
	public static int findMax( int[] arr )
	{
		int max = arr[0];
		for ( int i = 1; i < arr.length; i++ )
		{
			if ( max < arr[i] )
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static String reverseWord(String str)
	{
		String res = "";
		  StringBuilder result=new StringBuilder();  
	        StringTokenizer tokenizer=new StringTokenizer(str," ");  
	  
	        while(tokenizer.hasMoreTokens()){  
	        StringBuilder sb=new StringBuilder();  
	        sb.append(tokenizer.nextToken());  
	        sb.reverse();  
	  
	        result.append(sb);  
	        result.append(" ");  
	        }
	        res =  result.toString();
	        res = res.substring(0,res.length()-1);
	        return res;
	}
	
	
}
