package w3source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ArrayListEx 
{

	public static void main(String[] args) 
	{
		List<String> list_1 = new ArrayList<>();
		list_1.add("red");
		list_1.add("blue");
		list_1.add("orange");
		list_1.add("black");
		
		list_1.add(0,"violet");
		
		System.out.println(list_1.get(1));
		
		String ele = list_1.set(3, "purple");
		System.out.println("ele..." + ele);
		
//		String rem = list_1.remove(2);
//		System.out.println("rem..." + rem);
		
		/*if ( al.contains("yellow") )
		{
			System.out.println("al...." + al);
		}
		else
		{
			System.out.println("Element Not Found");
			System.exit(0);
		}*/
		Collections.sort(list_1);
		
		List<String> list_2 = new ArrayList<String>();
		list_2.add("Green");
		list_2.add("Mango");
		
		Collections.copy(list_1, list_2);
		
		
		printElements();
		
		
	}
	public static void printElements()
	{
		System.out.println("\nPrinting List Elements...");
//		Iterator<String> itr = alm.iterator();
//		while( itr.hasNext() )
//		{
//			System.out.println("itr..." + itr.next());
//		}
	}
}
