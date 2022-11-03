package ArrayListAndCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		// ArrayList<Float> list3= new ArrayList<>();
		// ArrayList<Boolean> list4= new ArrayList<>();

		// *****Add Elements*****
		list1.add(9);
		list1.add(7);
		list1.add(2);
		list1.add(0);
		System.out.println(list1);

		list2.add("naer");
		list2.add("asif");
		list2.add("fatima");
		list2.add("Affan");
		System.out.println(list2);

		// *****To Get Element*****
		int ele1 = list1.get(3);
		int ele2 = list1.get(0);
		System.out.println(ele1 + "," + ele2);
		String str1 = list2.get(1);
		System.out.println(str1);

		// *****Add element in between*****
		list1.add(1, 4);
		System.out.println(list1);
		list1.add(5, 33);
		System.out.println(list1);
		list2.add(1, "nidhi");
		list2.add(3, "myself");
		System.out.println(list2);


		// *****set element*****
		list1.set(0, 24);
		list1.set(4, 66);
		System.out.println(list1);
		list2.set(0, "zilbi");
		System.out.println(list2);


		// *****delete element*****
		list1.remove(3);
		list2.remove(2);
		System.out.println(list1);
		System.out.println(list2);


		// *****Size of list*****
		int size = list1.size();
		System.out.println(size);
		size = list2.size();
		System.out.println(size);
		System.out.println("********");


		// *****iterate loop*****
		for (int i = 0; i < list1.size(); i++) {

			System.out.print(list1.get(i));
			System.out.print(",");
		}
		System.out.println();
		for (int i = 0; i < list2.size(); i++) {

			System.out.print(list2.get(i));
			System.out.print(",");
		}
		System.out.println();


		// *****Sorting*****
		Collections.sort(list1);
		Collections.sort(list2);

		System.out.println(list1 + " , " + list2);



	}

}
