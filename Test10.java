package JavaTests;
import java.util.*;
public class Test10 {
	public boolean isUpper(char c) {
		if(c>='A' && c<='Z') {
			return true;
		}
		return false;
	}
    public ArrayList<String> subString(String s){
    	ArrayList<String> arr=new ArrayList<>();
    	String str="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(str.length()>0) {
				if(isUpper(c)) {
					arr.add(str);
					str="";
				}
			}
			if(isUpper(c)) {
				int u=c+('a'-'A');
				str+=(char)u;
			}else {
				int u=c-('a'-'A');
				str+=(char)u;
			}
		}
		if(str.length()>0) {
			arr.add(str);
		}
		return arr;
		
	}
	public static void main(String[] args) {
		Test10 o=new Test10();
		System.out.println(o.subString("HelloRahulKumar"));

	}

}
