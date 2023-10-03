package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetJava {

	public static void main(String[] args) {
		// no order and no duplicate exist
		 HashSet<Integer> hs1=new HashSet<>();
		 
		 //add() values
		  hs1.add(100);
		  hs1.add(200);
		  hs1.add(200);
		  hs1.add(300);
		  hs1.add(300);
		  System.out.println(hs1);
		  
		//HashSet to LinkedList
		  LinkedList<Integer> link1=new LinkedList<>(hs1);
		  System.out.println(link1);
		  
		  //addAll() method
		  HashSet<Integer> hs2=new HashSet<>(Arrays.asList(2,3,4,5,6));
		  hs2.addAll(hs1);
		  System.out.println(hs2);
		  
		  //or
		  HashSet<Integer> hs3=new HashSet<>();
		  hs3.addAll(Arrays.asList(10,20,30,40,50));
		  System.out.println(hs3);
		  
		  //clear()
		  hs3.clear();
		  System.out.println(hs3);
		  
		  //contains()
		  HashSet<Integer> hs4=new HashSet<>(Arrays.asList(22,33,44,55,66));
		  System.out.println(hs4.contains(33));
		  
		  //containsAll()
		  System.out.println(hs4.containsAll(Arrays.asList(22,44,66)));
		  
		  //equals()
		  HashSet<Integer> hs5=new HashSet<>(Arrays.asList(22,66,33,44,55));
		  HashSet<Integer> hs6=new HashSet<>(Arrays.asList(22,33,44,55,66));
		  System.out.println(hs5.equals(hs6));
		  
		  //isEmpty();
		  System.out.println(hs5.isEmpty());
		  
		  //remove();
		  System.out.println(hs5);
		  hs5.remove(33);
		  System.out.println(hs5);
		  
		  
		  //removeAll();
		  hs5.removeAll(Arrays.asList(66,44));
		  System.out.println(hs5);
		  
		  //size();
		  System.out.println(hs5.size());
		  
		  //toArrays()
		  Object[] arr=hs5.toArray();
		  System.out.println(arr[0]);
		  
		  //toArray(Collection); HashSet to Array
		  Integer[] arrInt=new Integer[hs5.size()];
		  hs5.toArray(arrInt);
		  System.out.println(Arrays.toString(arrInt));
		  
		  
		  
		  //toString(); collection to string conversion
		  System.out.println(hs5.toString());
		  
		  //display HashSet elements
		  for(int value:hs5) {
			  System.out.print(value+" ");
		  }
		  System.out.println();
		  
		  //Iterater used to access the HashSet elements
		  
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
