package sortedMapsTutorial;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapsTutor {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedmap1 = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> Treemap1 = new TreeMap<Integer, String>();

		testMap(Treemap1);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(7, "Leopard");
		map.put(3, "Elephant");
		map.put(4, "Snake");

		do {
			for (Integer key : map.keySet()) {
				String value = map.get(key);
				System.out.println(value);
			}
			System.out.println("");
		} while (true);

	}

}
