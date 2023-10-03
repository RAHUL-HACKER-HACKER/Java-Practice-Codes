package EclipseJavaCodes;

public class Main49 {
	public static void powerset(String s,int i,String cur) {
		if(i==s.length()) {
//			System.out.println(cur);
			
		}
		powerset(s,i+1,cur+(s.charAt(i)));
		powerset(s,i+1,cur);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="abc";
		int i2=0;
		String cur2="";
		powerset(s2,0,cur2);

	}

}
