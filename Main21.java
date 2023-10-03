package EclipseJavaCodes;

// chinese Remainder Theorem

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.lang.String;
public class Main21{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of observations");
      int observations=sc.nextInt();
      int a[]=new int[observations];
      int m[]=new int[observations];
      System.out.println("Enter the observations");
      for(int i=0;i<observations;i++)
      {
          System.out.println("Enter a" + i+1 + " and m" + i+1 + " value");
          a[i]=sc.nextInt();
          m[i]=sc.nextInt();
      }
      int Mbig=1;
      for(int i=0;i<observations;i++)
      {
          Mbig=Mbig*m[i];
      }
      int M[]=new int[observations];
      for(int i=0;i<observations;i++)
      {
          M[i]=Mbig/m[i];
      }
      int Mdash[]=new int[observations];
      for(int i=0;i<observations;i++)
      {
          for(int j=1;j<m[i];j++)
          {
              if((M[i]*j)%m[i]==1)
              {
                  Mdash[i]=j;
                  break;
              }
          }
      }
      int sum=0;
      System.out.println("The final number is:");
      for(int i=0;i<observations;i++)
      {
          sum=sum+a[i]*M[i]*Mdash[i];
      }
      System.out.println(sum%Mbig);
  }
}