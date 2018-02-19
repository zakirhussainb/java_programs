package journaldev;

import java.util.*;

public class PermutationsOfString 
{

	public static void main(String[] args) 
	{
		String sFirstChar = "";
		String str = "ABC";
		String returnPermu = "";
		String result = "";
		
//		result = permFinder(str);
		
		System.exit(0);
		

	}
	public static void insertFirstChar(String sFirstChar,String returnPermu)
	{
		System.out.println(sFirstChar + "" + returnPermu);
	}
	/*public static Set<String> permFinder(String str)
	{
		Set<String> set = new HashSet<String>();
		
		if ( str == null )
			return null;
		else if ( str.equals("") )
			return "";
		
		char cFirstChar = str.charAt(0);
		String sRemChar = str.substring(1);
		
		return sRemChar + "," + sb;
	}*/

}
