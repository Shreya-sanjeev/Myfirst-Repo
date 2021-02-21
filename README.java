import java.io.*;
public class Patterns
{
  public static void trinagle(int n)
  {
    int  i,j;
    for(i=0;i<n;i++)
    for(j=2*(n-1);j>=0;j--)
    {
        System.out.println(" ");
    }
    for(j=0;j<=i;j++)
    {
      System.out.println("*");
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    int n=5;
    triangle(n);
  }
}  
