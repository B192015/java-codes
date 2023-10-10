import java.util.*;
class Count
{
 public static void main(String args[])
 {
   System.out.println("enter the string");
   Scanner scan=new Scanner(System.in);
   String str=scan.next(); 
   str=str.toLowerCase();
   int vcount=0,ccount=0;
   for(int i=0;i<str.length();i++)
   { 
     if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
     {
     vcount++;
     }
     else if(str.charAt(i) >='a'  &&  str.charAt(i) <='z')
     {
     ccount++;
     }
    }
     System.out.println("number of vowels"+vcount);
     System.out.println("number of consonants"+ccount);
 }
 }
     
   
