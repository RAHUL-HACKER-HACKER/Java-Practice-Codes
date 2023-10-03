package EclipseJavaCodes;
import java.util.*;
//Natural sort
//Comparator naturalOrder() method in Java
public class Main40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "Bas", "Csdf", "Asfdds" };
		Arrays.sort(s, Comparator.naturalOrder());
		System.out.println(Arrays.toString(s)); 
		

	}

}
