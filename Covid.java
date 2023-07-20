package EclipseJavaCodes;
import java.util.*;

public class Covid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter any string value:");
		String s1=scr.next();
		System.out.println("entered string value:"+s1);
		int n=s1.length();
		
		
		String s2="covid";
		int m=s2.length();
		
		
		int res1=n;
		
        for(int i=0;i<m;i++) {
        	int count1=0;
			
			for(int j=0;j<n;j++) {
				if(s2.charAt(i)==s1.charAt(j)) {
					count1+=1;
					
				}
					
			}
			
			
			if(count1<=res1) {
				res1=count1;
					
			}
				
		}
        if(res1==n) {
        	System.out.println("no of covid word:"+0);
        	
        }
        else if(res1>=0) {
        	System.out.println("number of covid words:"+res1);
        	
        }
        
	}

}
