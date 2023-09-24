import java.util.*;
class product
{
int product_id;
String product_name;
double product_price;
product(int id,String name,double price)
{
product_id=id;
product_name=name;
product_price=price;
}
void display()
{
System.out.println("product-id="+product_id);
System.out.println("product-name="+product_name);
System.out.println("product-price="+product_price);
}
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
product p1=new product(1,"tomato",99.90);
product p2=new product(2,"potato",20.20);
product p3=new product(3,"eggs",6.87);
product p4=new product(4,"cucumber",45.50);
product p5=new product(5,"brinjal",40.49);
System.out.println("product id\t\tproduct name\t\tproduct price");
System.out.println(p1.product_id+"\t\t\t"+p1.product_name+"\t\t\t\t"+p1.product_price);
System.out.println(p2.product_id+"\t\t\t"+p2.product_name+"\t\t\t\t"+p2.product_price);
System.out.println(p3.product_id+"\t\t\t"+p3.product_name+"\t\t\t\t"+p3.product_price);
System.out.println(p4.product_id+"\t\t\t"+p4.product_name+"\t\t\t"+p4.product_price);
System.out.println(p5.product_id+"\t\t\t"+p5.product_name+"\t\t\t\t"+p5.product_price);
int n,id,q;
double sum=0;
System.out.print("enter the number of items u want to buy");
n=input.nextInt();
for(int i=0;i<n;i++)
{
System.out.print("enter the id of product: ");
id=input.nextInt();
System.out.print("enter the quantity of product: ");
q=input.nextInt();
switch(id)
{
case 1:
sum=sum+(p1.product_price*q);
p1.display();
break;
case 2:
sum=sum+(p2.product_price*q);
p2.display();
break;
case 3:
sum=sum+(p3.product_price*q);
p3.display();
break;
case 4:
sum=sum+(p4.product_price*q);p4.display();
break;
case 5:
sum=sum+(p1.product_price*q);
p5.display();
break;
default:
System.out.println("Product doesnot found");
}
}
System.out.println("The cost of all products" +sum);
}
}
