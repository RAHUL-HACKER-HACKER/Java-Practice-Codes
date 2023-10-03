package EclipseJavaCodes;
//Maximumu sum of hourglass
public class Main33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] matrix=new int[3][3];
		int[][] matrix= {{1,2,4,5,6},{7,5,2,3,6},{0,0,0,0,0},{7,5,1,3,5},{0,0,0,0,0}};
		int count1=0;
		int count2=0;
		for(int i=3;i<=5;i++) {
			count1+=1;
		}
		for(int i=3;i<=5;i++) {
			count2+=1;
		}
		System.out.println("no of hourglass:"+count1*count2);
		

	}

}
