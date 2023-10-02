import java.util.*;
class Bank_Account
{
double balance=10;
Bank_Account(String name,int num,double bal,String addr )
{
String Acct_name=name;
int Acct_no=num;
balance=bal;
String Acct_Address=addr;
}
void credit(double amount)
{
balance=balance+amount;
System.out.println("Done with Crediting");
}
void debit(double amount)
{
if(balance>=amount)
{
balance=balance-amount;
System.out.println("The amount "+amount+" is debited from your account");
}
else
{
System.out.println("Debit Amount Exceeded");
System.out.println("Total Amount: "+balance);}
}
void display()
{
System.out.println("The total amount in the account is "+balance);
}
public static void main(String args[])
{
Bank_Account s1=new Bank_Account("Srija",2157,2000.00,"mhbd");
Scanner scan=new Scanner(System.in);
int op=0,amount;
while(op!=4)
{
System.out.print("1.Debit 2.Credit 3.Display balance 4.Exit\nEnter your option: ");
op=scan.nextInt();
switch(op)
{
case 1:
System.out.println("enter the amount to debit: ");
amount=scan.nextInt();
s1.debit(amount);
break;
case 2:
System.out.println("enter the amount to credit: ");
amount=scan.nextInt();
s1.credit(amount);
break;
case 3:
s1.display();
break;
case 4:
break;
default:
System.out.println("Please enter the correct option");
break;
}
}
}
}

