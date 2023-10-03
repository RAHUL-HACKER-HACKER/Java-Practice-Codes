package JavaTests;
import java.util.*;
public class Test8 {
	public static int abc(int n) {
		if(n==1) {
			return 0; 
		}
		if(n==2) {
			return 1;
		}
		int result=abc(n-1)+abc(n-2);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(abc(4));
		

	}

}
