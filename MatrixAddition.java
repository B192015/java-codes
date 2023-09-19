import java.util.*;
class MatrixAddition
{
   public static void main(String args[])
   {
     System.out.println("enter row and col");
     Scanner scan=new Scanner(System.in);
     int r=scan.nextInt();
     int c=scan.nextInt();
     int a[][]=new int[r][c];
     int b[][]=new int[r][c];
     System.out.println("enter matrix a");
     for(int i=0;i<r;i++)
     {
      for(int j=0;j<c;j++)
      {
        a[i][j]=scan.nextInt();
        
       }
       }
      System.out.println("enter matrix b");    
     for(int i=0;i<r;i++)
     {
      for(int j=0;j<c;j++)
      {
        b[i][j]=scan.nextInt();
        
       }
       }
            System.out.println("enter addition");
       int k[][]=new int[r][c];
       for(int i=0;i<r;i++)
     {
      for(int j=0;j<c;j++)
      {
        System.out.println(k[i][j]=a[i][j]+b[i][j]);
        
       }
       }
       }
       }
