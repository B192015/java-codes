import java.util.*;
class prime
{
    public static void main(String args[])
    {
    int i,j;
    float a;
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the number");
     a=scan.nextFloat();
     if(a%2==0)
     {
     System.out.println("2");
     }

     for(i=0;i<a;i++)
     {
      if(a%i==0)
      {
     for(j=3;j<i;j++)
     {
     if(i%j==0)
     break;
     }
     if(j==i &j!=4)
     System.out.println(""+i);
     }
     }
     }
     }
     
 
