import java.util.*;
class sortname
{
public static void main(String args[])
{
int i,j,n;
Scanner scan=new Scanner(System.in);
System.out.println("enter range of strings entering");
n=scan.nextInt();
Scanner scan1=new Scanner(System.in);
String[] s=new String[n];
for(i=0;i<n;i++)
{
System.out.print("enter"+(i+1)+"string");
s[i]=scan1.nextLine();
}
for(i=0;i<n;i++)
{
String temp;
for(j=i+1;j<n;j++)
{
int flag=0,index=0;
while(flag!=1)
{
char ch_of_si=s[i].charAt(index);
char ch_of_sj=s[j].charAt(index);
if(ch_of_si>ch_of_sj)
{
temp=s[i];
s[i]=s[j];
s[j]=temp;
flag++;
}
else if(ch_of_si==ch_of_sj)
{
if((s[i].length()-1)>index && (s[j].length()-1)>index)
index++;
}
else
{
flag++;
}
}
}
}
for(i=0;i<n;i++)
{
System.out.println(s[i]+"");
}
}
}
