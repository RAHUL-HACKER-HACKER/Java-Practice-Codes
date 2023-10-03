package javaPrograms;
import java.util.*;
public class StackJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		System.out.println(st);
		
		//push()
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		System.out.println(st);
		
		//pop()
		st.pop();
		System.out.println(st);
		
		//peek()
		System.out.println(st.peek());
		
		//search() searching count from top
		System.out.println(st.search(100));
		
		//empty()
		System.out.println(st.empty());
		
		//isEmpty()
		System.out.println(st.isEmpty());
		
		//iterate
		while(!st.empty()) {
			System.out.print(st.peek()+" ");
			st.pop();
		}
		System.out.println();
		
//		or
//		while(!st.empty()) {
//			System.out.print(st.pop()+" ");
//			
//		}
//		System.out.println();
		

	}

}
