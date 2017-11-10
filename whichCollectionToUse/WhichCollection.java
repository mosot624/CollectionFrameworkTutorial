package whichCollectionToUse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class WhichCollection {

	public static void main(String[] args) {

		// What to consider:
		// 1. what is the collections purpose in your project
		/// 2. are you using the highest performance collection for your project
		// (how fast the collection do Inserting, deletion, retrieval and
		// traversal)

		////// List///////

		// Store the list in object duplicates are allowed
		// the order remain as it is, after you inserted a list
		// elements are named(indexed) as integers c
		// checking for particular is slow
		// Looking an item up by index is fast Iterating through items is fast.
		// note.List can be sorted
		//

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		//// sets////

		// only store unique value,
		// great for removing duplicates,
		// not indexed unlike list
		// very fast if you need to check a specific object
		// if you want to use your own object use hash code or .equals()

		// order is unimportant and OK if it changes
		// HashSet is not ordered
		Set<String> set1 = new HashSet<String>();

		// sorted in natural order, use tree set
		// e.g 1,2,3 or a,b,c etc.
		// must implement comparable for custom types
		Set<String> set2 = new TreeSet<String>();

		// elements remain in a order they were added
		Set<String> set3 = new LinkedHashSet<String>();

		/////// maps//////
		// key value are in pairs
		// like lookup table
		// retrieving a value of key is fast
		// Iterating through the maps is very slow
		// maps is not suitable for iterating
		
		// if you want to use your own object use hash code or .equals()

		// keys are not in any particular order, and order liable to change.
		Map<String, String> map1 = new HashMap<String, String>();
		
		// keys sorted in natural order
		Map<String, String> map2 = new TreeMap<String, String>();
		
		// keys remain in order added
		Map<String, String> map3 = new LinkedHashMap<String, String>();
		
		
		// there are also the SortedSet and SortedMap interface.

	}

}
