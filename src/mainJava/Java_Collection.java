package mainJava;

import java.util.*;
import java.util.Map.Entry;

public class Java_Collection 
{
	public static void main(String[] args) 
	{
		hashMapExamples();

	}

	private static void hashMapExamples() 
	{
//		waysToCreateHashMap();
		addKeyValuePairstoHashMap();
		addgivenKeyValuePairstoHashMapifNotPresent();
		
	}

	private static void addgivenKeyValuePairstoHashMapifNotPresent() 
	{
		// TODO Auto-generated method stub
		HashMap<String,Integer> hMap1 = new HashMap<String,Integer>();
		hMap1.put("ONE", 1);
		hMap1.put("TWo", 2);
		hMap1.put("ON", 3);
		
		
		
		
		
	}

	private static void addKeyValuePairstoHashMap() 
	{
		HashMap<String,Integer> hMap = new HashMap<String,Integer>();
		
		hMap.put("ONE", 1);
		hMap.put("TWO", 2);
		hMap.put("THREE", 3);
		hMap.put("FOUR", 4);
		hMap.put("FIVE", 5);
		hMap.put("SIX", 6);
		
		Set<Entry<String,Integer>> entrySet = hMap.entrySet();
		
		/*for ( Entry<String,Integer> entry: entrySet)
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("--------------------------");*/
		
		HashMap<String,Integer> hMap1 = new HashMap<String,Integer>();
		hMap1.put("SEVEN", 7);
		hMap1.put("EIGHT", 8);
		
		hMap1.putAll(hMap);
		
		entrySet = hMap1.entrySet();
		
		for ( Entry<String,Integer> entry: entrySet)
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}

	private static void waysToCreateHashMap() 
	{
		HashMap<String,Integer> hMap1 = new HashMap<String,Integer>();

		HashMap<String,Integer> hMap2 = new HashMap<String,Integer>(30);
		
		HashMap<String,Integer> hMap3 = new HashMap<String,Integer>(30,0.5f);//0.5 as load factor

		HashMap<String,Integer> hMap4 = new HashMap<String,Integer>(hMap3);
		
	}

}
