package javaPrograms;
import java.util.*;
public class LinkedListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare
		LinkedList list = new LinkedList();
		//or
		LinkedList<Integer> lin=new LinkedList<>();
		//Adding element at the end of LinkedList
		lin.add(2);
		lin.add(4);
		lin.add(6);
		System.out.println(lin);
		
		//Adding element at the specified index
		lin.add(0,300);
		System.out.println(lin);
		
		//Updating the element at index 3 to 1000
		lin.set(3, 1000);
		System.out.println(lin);
		
		// get method;
	    System.out.println(lin.get(0));
		
	    //Wrapper array to LinkedList
		Integer[] arr= {1,2,3,4,5};
		LinkedList<Integer> lin2=new LinkedList<Integer>(Arrays.asList(arr)) ;
		System.out.println(lin2);
		
		//toArray(Object o) method, LinkedList to Wrapper Array 
	    Integer[] arr2=new Integer[lin.size()];
	    lin.toArray(arr2);
	    
	    //toArray() method
	    Object[] arr3=lin.toArray();
	    System.out.println(arr3[0]);
	    
	    //LinkedList to String
	    String str=lin.toString();
	    
	    //String to LinkedList
	    
		
		
		
		
		LinkedList<Integer> lin3=new LinkedList<Integer>(Arrays.asList(10,20,30,40,50)) ;
		System.out.println(lin3);
		
		LinkedList<String> lin4 = new LinkedList<String>();

		lin4.add("Learning");
		lin4.add("with");
		lin4.add("with");
		lin4.add("Scaler");
		lin4.add("Topics");
		
		//Removing the element "with" from the LinkedList
		lin4.remove("with");
		System.out.println(lin4);
		
		//Removing the element at index 0 from the String LinkedList
		lin4.remove(0);
		System.out.println(lin4);
		//lin4.remove();//remove from starting
		//lin4.removeAll(lin3);
		//lin4.removeFirst();
		//lin4.removeLast();
		
		
		//Removing the element at index 0 from the String LinkedList
	    System.out.println(lin);
	    lin.remove(0);
	    System.out.println(lin);
	    
	    //Removing the element at index 0 from the Double LinkedList
	    LinkedList<Double> lin5=new LinkedList<>(Arrays.asList(2.4,5.7,7.9,8.6,9.7));
	    System.out.println(lin5);
	    lin5.remove(2.4);
	    lin5.remove(0);
	    System.out.println(lin5);
	    
	   
	    //Iterating over Elements
	    for(int i=0;i<lin5.size();i++) {
	    	System.out.print(lin5.get(i)+",");
	    }
	    System.out.println();
	    
	    for(Double value:lin5) {
	    	System.out.print(value+",");
	    }
	    System.out.println();
	    
	    //Java LinkedList as Queue doing peek(),peekFirst(),peekLast(), poll(),pollFirst() and pollLast() operation
	    System.out.println(lin5);
	    System.out.println(lin5.peek());
	    System.out.println(lin5.peekFirst());
	    System.out.println(lin5.peekLast());
	    System.out.println(lin5.poll());
	    //System.out.println(lin5.pollFirst());
	    //System.out.println(lin5.pollLast());
	    System.out.println(lin5);
	    
	    while(!lin5.isEmpty()) {
	    	System.out.print(lin5.peek()+" ");
	    	lin5.poll();
	    }
	    System.out.println();
	    System.out.println(lin5);
	    
	    //Java LinkedList as Deque doing addFirst(), addLast(), getFirst() and getLast() operation.
	    LinkedList<Integer> lin6=new LinkedList<>(Arrays.asList(2,4,6,8,10));
	    System.out.println(lin6);
	    lin6.addFirst(100);
	    lin6.addLast(1000);
	    System.out.println(lin6);
	    
	    System.out.println(lin6.getFirst());
	    lin6.removeFirst();
	    System.out.println(lin6);
	    
	    System.out.println(lin6.getLast());
	    lin6.removeLast();
	    System.out.println(lin6);
	    
	    //copy of LinkedList 
	    LinkedList<Integer> lin7=new LinkedList<>(lin6);
	    System.out.println(lin7);
	    
	    //or
	    LinkedList<Integer> lin8=new LinkedList<>();
	    lin8.addAll(lin6);
	    System.out.println(lin8);
	    
	    //or
	    LinkedList<Integer> lin9=new LinkedList<>();
	    lin9.addAll(0,lin6);
	    System.out.println(lin9);
	    
	    //clean() methods 
	    lin9.clear();
	    System.out.println(lin9);
	    
	    //clone method
	    LinkedList<Integer> lin10=(LinkedList<Integer>)lin8.clone();
	    System.out.println(lin10);
	    
	    //contains method
	    System.out.println(lin10.contains(10));
	    
	    //contansAll method
	    System.out.println(lin10.containsAll(lin9));
	    
	    //or contansAll method
	    System.out.println(lin10.containsAll(Arrays.asList(2,4,10)));
	    
	    //element() method to use  retrieve the first element or head of the list. 
	    System.out.println(lin10.element());
	    
	    //indexOf() methods 
	    LinkedList<Integer> lin11=new LinkedList<>(Arrays.asList(2,6,7,2,5,10));
	    System.out.println(lin11);
	    System.out.println(lin11.indexOf(2));
	    
	    //lastIndexOf() methods
	    System.out.println(lin11.lastIndexOf(2));
	    
	    //pop() methods,This method is used to pop an element from the stack which is represented as a list.
	    //poll() method,This method is used to fetches and removes the first element of the list.
	    System.out.println(lin11);
	    lin11.pop();
	    System.out.println(lin11);
	    
	    //push() methods
	    lin11.push(1000);
	    System.out.println(lin11);
	    
	    //size() methods
	    System.out.println(lin11.size());
	    
	    //toArray() method
	    Object[] arr4=lin11.toArray();
	    System.out.println(arr4[0]);
	    
	    //to String
	    String str2=lin11.toString();
	    System.out.println(str2);
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		

	}

}
