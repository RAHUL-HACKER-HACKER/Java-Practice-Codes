package javaPrograms;
import java.util.*;
public class HashMapJava {

	public static void main(String[] args) {
		// hashMap in java
		HashMap<Integer,String> nhm=new HashMap<>();
		nhm.clear();
		nhm.containsKey(2);
		nhm.equals(nhm);
		nhm.get(3);
		nhm.keySet();
		nhm.values();
		nhm.put(2, "rahul");
		nhm.putAll(nhm);
		nhm.remove(3);
		nhm.size();
		nhm.toString();
		nhm.replace(1, "kumar");
		nhm.isEmpty();//or check by length
		
		
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
		
		//HashMap declare
		HashMap<Integer,String> hm1=new HashMap<>();
		HashMap<Integer,String> hm2=new HashMap<>();
		//Put elements in Map
		hm1.put(1,"Mango");
		hm1.put(1,"Aam");//note duplicate key replace the value
		hm1.put(2,"Apple");    
		hm1.put(3,"Banana");   
		hm1.put(4,"Grapes");
		System.out.println(hm1);
		//putAll()
		hm2.putAll(hm1);
		System.out.println(hm2);
		
		
		//copy HashSet
		HashMap<Integer,String> hm3=new HashMap<>(hm1);
		System.out.println(hm3);
		
		//Values return collection
		System.out.println(hm3.values());
		
		//HashSet Keys return set collection because it can't be duplicate
		System.out.println(hm3.keySet());
		
		//store All values in array
		String[] arr1=new String[hm3.size()];
		hm3.values().toArray(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//store All values in LinkedList
		LinkedList<String> arr2=new LinkedList<>(hm3.values());
		System.out.println(arr2);
		
		//HashSet Keys return set because it can't be duplicate
		HashSet<Integer> hs1=new HashSet<>(hm3.keySet());
		System.out.println(hs1);
		
		//iterate values
		Set<Integer> k = hm3.keySet();
		Iterator<Integer> i = k.iterator();
		while (i.hasNext()) {
		   System.out.println(i.next());
		}
		
		//iterate keys
		Collection v = hm3.values();
		Iterator j = v.iterator();
		while (j.hasNext()) {
		   System.out.println(j.next());
		}
		
		//print keys
		for(int key: hm3.keySet()){
		    System.out.println(key);
		}
		
		//print values
		for(String value: hm3.values()){
		    System.out.println(value);
		}
		
		 // Iterate through the HashMap and print its elements
        for (HashMap.Entry<Integer,String> entry : hm3.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
		
		
		
		hm3.clear();
		System.out.println(hm3);
		
		//containsKey()
		System.out.println(hm1);
		System.out.println(hm1.containsKey(2));
		
		//containsValue();
		System.out.println(hm1.containsValue("Apple"));
		
		//equals()
		System.out.println(hm1.equals(hm3));
		
		//get(key); note:Parameter pass only key and index
		System.out.println(hm1.get(1));
		
		//isEmpty();
		System.out.println(hm1.isEmpty());
		
		//putIiAbssent(key, value)
		hm1.putIfAbsent(1, "rahul");
		
		//remove(key)
		HashMap<Integer,String> hm4=new HashMap<>(hm1);
		System.out.println(hm4);
		hm4.remove(1);
		System.out.println(hm4);
		
		//or remove(key,value)
		hm4.remove(2,"Apple");
		System.out.println(hm4);
		
		//replace()
		hm4.replace(3, "kela");
		System.out.println(hm4);
		
		//replaceAll(null);
		
		//toString()
		System.out.println(hm4.toString());
		
		//size()
		System.out.println(hm4.size());
		HashMap<Integer,Integer> mp=new HashMap<>();
		
		
		
		
		
		

		
		
		
		
		
		
		
				
		
		
		
		
		
		

	}

}
