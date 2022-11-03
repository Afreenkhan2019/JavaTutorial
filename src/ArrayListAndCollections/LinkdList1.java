package ArrayListAndCollections;

import java.util.*;

public class LinkdList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		list.addFirst("This");
		list.add("list");
		System.out.println(list);
		System.out.println(list.size());

		for(int i=0; i<list.size(); i++) {			

			System.out.print(list.get(i) + "-->");			
		}
		System.out.print("null");
		System.out.println();
		System.out.println(list.removeFirst());

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.removeLast());
		System.out.println(list);
		System.out.println(list.size());

		list.add(1,"test1");
		System.out.println(list);

	}

}
