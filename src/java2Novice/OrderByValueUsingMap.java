package java2Novice;

import java.util.*;
import java.util.Map.Entry;

public class OrderByValueUsingMap 
{

	public static void main(String[] args) 
	{
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("maths", 90);
		map.put("physics", 78);
		map.put("chemistry", 92);
		map.put("biology", 47);
		map.put("Language", 69);
		
		Set<Entry<String,Integer>> set = map.entrySet();
		System.out.println("set..." + set);
		List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
		System.out.println("list..." + list);
		Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
		{
			public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
		});
	}

}
