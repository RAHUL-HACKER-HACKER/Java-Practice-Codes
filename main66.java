package EclipseJavaCodes;
import java.util.*;
public class main66{
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Details v[]=new Details[n];
		for(int i=0;i<n;i++) {
			v[i]=new Details();
			v[i].get();
		}
		for(int j=0;j<n;j++) {
			v[j].disp();
		}

	}

}
class Details{
	String name,add;
	int salary;
	public void get() {
		Scanner input=new Scanner(System.in);
	    name=input.nextLine();
		add=input.nextLine();
		salary=input.nextInt();
	}
	public void disp() {
		System.out.println(name);
		System.out.println(add);
		System.out.println(salary);
		
	}
}
