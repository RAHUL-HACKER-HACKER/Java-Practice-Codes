package EclipseJavaCodes;
import java.util.*;
//Create a class NumberConversion with require method to convert
public class main81 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char from=sc.next().charAt(0);
		char to=sc.next().charAt(0);
		String value=sc.next();
		int num=0;
		
		if(from=='D') {
			num = Integer.parseInt(value, 10);	
		}else if(from=='B') {
			num = Integer.parseInt(value, 2);
		}else if(from=='O') {
			num = Integer.parseInt(value, 8);
		}else if(from=='H') {
			num = Integer.parseInt(value, 16);
		}
		NumberConverter obj=new NumberConverter();
		obj.converter(from, to, num);
	}
}
class NumberConverter{
	public void converter(char from,char to,int num) {
		String[] s=new String[4];
		char[] c= {'D','B','O','H'};
		String decimal=Integer.toString(num);
		String binary = Integer.toBinaryString(num);
		String octal = Integer.toOctalString(num);
		String hex=Integer.toHexString(num);
		s[0]=decimal;
		s[1]=binary;
		s[2]=octal;
		s[3]=hex;
		for(int i=0;i<4;i++) {
			if(to==c[i]) {
				System.out.println(s[i]);
				break;
			}
		}	
	}
}
