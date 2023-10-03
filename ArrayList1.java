package javaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> newarr=new ArrayList<>();
		newarr.add(400);
		newarr.add(500);
		newarr.add(100);
		newarr.add(300);
		
		int n=Collections.max(newarr);
		System.out.println(n);
		
		int m=Collections.min(newarr);
		System.out.println(m);
		
		Collections.sort(newarr);
		System.out.println(newarr);
		
		Collections.reverse(newarr);
		System.out.println(newarr);
		
		//slicing i arrayList
		ArrayList<Integer> slice=new ArrayList<>(newarr.subList(1, 3));
		System.out.println(slice);
		
		ArrayList<Integer> arrcopy=new ArrayList<>(newarr);
		System.out.println(arrcopy);
		
		
		//Default value arrayList
		ArrayList<Integer> arraylist1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(arraylist1);
		
		//or print values
		for(int value:arraylist1) {
				System.out.print(value+",");
		 }
		System.out.println();
		
		//provided values
		ArrayList<Integer> arraylist2=new ArrayList<>();
		arraylist2.add(4);
		arraylist2.add(0,400);
		arraylist2.add(1,6);
		arraylist2.add(8);
		arraylist2.add(100);
		//print values
		System.out.println(arraylist2);
		
		//copy arrayList 
		ArrayList<Integer> arraylist3=new ArrayList<Integer>(arraylist1);
		System.out.println(arraylist3);
		
		//ArrayList to string
		String str=arraylist3.toString();
		System.out.println(str);
		
		//ArrayList to Array
		Integer[] arr1=arraylist1.toArray(new Integer[arraylist1.size()]);
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		//or another way
		Integer[] arr2=new Integer[arraylist1.size()];
		arraylist1.toArray(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		
		//Array to ArrayList
		//important we can pass only wrapper class arr1
		ArrayList<Integer> arraylist4=new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.println(arraylist4);
		
		
		
		//Java ArrayList add()
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		//Inserting Element using ArrayList add()
		arrlist.add(2);
		arrlist.add(4);
		arrlist.add(100);
		arrlist.add(200);
		arrlist.add(300);
		arrlist.add(200);
		
		//Inserting Element at the Specified Position
		arrlist.add(0,20);
		arrlist.add(1,40);
		System.out.println("arrlist:");
		System.out.println(arrlist);
		
		//remove by index
		arrlist.remove(0);
		//remove by value and string array me keval string value dalo for removing 
		arrlist.remove(arrlist.indexOf(40));
		//or remove by value
        arrlist.remove(Integer.valueOf(100));
		System.out.println(arrlist);
		
		//or removeRange removeRange(startIndex,endIndex)
		
		//or removeAll
		
		
		 // get the number of elements of arraylist
		int size=arrlist.size();
		System.out.println(size);
		
		//isEmpty method
		boolean b=arrlist.isEmpty();
		System.out.println(b);
		
		//subList method
		System.out.println(arrlist.subList(2, arrlist.size()));
		
		//set methods(replace that array item)
		arrlist.set(0, 1000);
		System.out.println(arrlist);
		
		//sort() method two type Comparator.naturalOrder and Comparator.reverseOrder
		arrlist.sort(Comparator.naturalOrder());
		System.out.println(arrlist);
		arrlist.sort(Comparator.reverseOrder());
		System.out.println(arrlist);
		
		//Convert ArrayList to String
		System.out.println(arrlist.toString());
		
		//lastIndexof and last index for use to indexOf
		System.out.println(arrlist.lastIndexOf(200));
		System.out.println(arrlist.indexOf(200));
		
		//retainAll use to print comman items
		System.out.println("arraylist1:"+arraylist1);
		System.out.println("arrlist:"+arrlist);
		arraylist1.retainAll(arrlist);
		System.out.println(arraylist1);
		
		//contain method and containAll method
		boolean b2=arrlist.contains(300);
		boolean b3=arrlist.contains(arraylist1);
		System.out.println(b2);
		System.out.println(b3);
		
		//equals method
		boolean b4=arrlist.equals(arraylist1);
		System.out.println(b4);
		
		//removeRange
		arrlist.subList(0, 3).clear();
		System.out.println(arrlist);
		
		//replaceAll method
		arrlist.replaceAll(e->e*2);
		System.out.println(arrlist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
