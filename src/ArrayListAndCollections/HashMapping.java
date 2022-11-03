package ArrayListAndCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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
		
		
		//for(int val : arr)---> itration of an array
		int arr[]= {29,49,69};
		for(int val: arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		
		
		//for iteratin in map
//		for(Map.Entry<String, Integer> e : map.entrySet()) {
//			System.out.println(e.getKey());
//			System.out.println(e.getValue() );
//		}
		
		//Second Method
		Set<String> keys= map.keySet();
		for(String key : keys) {
			System.out.println(key+" "+ map.get(key));
		}
		
		
		//Remove
		map.remove("China");
		System.out.println(map);
		
	}

}
