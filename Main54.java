package EclipseJavaCodes;
import java.util.*;
//josephus problem
public class Main54 {
	static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		int n = 6;
        int k = 3;
        System.out.println("The chosen place is "+ josephus(n, k));

	}

}
