package JavaTests;
import java.util.*;
public class Test22 {

	public static void main(String[] args) throws Exception {
		String str=" 09:20:55 ";
		
		String last=str.replaceAll(" +$","");
		//String last=str.replaceAll("\\s+$","");
		System.out.println("="+last+"=");
		
		String first=str.replaceAll("^ +","");
		//String first=str.replaceAll("^\\s+","");
		System.out.println("="+first+"=");

		
		
		
		
		
		
		
        
        

	}

}
