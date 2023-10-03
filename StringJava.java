package javaPrograms;
import java.text.*;
import java.util.*;
public class StringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="aBcD";
		string=string.toUpperCase();
		System.out.println(string);
		string=string.toLowerCase();
		System.out.println(string);
		
		//any value to string
		String constr=String.valueOf(100);
		
		//another way "integer to string"
		String constr2=""+100;
		
		//string to integer
		int intvalue=Integer.valueOf(constr);
		
		//integer to char
		int ival=6;
		char intToChar=(char)('0'+ival);
		
		//another way integer to char
		String sval=""+ival;
		char intTochar2=sval.charAt(0);
		
		//another way integer to char
		char intTochar3=(""+ival).charAt(0);
		
		//reverse of string
		String rev="";
		for(int i=string.length()-1;i>=0;i--) {
			rev+=string.charAt(i);
			
		}
		//another way to reverse string
		String revstr = "Geeks";
        StringBuffer sbr = new StringBuffer(revstr);
        sbr.reverse();
		
		//copy string
		String cstring=new String(string);
		System.out.println(cstring);
		
		String str1="Rahul Kumar";
		String str2="Pankaj Kumar Yadav";
		System.out.println(str1);
		
		//length of string 
		System.out.println(str1.length());
		
		//equals
		System.out.println(str1.equals(str2));
		//equalsIgnoreCase()
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//compareTo()
		System.out.println(str1.compareTo(str2));
		
		//compareToIgnoreCase()
		System.out.println(str1.compareToIgnoreCase(str2));
		
		//charAt()
		System.out.println(str1.charAt(0));
		
		//substring()
		System.out.println(str1.substring(0,5));
		
		//toCharArray()
		String str3="hello Space";
		char[] arr1=str3.toCharArray();
		
		System.out.println(Arrays.toString(arr1));
		//or
		for(char c:arr1) {
			System.out.print(c+",");
		}
		System.out.println();
		
		//split(String regex) or split(String regex, int limit)
		String str4 = "a bc:de:fg h";
		String[] arr2=str4.split(":");
		for(String str:arr2) {
			System.out.println(str);
		}
		System.out.println(Arrays.toString(arr2));
		
		//split(String regex, int limit)
		//2 means two substring in array
		String[] arr3=str4.split(" ", 2);
		System.out.println(Arrays.toString(arr3));
		//or
		String[] arr4=str4.split("\\s",2);
		System.out.println(Arrays.toString(arr4));
		
		String vowels = "a+e+f";
		 // splitting the string at "+"
	    String[] result = vowels.split("\\+");
	    // converting array to string and printing it
	    System.out.println("result = " + Arrays.toString(result));
	    
	    //replace()
	    String str = "C++ Programming";

	    // all occurrences of "C++" is replaced with "Java"
	    System.out.println(str.replace("C++", "Java"));
	    
	    //replaceFirst()
	    System.out.println(str.replaceFirst("c", str));
	    
	    
	    //replaceAll() 
	    String str5 = "Java123is456fun";
	    String regex = "\\d+";//or "[0-9]+"
	    System.out.println(str5.replaceAll(regex, " "));
		
	    //important
	    double value1=125.0d;
	    double value2=8d;
		System.out.printf("value:%.5f",value1/value2);
		
		//more than two
		System.out.printf("value:%.5f\n%.5f",3.4,4.89);
		System.out.println();
		
		//more than two with space
		System.out.printf("value:%.5f %.5f",3.4,4.89);
		System.out.println();
		
		//format() another way
		String form=String.format("%.5f",value1/value2);
		System.out.println(form);
		
		
		
		System.out.printf("hello:%n%s", "Hithere!");
		System.out.println();
		System.out.printf("hello:%-7.5s", "Hithere!");
		System.out.println();
		System.out.printf("hello:%3.2s", "Hithere!");//make total 3 space and take 2 substring from start and print that 2 substring from 3-2
		System.out.println();
		
		//right justify
		System.out.printf("%10s","iamhacker");
		System.out.println();
		
		//right justify with zeros for integer value
		System.out.printf("%03d",2);
		System.out.println();
		
		//right justify with zeros for float value(before point two(5-3(point+right 2 value)) value and after point two value)
		System.out.printf("%05.2f",2.12345);
		System.out.println();
		
		//left justify
		System.out.printf("%-10s %10s","iamhacker","last");
		System.out.println();
		
		//special print array but not write
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		String print=arr.toString();
		System.out.println(print.substring(1,arr.size()));
		
		//used Z->time zone
		String isoDatePattern = "yyyy-MM-dd'T'HH:mm:ss Z";
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(isoDatePattern);
	    String dateString = simpleDateFormat.format(new Date());
	    System.out.println(" The Date in ISO Format : " + dateString);
	    
	    //used z->time zone
	    isoDatePattern = "yyyy-MM-dd'T'HH:mm:ss z";
	    simpleDateFormat = new SimpleDateFormat(isoDatePattern);
	    dateString = simpleDateFormat.format(new Date());
	    System.out.println(" The Date in ISO Format : " + dateString);
	    
	    //remove first and last space or use for loop
        String remstr=" 09:20:55 ";
		
		String last=remstr.replaceAll(" +$","");
		//String last=str.replaceAll("\\s+$","");
		System.out.println("="+last+"=");
		
		String first=remstr.replaceAll("^ +","");
		//String first=str.replaceAll("^\\s+","");
		System.out.println("="+first+"=");
		
        String input = "Hello World ";
        
        // Find the last space in the string
        int lastIndex = input.lastIndexOf(' ');

        if (lastIndex != -1) {
            // Remove the last space
            String result1 = input.substring(0, lastIndex) + input.substring(lastIndex + 1);
            System.out.println("Original String: " + input);
            System.out.println("String after removing the last space: " + result1);
        } else {
            // No space found in the string
            System.out.println("No space found in the string.");
        }
	    
	    
		
        
        

	}

}
