package EclipseJavaCodes;

import java.util.*;

//block swap algorithm

class Main28
{
    
    public static void leftRotate(int arr[], int d,int n)
    {
        leftRotateRec(arr, 0, d, n);
    }
 
    public static void leftRotateRec(int arr[], int i,int d, int n)
    
  
    {
        if(d == 0 || d == n)
            return;
         
        
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }
         
          
        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);    
        }
        else  
        {
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d);
        }
    }
 

public static void printArray(int arr[], int size)
{
    int i;
    for(i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
    System.out.println();
}
 

public static void swap(int arr[], int fi,int si, int d)
{
    int i, temp;
    for(i = 0; i < d; i++)
    {
        temp = arr[fi + i];
        arr[fi + i] = arr[si + i];
        arr[si + i] = temp;
    }
}
 

public static void main (String[] args)
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    leftRotate(arr, 3, 7);
    printArray(arr, 7); 
//    Scanner scr=new Scanner(System.in);
//    char c=scr.next().charAt(0);
//    System.out.println(c);
    int[] slicedArray = Arrays.copyOfRange(arr, 3, 7);   
    System.out.println("Slice of Array: "+Arrays.toString(slicedArray)); 
    System.out.println(slicedArray[0]);
}
}
 
