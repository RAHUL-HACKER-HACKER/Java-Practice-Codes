package JavaTests;
import java.util.*;
public class Test15 {
	public static int find_page(int first,int second,int last) {
		int[] arr=new int[last];
		arr[0]=first;
		arr[1]=second;
		
		for(int i=2;i<last;i++) {
			arr[i]=arr[i-2]+arr[i-1];
			
		} 
		return arr[last-1];
	}
	
	//count total cells
	public static int totalcells(String str) {
		String[] sarr=str.split("\\:");
		
		int col1=Integer.valueOf(sarr[0].charAt(0));
		int row1=Integer.valueOf(sarr[0].substring(1));
		
		int col2=Integer.valueOf(sarr[1].charAt(0));
		int row2=Integer.valueOf(sarr[1].substring(1));
		
		
		int result=(Math.abs(col1-col2)+1)*(Math.abs(row1-row2)+1);
		
		return result;
	}
	
	//reverse string 
	public static String rev(String str) {
		String sr="";
		int n=str.length();
		for(int i=n-1;i>=0;i--) {
			sr+=str.charAt(i);
		}
		
		char[] varr= {'a','A','e','E','i','I','o','O','u','U'};
		int count=0;
		char[] sarr=sr.toCharArray();
		for(int i=n-1;i>=0;i--) {
			for(char v:varr) {
				if(v==sarr[i]) {
					count%=9;
					count+=1;
					sarr[i]=(char)(count+'0');
					break;
					
				}
			}
			
		}
		String result="";
		for(char c:sarr) {
			result+=c;
		}
		return result;
	}
	
	//new reverse
	public static String newrev(String str) {
		char[] varr= {'a','A','e','E','i','I','o','O','u','U'};
		int count=1;
		String result="";
		for(int i=0;i<str.length();i++) {
			boolean flag=false;
			for(char c:varr) {
				if(c==str.charAt(i)) {
					flag=true;
					break;
					
				}
			}
			if(flag) {
				String tcount=""+count;
				result+=tcount.charAt(0);
				count++;
			}else {
				result+=str.charAt(i);
			}
		}
		String finalresult="";
		for(int i=result.length()-1;i>=0;i--) {
			finalresult+=result.charAt(i);
		}
		return finalresult;
	}
	
	//magic number
	public static int magic(int[] arr,int index) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			String str=String.valueOf(arr[i]);
			int size=str.length();
			if(size==3) {
				al.add(arr[i]);
			}
		}
		Collections.sort(al);
		return al.get(index);
		
		
	}
	
	//catagroies
	public static int catagory(String age,String comorbidity) {
		String[] arr=age.split("/");
		int year=2023-Integer.valueOf(arr[arr.length-1]);
		System.out.println(year);
		if(year>60 || comorbidity=="yes") {
			return 1;
		}
		else if(year>45) {
			return 2;
		}
		
		return 3;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10100111000100101011";
		if(str.length()%4!=0){
			System.out.println("invalide value");
			
		}else {
			for(int i=0;i<str.length();i+=4) {
				String substr=str.substring(i,i+4);
				System.out.println(Integer.valueOf(substr,2));
			}
		}
		
		
		System.out.println(find_page(1,2,5));
		
		Object num = 42;
        String str2 = "Hello";
        Double dbl = 3.14;
        char bool = 'A';

        System.out.println("Data type of num: " + num.getClass().getSimpleName());
        System.out.println("Data type of str: " + str2.getClass().getSimpleName());
        System.out.println("Data type of dbl: " + dbl.getClass().getSimpleName());
        System.out.println("Data type of bool: " + ((Object)bool).getClass().getSimpleName());
       
        //reverse
        System.out.println(rev("Language"));
        System.out.println(newrev("Language"));
       
        //magic number
        
        int[] arr= {550,67,45,820,717,3,90,636};
        int index=2;
        System.out.println(magic(arr,index-1));
        
        System.out.println(catagory("01/01/2001","no"));
        
        
        
	}

}
