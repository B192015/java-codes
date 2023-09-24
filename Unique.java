import java.lang.Math;
class Unique
{
 public static void main(String args[])
 {
     int i,j,n=5;
     int[] a=new int[5];
     for(i=0;i<n;i++)
     {
       a[i]=(int)(Math.random()*90)+10;
       System.out.println((i+1)+"random value is"+a[i]);
       System.out.print(a[i]);
        for(j=0;j<=i;j++)
        {
          System.out.print("\n");
          if(a[i]==a[j])
          continue;
          else
          System.out.print(a[j]+"");
          }
          }
          }
          }       
