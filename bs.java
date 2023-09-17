import java.util.*;
class bs
{
public static void b_s(int f,int l,int a[],int ele)
{
int mid=(f+l)/2;
while(f<=l)
{
if(ele<a[mid])
{
l=mid-1;
}
else if(a[mid]==ele)
{
System.out.println("element found at index"+mid);
break;
}
else
{
f=mid+1;
}
mid=(f+l)/2;
}
if(f>l)
System.out.println("elemnt not found");
}

public static void main(String args[])
{
int ele,i,l;
int[] x=new int[5];
Scanner scan=new Scanner(System.in);
for(i=0;i<x.length;i++)
{
System.out.print("enter the" +(i+1)+ "number");
x[i]=scan.nextInt();
}
System.out.println("enter number to search");
ele=scan.nextInt();
for(i=0;i<x.length;i++)
{
int min=x[i];
int ind=i;
for(int j=(i+1);j<x.length;j++)
{
if(x[i]<min)
{
min=x[j];
ind=j;
}
}
x[ind]=x[i];
x[i]=min;
}

//for(i=0;i<x.length;i++)

//System.out.println(x[i]+"");
//System.out.println("\n");
l=x.length-1;
b_s(0,l,x,ele);

}
}
