 package EclipseJavaCodes;
import java.util.*;
//quick sort(pivot & partition)

public class Main39
{
   
    public static int partition(int arr[], int start, int end)
    {
        int pivot = arr[end]; 
        int i = (start-1); 
        for (int j=start; j<end; j++)
        {
            
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
  
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
  
        return i;
    }
  
    public static void sort(int arr[], int start, int end)
    {
        if (start < end)
        {
            
            int pidx = partition(arr, start, end);
  
            sort(arr, start, pidx-1);
            sort(arr, pidx+1, end);
        }
    }
  
    public static void main(String args[])
    {
        int arr[] = {23, 7, 10, 9, 15, 5};
        int n = arr.length;
        
        System.out.println("before quick sorting");
        System.out.println(Arrays.toString(arr));
  
        sort(arr, 0, n-1);
  
        System.out.println("ofter quick sorting");
        System.out.println(Arrays.toString(arr));
    }
}