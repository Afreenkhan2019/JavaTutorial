package ArrayListAndCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class HashMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		//ADD
		map.put("India", 120);
		map.put("US", 30);
		map.put("China", 150);
		System.out.println(map);
		
		map.put("China",165);
		System.out.println(map);
		

		//SEARCH
		if(map.containsKey("China")) {
			System.out.println("Key is prestent in the Map");
					}
		else
		{
			System.out.println("Key is not present in the list");
		}
		System.out.println(map.get("China"));// key Exist
		System.out.println(map.get("Indonesia"));//key does not Exist
		//for(int val : arr)
		for(Entry<String, Integer> e: map.entrySet());
		Entry<String, Integer> e = null;
		System.out.println(e.getKey());
	}

}
