package JavaTests;
import java.util.*;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] rep = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            rep[i] = sc.nextInt();
        }

         Arrays.sort(rep);
         for(int i = 0; i < rep.length / 2; i++) {
             int j = rep[i];
             rep[i] =rep[rep.length - i - 1];
             rep[rep.length - i - 1] = j;
         }
        for(int i=0;i<m;i++) {
        	for (int j = 0; j < n; j++) {
                if(rep[i]>arr[j]) {
                	arr[j]=rep[i];
                	break;
                }
            }
        }

        System.out.println("Modified array arr:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
