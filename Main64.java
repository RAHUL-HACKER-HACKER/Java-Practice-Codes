package EclipseJavaCodes;
 class Abc{}

public  class Main64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		int temp = 3;
		temp=temp*a+b;
		System.out.println(temp);
		if(3<24) {
			System.out.println("if part");
		}
		else {
			System.out.println("else part");
		}
		
		int i=1;
		int j=1;
		while(i<3) {
			
			do {
				System.out.println(j+",");
				j++;
			}
			while(j<4);
			i++;
			
		}
		String s1="Ram";
		String s2="Ram";
		String s3="Shyam";
		String s4="ABC";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		

	}

}
