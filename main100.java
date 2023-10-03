package EclipseJavaCodes;
import java.util.*;
public class main100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String[] day= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THUSDAY","FRIEDAY"};
		int index1=n1%7;
		int index2=(n1+n2)%7;
		if(index2==0) {
			System.out.println(day[index1]);
			System.out.println(index2+7);
			System.out.println(day[index2]);
			
		}else {
			System.out.println(day[index1]);
			System.out.println(index2);
			System.out.println(day[index2]);
		}

	}

}
