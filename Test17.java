package JavaTests;

import java.util.*;

public class Test17 {
	public static void seperate(String str) {
		Stack<Character> alph=new Stack<>();
		Stack<Character> num=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if('0'<=c && c<='9') {
				num.push(c);
			}else {
				alph.push(c);
			}
		}
		System.out.println(alph);
		System.out.println(num);
		
	}
	//roman to decimal
	public static int romToDec(String str) {
		HashMap<Character,Integer> hm=new HashMap<>();
		hm.put('I',1);
		hm.put('V',5);
		hm.put('X',10);
		hm.put('L',50);
		hm.put('C',100);
		hm.put('D',500);
		hm.put('M',1000);
		int result=0;
		for(int i=0;i<str.length()-1;i++) {
			char current=str.charAt(i);
			char next=str.charAt(i+1);
			if(hm.get(current)>=hm.get(next)) {
				result+=hm.get(current);
			}else {
				result-=hm.get(current);
			}
		}
		result+=hm.get(str.charAt(str.length()-1));
		return result;
	}
	//integer to  roman 
	public static String intToRom(int n) {
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
		hm.put("M",1000);
		hm.put("CM",900);
		hm.put("D",500);
		hm.put("CD",400);
		hm.put("C",100);
		hm.put("XC",90);
		hm.put("L",50);
		hm.put("XL",40);
		hm.put("X",10);
		hm.put("IX",9);
		hm.put("V",5);
		hm.put("IV",4);
		hm.put("I",1);
		String result="";
		for(HashMap.Entry<String,Integer> entry:hm.entrySet()) {
			
			String key=entry.getKey();
			int value=entry.getValue();
			while(n>=value) {
				result+=key;
				n=n-value;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seperate("S1a2m3p4l5e6");
		
		System.out.println(romToDec("LXXXIV"));
		
		System.out.println(intToRom(84));
		
	}

}
