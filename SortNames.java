import java.util.*;
class SortNames
{
     public static void main(String args[])
     {
           Scanner scan=new Scanner(System.in);
                 System.out.println("enter size");
                 int n=scan.nextInt();
                 String[] a=new String[n];
                 int i,j;
                 String t;
                  System.out.println("enter names");
                 for(i=0;i<n;i++)
                 {
                 a[i]=scan.next();
                 
                 }
                 for(i=0;i<n;i++)
                 {
                 for(j=0;j<n-i-1;j++)
                 {
                 if(a[j].compareTo(a[j+1])>0)
                 {
                 t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
                 }
                 }
                 }
                 System.out.println("sorted list");
                                  for(i=0;i<n;i++)
                                  {
                                  System.out.println(a[i]);
                                  }
                                  }
                                  }
