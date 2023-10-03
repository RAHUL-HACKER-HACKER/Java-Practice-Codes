package EclipseJavaCodes;
//Josephus problem
public class Main55 {
	

	public static void main(String[] args) {
		int n = 5;
        int k = 3;
        int sum = 0;
   	 
        
        for(int i = 2; i <= n; i++)
        {
            sum = (sum + k) % i;
        }
        
        System.out.println("The safe place is "+(sum+1));
        
        //0+3=3 , 3%2=1, sum=1,
        

	}

}
