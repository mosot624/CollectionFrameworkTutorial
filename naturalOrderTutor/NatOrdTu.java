package naturalOrderTutor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NatOrdTu {

	public static void main(String[] args) {
		List<Person> StringList = new ArrayList<Person>();
		Set<Person> setStringList = new TreeSet<Person>();

		addElements(StringList);
		addElements(setStringList);
		Collections.sort(StringList);

		ShowElements(StringList);
		ShowElements(setStringList);

	}

	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Steve"));
		col.add(new Person("Clair"));
		col.add(new Person("Mike"));
	}

	private static void ShowElements(Collection<Person> col) {
		for (Person element : col) {
			System.out.println(element);
		}
		System.out.println();
	}

}

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person per1) {
		int len1 = name.length();
		int len2 = per1.name.length();

		if (len1 > len2) {
			return 1;
		}
		else if (len1 < len2){
			return -1;
		}
		else {
			return name.compareTo(per1.name);
		}
	}

}
