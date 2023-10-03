package EclipseJavaCodes;
//move hyphen to beginning
public class Main41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="apple--bat----cat";
		String str2="";
		
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++) {
			
			if(str.charAt(i)=='-') {
				count+=1;
			}
			else {
				str2+=str.charAt(i);
				
			}
		}
		for(int j=0;j<count;j++) {
			str2='-'+str2;
			
		}
		System.out.println(str2);

	}

}
