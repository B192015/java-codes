import java.util.*;
class Index
{
 public static void main(String args[])
 {
   System.out.println("enter the string");
   Scanner scan=new Scanner(System.in);
   String name=scan.next(); 
   System.out.println("enter the alphabet");
   String alpha=scan.next(); 
   int count=0;
   int index=name.indexOf(alpha);
    while (index >= 0){
             index = name.indexOf(alpha, index+1);
             count++;          
             }
    System.out.printf("The characters "+alpha+" were found %d times", count);
    System.out.println();
}
}

      
