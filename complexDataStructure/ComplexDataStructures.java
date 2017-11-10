package complexDataStructure;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {
	public static String[] cars = { "ambulance", "lifeboat", "helicopter" };

	public static String[][] drivers = { { "Peter", "Fred", "Sue" }, { "Jeff", "Nathan", "Bob", "Garry" },
			{ "Liam", "Greg", "Jason" } };

	public static void main(String[] args) {
		Map<String, Set<String>> personel = new HashMap<String, Set<String>>();

		for (int i = 0; i < cars.length; i++) {
			String car = cars[i];
			String[] driversList = drivers[i];
			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driversList) {
				driverSet.add(driver);
			}
			personel.put(car, driverSet);
		}
		{

			// Example use
			Set<String> driverList = personel.get("helicopter");

			for (String driver : driverList) {
				System.out.println(driver);
			}
		}
		// iterate through the whole thing
		for (String vehicle : personel.keySet()) {
			System.out.print(vehicle);
			System.out.printf(": ");
			Set<String> driverList2 = personel.get(vehicle);
			for (String driver : driverList2) {
				System.out.printf(driver + ", ");
			}
			System.out.println();
		}
	}

}
