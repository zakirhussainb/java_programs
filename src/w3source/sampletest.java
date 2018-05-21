package w3source;
import java.util.*;
public class sampletest
{
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		Map<Integer,String> map = new HashMap<>();
		map.put(65, "A");
		map.put(66, "B");
		map.put(67, "C");
		map.put(68, "D");
		
		map.forEach((key1,value1) -> processMap(key1,value1));
		
//		Iterator<Integer> itr = map.keySet().iterator();
//		while(itr.hasNext()) 
//		{
//			int key = itr.next();
//			String value = map.get(key);
//			System.out.println(key + " -> " + value);
//		}
		
//		for(Integer key : map.keySet())
//		{
//			String value = map.get(key);
//			System.out.println(key + "-->" + value);
//		}
		
		Set<String> set = new LinkedHashSet<>();
		set.add("atheeq");
		set.add("zakir");
		set.add("hussain");
		set.add("rahaman");
		set.add("rahaman");
		

		set.forEach(System.out::println);
		
//		set.forEach(sampletest::process);
		
		
	}
	private static Object processMap(Integer key1, String value1) 
	{
		
		return null;
	}
	public static void process(String name) 
	{
        System.out.println("processing the student " + name);
    }

}
