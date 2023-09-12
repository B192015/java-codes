import java.util.*;
class larsma
{
 public static void main(String arg[])
 {
 int i,n,min=101,max=0;
 Random rand=new Random();
 for(i=0;i<5;i++)
 {
  n=rand.nextInt(100);
   System.out.println(""+n);
 if(n<min)
 min=n;
 if(n>max)
 max=n;
 }
 System.out.println("max number"+max);
  System.out.println("min number"+min);
  }
  }
