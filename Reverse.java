import java.util.*;
class Reverse
{
  public static void main(String args[])
  {
    System.out.println("enter the string");
    Scanner scan=new Scanner(System.in);
    String name=scan.next();
    String rev=" ";
    for(int i=name.length()-1;i>=0;i--)
    {
      rev=rev+name.charAt(i);
     }
     System.out.println("the reversed string is");
     System.out.println(rev);
     }
     }
