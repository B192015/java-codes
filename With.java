import java.util.*;
class With
{
  public static void main(String args[])
  {
   System.out.println("enter the string");
   Scanner scan=new Scanner(System.in);
   String str=scan.next(); 
   System.out.println("enter prefix or suffix for string");
   String str1=scan.next(); 
   System.out.println(str.startsWith(str1));
   System.out.println(str.endsWith(str1));
   }
   }
