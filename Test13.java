package JavaTests;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test13 {

	public static void main(String[] args) {
		HashMap<Integer,String> newhm=new HashMap<>();
		newhm.put(2,"rahul");
		newhm.put(4, "kumar");
		newhm.put(6, "pasad");
		System.out.println(newhm);
		System.out.println(newhm.get(4));
		System.out.println(newhm.remove(4));
		System.out.println(newhm);
		System.out.println(newhm.isEmpty());
		System.out.println(newhm.containsKey(2));
		System.out.println(newhm.containsValue("rahul"));
		System.out.println(newhm.toString());
		newhm.replace(6, "singh");
		System.out.println(newhm);
		
//		newhm.clear();
//		newhm.containsKey(2);
//		newhm.equals(newhm);
//		newhm.get(3);
//		newhm.keySet();
//		newhm.values();
//		newhm.put(2, "rahul");
//		newhm.putAll(newhm);
//		newhm.remove(3);
//		newhm.size();
//		newhm.toString();
//		newhm.replace(1, "kumar");
//		newhm.isEmpty();//or check by length
		// Create a HashSet
        HashMap<String,Integer> hashSet = new HashMap<>();

        // Add elements to the HashSet
        hashSet.put("banana",100);
        hashSet.put("apple",200);
        hashSet.put("orange",300);
        hashSet.put("grape",400);

        // Convert the HashSet to a List
        ArrayList<String> list = new ArrayList<>(hashSet.keySet());

        // Sort the list
        Collections.sort(list);

        // Create a new HashSet from the sorted list
        Set<String> sortedHashSet = new HashSet<>(list);

        // Print the sorted HashSet
        System.out.println("Sorted HashSet: " + sortedHashSet);
		
		

	}

}
