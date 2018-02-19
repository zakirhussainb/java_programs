package mainJava;
import java.util.*;
import java.io.*;
public final class Java_Strings 
{
	public static void main(String[] args) throws Exception
	{
//		javaStringsIntroduction();
//		javaSubstringComparisons();
//		javaStringReverse();
//		javaAnagrams();
		
//		javaSwitchCaseString();
//		javaTypeConversion();
//		javaCountCharsInWordInSentence();
		javaToSwapfirstandLastCharsInSentence();
	};;;

	private static void javaToSwapfirstandLastCharsInSentence() 
	{
		String str1 = "Zakir Hussain B is a good boy";
		String first = "";
		String last = "";
		String middle = "";
		String[] splitArr = str1.split(" ");
		for ( int i = 0; i < splitArr.length; i++ )
		{
//			System.out.println(splitArr[i]);
//			splitArr[i] = splitArr[i].substring(0,1);
//			System.out.println("after.." + splitArr[i]);
			if ( splitArr[i].length() == 1 )
			{
				first = splitArr[i];
				last = "";
				middle = "";
			}
			else
			{
				first = splitArr[i].substring(0,1);
				last = splitArr[i].substring(splitArr[i].length()-1,splitArr[i].length());
				middle = splitArr[i].substring(1,splitArr[i].length()-1);
//				last = splitArr[i].substring(1,splitArr[i].length()-1);
//				System.out.println("first..." + first);
//				System.out.println("last..." + last);
//				System.out.println("middle..." + middle);
			}
			
			System.out.print(last + "" + middle + "" + first + " ");
		}
		
	}
	private static void javaToSwapfirstandLastCharsInSentence_1()
	{
		String str = "geeks";
		
		char[] ch = str.toCharArray();
		for ( int i = 0; i < ch.length; i++ )
		{
			
		}
		
		
	}
	private static void javaCountCharsInWordInSentence() 
	{
		String str = "geeks for geeks zakir is a godd bou";
		String[] splitsarr = str.split(" ");
		for ( int i = 0; i < splitsarr.length; i++ )
		{
			System.out.println(splitsarr[i] + "->" + splitsarr[i].length());
		}
		
	}

	private static void javaTypeConversion() throws Exception
	{
		String str = "500";
		Integer i = 0;
		
		i = Integer.parseInt(str);
		System.out.println("i.." + i);
//		i = Integer.valueOf(str);
//		System.out.println("i.." + i);
		
		Class c = Class.forName("java.lang.String");
		System.out.println("Class Name " + c.getName());
		System.out.println("Super Class Name " + c.getSuperclass().getName());
		
		String str1 = "mada";
		String rev = "";
		
		StringBuilder sb = new StringBuilder(str1);
		rev = sb.reverse().toString();
		if ( rev.equals(str1) )
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palidrome");
		
		char c2 = 064770;
		
	}

	private static void javaSwitchCaseString() 
	{
		String color = "red";
		switch(color)
		{
			case "blue":
				System.out.println("Color is BLUE");
				break;
			case "red":
				System.out.println("Color is RED");
				break;
			case "black":
				System.out.println("Color is BLACK");
				break;
		}
	}

	private static void javaAnagrams() 
	{
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String sec = sc.next();
		sc.close();
		boolean ret = isAnagram(first,sec);
		System.out.println(( ret ) ? "Anagrams" : "Not Anagrams");
		
		
	}
	private static boolean isAnagram(String first, String sec) 
	{
		first = first.toLowerCase();
		sec = sec.toLowerCase();
		
		if ( first == null || sec == null || first.isEmpty() || sec.isEmpty() )
			 throw new IllegalArgumentException();
		if ( first.length() != sec.length() )
			return false;
		
		Map<Character, Integer> map = new HashMap<>();
		// Here character is the "KEY" and integer is the "VALUE" [a=3,n=1,g=1]
		
		for ( int k = 0; k < sec.length(); k++ )
		{
			char letter = sec.charAt(k);
			
			if( ! map.containsKey(letter) )
			{
//				System.out.println("hi...");
		        map.put( letter, 1 );
			}
			else
			{
//				System.out.println("helllooooo.....");
				Integer frequency = map.get(letter);
				map.put(letter, ++frequency);
			}
			
//			System.out.println("map..." + map);
		}
		
		for ( int k = 0; k < first.length(); k++ )
		{
			char letter = first.charAt(k);
			if ( ! map.containsKey(letter) )
				return false;
			
			Integer frequency = map.get(letter);
			
			if ( frequency == 0 )
				return false;
			else
				map.put(letter, --frequency);
		}
		return true;
	}

	private static void javaSubstringComparisons() 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();
		
		System.out.println(getSmallandLargeLex(s,k));
		
	}

	private static void javaStringsIntroduction() 
	{
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		System.out.println(A.length() + B.length());
		
		System.out.println(A.compareTo(B)>0 ? "Yes" : "No" );
		
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
		
		
	}

	private static void javaStringReverse() 
	{
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = "";
        for (int i = A.length()-1; i >= 0; i--)
        {
        	rev = rev + A.charAt(i);
        }
       System.out.println(rev.equals(A)? "Yes" : "No");		
	}

	private static String getSmallandLargeLex(String s, int k) 
	{
		String small = "";
		String large = "";
		String substr ="";int i = 0;
//		String arr[] = new String[100];
//		System.out.println(s.length());
//		System.out.println("k..." + k);
//		substr = s.substring(0,k);
//		System.out.println("substr..." + substr);
		
		String min = s.substring(0,k);
		String max = min;
		
//		SortedSet<String> set = new TreeSet<String>();
		
		for ( i = 0; i <= s.length() - k + 1; ++i )
		{
			
			substr = s.substring(i, i + k);
			min = (min.compareTo(substr) < 0) ? min : substr;
			max = (max.compareTo(substr) > 0) ? min : substr;
			/*System.out.println("i..." + i);
			System.out.println("k..." + k);*/
		}
		System.out.println(min + System.getProperty("line.separator") + max);
		
		return small + "\n" + large;
	}

};
