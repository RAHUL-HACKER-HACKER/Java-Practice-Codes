
package EclipseJavaCodes;
import java.util.*;
import java.lang.*;
//wrapper class
 class Base{
	public static int x;
	public  int y;
	Base(int x,int y)
	{
		
		
   	        this.x=x;
   	        this.y=y;
   	    
	}
}

public class Test{
	   String s="Welcome";
     public static void main(String[] args)
     {  
    	 Integer i=new Integer(100);
    	 Integer e=new Integer(100);
    	 System.out.println(i+e);
    	 //new line
    	 Base t1=new Base(100,200);
    	 Base t2=new Base(300,400);
    	 
    	 
    	 System.out.println(t1.x+","+t1.y);
    	 System.out.println(t2.x+","+t2.y);
    	 Test t=new Test();
    	 System.out.println(t.s);
    	 
    	     
         
     }
}
