import java.util.*;
class ls
{
public static void main(String args[])
{
int key,i;
int[] x=new int[5];
Scanner scan=new Scanner(System.in);
for(i=0;i<x.length;i++)
{
System.out.print("enter the" +(i+1)+ "number");
x[i]=scan.nextInt();
}
System.out.println("enter number to search");
key=scan.nextInt();
for(i=0;i<x.length;i++)
{
if(x[i]==key)
{
System.out.println("the elemnt is found at index"+i);
break;
}
}
if(i==x.length)
System.out.println("elemnt not found");
}
}
