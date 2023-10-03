package EclipseJavaCodes;

class Recursion {
	
	public int factorial(int x) {
		if(x>0) {
			
			return x*factorial(x-1);
			
		}
		else {
			
			return 1;
			}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion obj=new Recursion();
		int f=obj.factorial(10);
		System.out.print("factorial="+f);

	}

}
