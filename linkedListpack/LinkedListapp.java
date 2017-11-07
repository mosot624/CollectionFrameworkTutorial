package linkedListpack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListapp {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		LinkedList<Integer> linked1 = new LinkedList<Integer>();

		doSomething("Array List", array1);
		doSomething("Linked List", linked1);
	}

	public static void doSomething(String type, List<Integer> list1) {
		//for (int i = 0; i < 1E5; i++) {
			//list1.add(i);
		//}
		long start = System.currentTimeMillis();
		
		/*for (int i = 0; i < 1E5; i++) {
			list1.add(i);
		}*/
		for (int i = 0; i < 1E5; i++) {
			list1.add(0,i);
		}
		long end = System.currentTimeMillis();
		/*for(Integer value : list1){
			System.out.println(value);
		}*/

		System.out.println("Amount of time: " + (end - start) + " ms for " + type);
	}

}
