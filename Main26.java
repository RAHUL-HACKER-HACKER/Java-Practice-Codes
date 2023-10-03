package EclipseJavaCodes;
//swap two nibbles in byte
public class Main26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st=Integer.toBinaryString(100);
		int len=st.length();
		for(int i=1;i<=8-len;i++) {
			
			st=0+st;
			
		}
		
		String str=st.substring(4)+st.substring(0,4);
		System.out.println(st);
		System.out.println(str);
		

	}

}
