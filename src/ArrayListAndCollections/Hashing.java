package ArrayListAndCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set1= new HashSet<>();
		HashSet<Integer> set2= new HashSet<>();
		//ADD
		set1.add("Nidhi");
		set1.add("Arman");
		set1.add("Hamza");
		set1.add("Sidh");
		System.out.println(set1);
		set2.add(45);
		set2.add(12);
		set2.add(48);
		set2.add(98);
		System.out.println(set2);
		
		//SEARCH
		
		if(set1.contains("Ajay")) {
		System.out.println("This already not Exist");
		}
		else {
			set1.add("Ajay");
			System.out.println("Added Ajay to set");
			
			
		}
		
		System.out.println(set1.size());
		
		if(!set1.contains("Nayana")) {
			System.out.println("does not contain");
		}
		
		set1.remove("Ajay");
		if(!set1.contains("Ajay")) {
			System.out.println(set1);
			System.out.println("Required item is removed");
		}
		System.out.println(set1.size());
		System.out.println(set1);
		
		//ITERATOR
		Iterator it= set1.iterator();
		
		//hasnext(),next
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
	

}
