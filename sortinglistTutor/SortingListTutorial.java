package sortinglistTutor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListTutorial {

	public static void main(String[] args) {
		/////// Sorting Strings///////
		List<String> animalsList = new ArrayList<String>();

		animalsList.add("cat");
		animalsList.add("dog");
		animalsList.add("cheetah");
		animalsList.add("elephant");
		for (String value : animalsList) {
			System.out.println(value);
		}
		System.out.println("");
		Collections.sort(animalsList, new AlphabeticalComparitor());

		for (String value : animalsList) {
			System.out.println(value);
		}
		System.out.println();

		//////// Sorting int//////////
		List<Integer> numberList = new ArrayList<Integer>();

		numberList.add(4);
		numberList.add(2);
		numberList.add(1);
		numberList.add(30);
		numberList.add(48);

		for (Integer value : numberList) {
			System.out.println(value);
		}

		System.out.println();

		Collections.sort(numberList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}

		});
		for (Integer value : numberList) {
			System.out.println(value);
		}
		//////// Sorting objects//////////
		List<Person> personList1 = new ArrayList<Person>();
		personList1.add(new Person(1, "Joe"));
		personList1.add(new Person(3, "Bob"));
		personList1.add(new Person(2, "Ben"));
		personList1.add(new Person(6, "Nathan"));

		System.out.println("");
		for (Person value : personList1) {
			System.out.println(value);
		}
		
		///sort in order of id objects ///
		System.out.println("");
		Collections.sort(personList1, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getId() > o2.getId()) {
					return 1;
				} else if (o1.getId() <  o2.getId()) {
					return -1;
				} else {
					return 0;
				}
			}
			
		});
		for (Person value : personList1) {
			System.out.println(value);
		}
		System.out.println();
		//sorting in order of name///
		Collections.sort(personList1, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		for (Person value : personList1) {
			System.out.println(value);
		}

	}

}

	class StringLengthCompare implements Comparator<String> {

		@Override
		public int compare(String arg1, String arg2) {
			int len1 = arg1.length();
			int len2 = arg2.length();

			if (len1 > len2) {
				return 1;
			} else if (len1 < len2) {
				return -1;
			} else {
				return 0;
			}
		}

	}

	class AlphabeticalComparitor implements Comparator<String> {

		@Override
		public int compare(String arg1, String arg2) {
			return arg2.compareTo(arg1);
		}

	}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id+ " : " +name;
	}

}
