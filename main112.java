package EclipseJavaCodes;

import java.text.*;

import java.util.*;
public class main112 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 String[] arr = str.split(",");
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 Date date=formatter.parse(arr[1]);
		 Calendar cal = Calendar.getInstance();
	      cal.setTime(date);
	      int week = cal.get(Calendar.WEEK_OF_MONTH);
		 System.out.println("Maximum booking week:"+week);

	}

}
