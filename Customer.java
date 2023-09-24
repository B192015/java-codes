import java.util.*;
class customer
{
String customer_name;
String customer_add;
int customer_id;
customer(String a,String b,int c)
{
customer_name=a;
customer_add=b;
customer_id=c;
}
}
class book
{
int book_count;
String book_name;
String book_author;
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int n,i,j;
System.out.print("enter the number of books:-");
n=input.nextInt();
book [] b=new book[n];
for(i=0;i<n;i++)
{
b[i]=new book();
System.out.print("enter the name of a book:-");
b[i].book_name=input.next();
System.out.print("enter the author of a book:-");
b[i].book_author=input.next();System.out.print("enter the count of a book:-");
b[i].book_count=input.nextInt();
}
customer[] c=new customer[5];
c[0]=new customer("girisha","ktdm",1);
c[1]=new customer("phani","kmm",2);
c[2]=new customer("srija","mhbd",3);
c[3]=new customer("krishna","nirml",4);
c[4]=new customer("pravallika","kdd",5);
String cu_name;
System.out.println("Enter the name of customer(girisha or phani or rija or krishna or pravallika):-");
cu_name=input.next();
for(i=0;i<5;i++)
{
if((c[i].customer_name).compareToIgnoreCase(cu_name)==0)
{
System.out.println(cu_name+" is registered in book stall");
String bookname;
System.out.println("enter the name of book");
bookname=input.next();
for(j=0;j<5;j++)
{
if((b[j].book_name).compareToIgnoreCase(bookname)==0)
{
System.out.println(bookname+" is found in bookstall");
System.out.print("enter the no books needed by customer:-");
int count=input.nextInt();
if(b[j].book_count>=count)
{
b[j].book_count=b[j].book_count-count;
}
else
System.out.println(count+"copies of "+bookname+"are not avaliable");
System.out.println(cu_name+"bought"+count+"copies of "+bookname);
System.out.println("Remaining"+b[j].book_count+"books are avalaible");
break;
}
}
if(j==5)
{
System.out.println("Book not found in stall");
break;
}
}
}
if(i==4)
System.out.println("Customer not registered in stall");
}
}
