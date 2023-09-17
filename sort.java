import java.util.*;
class sort
{
public static void main(String args[])
{
int[] x=new int[5];
Scanner scan=new Scanner(System.in);
for(int i=0;i<x.length;i++)
{
System.out.print("enter the" +(i+1)+ "number");
x[i]=scan.nextInt();
}
for(int i=0;i<x.length;i++)
{
int max=x[i];
int ind=i;
for(int j=(i+1);j<x.length;j++)
{
if(max<x[j])
{
max=x[j];
ind=j;
}
}
x[ind]=x[i];
x[i]=max;
}
System.out.println("the descending order is");
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]+"");
}
}
}

