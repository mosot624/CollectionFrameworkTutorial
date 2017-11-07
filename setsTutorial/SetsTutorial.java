package setsTutorial;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsTutorial {
	public static void main(String[] args) {
		int counter = 1;
		// hash set does not retain order
		Set<String> set1 = new HashSet<String>();

		// linked hash set remember the order
		Set<String> linkedset1 = new LinkedHashSet<String>();

		// tree set stores it in natural order
		Set<String> Treeset1 = new TreeSet<String>();

		if (set1.isEmpty()) {
			System.out.println("set1 is empty before line 24");
		}

		set1.add("Dog");
		set1.add("Cat");
		set1.add("Fox");
		set1.add("bear");

		do {
			System.out.print(counter + ".) ");
			System.out.println(set1);
			counter++;
		} while (false);
		
		
		//iteration 
		for (String element : set1) {
			System.out.println(element);
		}
		
		
		if (set1.contains("Cat")) {
			System.out.println("It contains cat");
		}
		//Intersection
		
		//set2 contains similar elements as set1
		Set<String> set2 = new TreeSet<String>();

		set2.add("Dog");
		set2.add("Cat");
		set2.add("Giraffe");
		set2.add("Snake");
		
		Set<String> intersection = new	HashSet<String>(set1);
		System.out.println(intersection);
		intersection.retainAll(set2);
		
		System.out.println("This shows the similarities of set1 and set2: "+intersection);
		
		//Difference
		Set<String> difference = new	HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println("This only show the difference: "+difference);

		
		
		
		
		
	}
}
