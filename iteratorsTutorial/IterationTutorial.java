package iteratorsTutorial;

import java.util.Iterator;
import java.util.LinkedList;

public class IterationTutorial {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("Fox");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Rabbit");

		Iterator<String> it1 = animals.iterator();
		while (it1.hasNext()) {
			String animalNames = it1.next();
			System.out.println(animalNames);
			
			if(animalNames.equals("Cat")){
				it1.remove();
			}
		}
		System.out.println();
		/// modern iteration java 5 and later
		for (String value : animals) {
			System.out.println(value);
		}
	}

}
