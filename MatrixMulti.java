import java.util.*;
class MatrixMulti
{
   public static void main(String args[])
   {
     System.out.println("enter row and col of matrix a");
     Scanner scan=new Scanner(System.in);
     int r1=scan.nextInt();
     int c1=scan.nextInt();
     int a[][]=new int[r1][c1];

     System.out.println("enter matrix a");
     for(int i=0;i<r1;i++)
     {
      for(int j=0;j<c1;j++)
      {
        a[i][j]=scan.nextInt();
        
       }
       }
     System.out.println("enter row and col of matrx b");
     int r2=scan.nextInt();
     int c2=scan.nextInt();
     int b[][]=new int[r2][c2];
      System.out.println("enter matrix b");    
     for(int i=0;i<r2;i++)
     {
      for(int j=0;j<c2;j++)
      {
        b[i][j]=scan.nextInt();
        
       }
       }
       if(r2==c1)
       {
       System.out.println("enter multiplication");
       int k[][]=new int[r1][c1];
       for(int i=0;i<r1;i++)
       {
         for(int j=0;j<c1;j++)
         {
          System.out.println(k[i][j]=a[i][j]*b[i][j]);
         }
       }
       }
       else
       {
       System.out.println("cannot multiply");
       }
       }
       }
