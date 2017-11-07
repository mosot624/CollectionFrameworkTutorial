package hashMapTutorial;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(5, "Five");
		map1.put(3, "Three");
		map1.put(4, "Four");
		map1.put(7, "Seven");
		String text1 = map1.get(7);
		System.out.println(text1);

		do {
			for (Map.Entry<Integer, String> entry : map1.entrySet()) {
				int key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key + " " + value);
			}
			System.out.println("");
		} while (true);
	}

}
