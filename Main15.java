package EclipseJavaCodes.AdvancedJava;
import java.io.*;
import java.util.*;

class Main15 {
	
	static ArrayList<String>
	letterCombinationsUtil(int[] number, int n,String[] table)
	{
		
		ArrayList<String> list = new ArrayList<>();

		Queue<String> q = new LinkedList<>();
		q.add("");

		while (!q.isEmpty()) {
			String s = q.remove();
			if (s.length() == n)
				list.add(s);
			else {
				String val = table[number[s.length()]];
				for (int i = 0; i < val.length(); i++)
				{
					q.add(s + val.charAt(i));
				}
			}
		}
		return list;
	}
	static void letterCombinations(int[] number, int n)
	{
		String[] table
			= { "", "", "abc", "def", "ghi",
				"jkl", "mno", "pqrs", "tuv", "wxyz" };

		ArrayList<String> list
			= letterCombinationsUtil(number, n, table);

		// Print the contents of the list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}


	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
		    String s=sc.next();
		    int numb = Integer.valueOf(s);
		    int i = 0;
		    int[] inputValue = new int[s.length()];
		    while (numb > 0) {
		      inputValue[s.length() - i - 1] = numb % 10;
		      numb /= 10;
		      i++;
		    }
		
		int n = inputValue.length;
		letterCombinations(inputValue, n);
	}
}


