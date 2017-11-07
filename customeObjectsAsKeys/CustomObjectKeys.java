package customeObjectsAsKeys;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CustomObjectKeys {

	public static void main(String[] args) {

		Person per1 = new Person(2, "Ben");
		Person per2 = new Person(1, "Sue");
		Person per3 = new Person(4, "Jeff");
		Person per4 = new Person(1, "Sue");

		Map<Person, Integer> map1 = new LinkedHashMap<Person, Integer>();
		map1.put(per1, 1);
		map1.put(per2, 2);
		map1.put(per3, 3);
		map1.put(per4, 4);

		for (Person key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}

		Set<Person> set1 = new LinkedHashSet<Person>();
		set1.add(per1);
		set1.add(per2);
		set1.add(per3);
		set1.add(per4);

		System.out.println(set1);

	}

}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
