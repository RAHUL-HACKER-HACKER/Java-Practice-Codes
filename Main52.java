package EclipseJavaCodes;

public class Main52 {
	
   
	
	 
	public static void func(int x,int y) {
		System.out.println(x+" "+y);
		x=x+y;
		y=x-y ;
		x=x-y ;
		System.out.println(y+" "+x);

	}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
//		int a = -8; 
//		int b = 1; 
//		System.out.println(a << b); 
//		System.out.println(a >> b); 
//		System.out.println(a >>> b); 
		
		int i=100;
		System.out.println(i);
		++i;
		System.out.println(i);
		func(10,20);
		int a = 17;
		 System.out.print(++a * 7 + (a));
		 float f = (float)123456789.0;
		 System.out.println();
		 System.out.println(f);
		 double d = 123456789101112131415.1;
		 System.out.println();
		 System.out.println(d);
		float f1=100;
		double d2=f1;
		 System.out.println(d2);
//		 char c='\u0041';
		 char c='\41';
		 System.out.println(c);
//		 System.out.println("abc\tdef");
		 System.out.println("abcdef");
		 System.out.print('a');
		 System.out.println('\b');
		 
		 int b=100;
		 System.out.print(b * 2 + b++);
		 
		 String s1 = "Java 65  Web";
			String s2 = "Java \65  Web";
			String s3 = "Java \065  Web";
			String s4 = "Java \101  Web";
			String s5 = "Java \u0041  Web";
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);

		
		
		
		
		
		
		
		
		
	}

}
