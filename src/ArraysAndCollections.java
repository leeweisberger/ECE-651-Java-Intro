import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ArraysAndCollections {
	public static void main(String[] args) {
		array();
		list();
		set();
		map();
	}

	//use an array when you know how many elements you want to add
	//does not resize dynamically
	//you can create an array of primitives or any object!
	//O(1) access O(n) insert, delete, search
	private static void array() {
		int[] arr = new int[3];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		for(int i : arr){
			System.out.println(i);
		}
		
	}
	//use a list when you don't know how many elements you want to add
	//resizes dynamically
	//Can only contain objects, no primitives!
	//O(1) access and insert at end O(n) delete, search, insert anywhere but end
	//ArrayList vs LinkedList: use ArrayList unless you want the big o advantages of linkedlist
	private static void list() {
		//notice we use Integer instead of int! Integer is an object, int is a primitive
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		for(int i : list){
			System.out.println(i);
		}
		
	}

	//Use a set when you don't want duplicates or a simple collection of objects with constant search
	//resizes dynamically
	//Can only contain objects, no primitives
	//HashSet - O(1) insert, deletion, search (assuming good hash function) and unordered
	//TreeSet (less common) is sorted and should be used when a sorted, non-duplicate collection is needed
	private static void set() {
		Set<Integer> set = new HashSet<>();
		set.add(0);
		set.add(1);
		set.add(2);
		for(int i : set){
			System.out.println(i);
		}
		
	}

	//Use a map when you want to keep track of key value pairs
	//resizes dynamically
	//can only contain objects, no primitives
	//HashMap - O(1) insert, deletion, search (assuming good hash function) and unordered
	//Less Common: TreeMap - sorted, LinkedHashMap - ordered hash map
	private static void map() {
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		for(int i : map.keySet()){
			System.out.println(i + " : " + map.get(i));
		}
	}
	
}
