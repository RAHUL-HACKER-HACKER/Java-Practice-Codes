package EclipseJavaCodes;

import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main61
{
    
    public static void printMaxActivities(int s[], int f[], int n)
    {
    
    
      int sum=0;
      int result=1;
    
    for (int j = 1; j < n; j++)
    {
         
         if (s[j]>=sum)
         {
              System.out.print(result+" ");
              sum+=f[j]-s[j];
              
          }
         result+=1;
     }
   }
      
    
    public static void main(String[] args)
    {
    	
//    int s[] =  {1, 3, 0, 5, 8, 5};
//    int f[] =  {2, 4, 6, 7, 9, 9};
    	int s[]= {1,3,2,4,8,7,9,11,9,12};
    	int f[]= {3,4,5,7,9,10,11,12,13,14};
        int n = s.length;
        
        printMaxActivities(s, f, n);
    }
     
}
