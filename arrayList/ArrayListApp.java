package arrayList;

import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>();

		// this adds elements to the array
		array1.add(100);
		array1.add(200);
		array1.add(300);

		// retrieve array element
		System.out.println("This is seperate" + array1.get(2));
		System.out.println("");
		for (int i = 0; i < array1.size(); i++) {
			System.out.println(array1.get(i));
		}
		System.out.println("");
		for (Integer value : array1) {
			System.out.println(value);
		}

		System.out.println();

		// decrease array size
		array1.remove(array1.size() - 1);

		// this is very slow
		array1.remove(0);

		for (Integer value : array1) {
			System.out.println(value);
		}

	}

}
