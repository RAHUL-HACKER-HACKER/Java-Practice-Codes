package JavaTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        String str1=""+'0'+10;
        
        String str2="";
        str2+='0'+10;
        
        System.out.println(str1);
        System.out.println(str2);
        
        int a=Integer.parseInt("0049");
        System.out.println(a);
        
        String st="23.45.60.0009";
        ArrayList<String> al=new ArrayList<>();
        String value="";
        for(int i=0;i<st.length();i++) {
        	if(st.charAt(i)!='.') {
        		value+=st.charAt(i);
        	}else {
        		al.add(value);
        		value="";
        	}
        }
        al.add(value);
        System.out.println(al);
        System.out.println(Arrays.toString(st.split("\\.")));
        
    
    
    
    
    
    }
    
   
}
