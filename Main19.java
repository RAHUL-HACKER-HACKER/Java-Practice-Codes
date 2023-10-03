package EclipseJavaCodes;

//Minimum number of apples to be collected from trees to guarantee M red apples

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.lang.String;
public class Main19{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int flag=0;
      char[] ch = new char[s.length()];
      for (int i = 0; i < s.length(); i++) {
          ch[i] = s.charAt(i);
      }
      for(int i=0;i<s.length();i++)
      {
          if(ch[i]=='2' || ch[i]=='3' || ch[i]=='4' || ch[i]=='5' || ch[i]=='7')
          {
              flag=1;
              break;
          }
      }
      if(flag==1)
      {
          System.out.println("Not strobogrammatic");
      }
      else
      {
          String p="";
          for(int i=0;i<s.length();i++)
          {
              if(ch[i]=='6')
              {ch[i]='9'; flag=2;}
              else if(ch[i]=='9')
              { ch[i]='6'; flag=2;}
          }
          for(int i=s.length()-1;i>=0;i--)
          {
              p=p+ch[i];
          }
          System.out.println(p);
          if(s.equals(p) && flag==2)
              System.out.println("Strobogrammatic");
          else if(flag==2)
              System.out.println("Not Strobogrammatic");
          else if(flag==0)
              System.out.println("Strobogrammatic");
      }
  }
}
