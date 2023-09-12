import java.util.*;
class palindrome
{
 public static void main(String arrg[])
 {

   int a,temp,sum=0;
   Scanner scan=new Scanner(System.in);
      System.out.println("enter the number");
   a=scan.nextInt();

   temp=a;
   while(a!=0)
   {
   sum=sum*10+(a%10);
   a=a/10;
   }
   if(temp==sum)
   System.out.println("the number is palindrome");
   else
      System.out.println("the number is not palindrome");
      }
      }
   
