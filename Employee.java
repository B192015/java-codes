import java.util.*;
class Employee
{
   int emp_id,emp_age,emp_sal;
   String emp_name,emp_gen,emp_design;
   void display_info()
   {
   System.out.println("the details of employee with given id=");
   System.out.println("name="+emp_name);
   System.out.println("age="+emp_age);
   System.out.println("id="+emp_id);
   System.out.println("designation="+emp_design);
   System.out.println("gender="+emp_gen);
   System.out.println("salary="+emp_sal);
   }
   public static void main(String args[])
   {
     Scanner input=new Scanner(System.in);
     int n,i;
     System.out.println("enter no.of employees");
     n=input.nextInt();
     Employee []e=new Employee[n];
     for(i=0;i<n;i++)
     {
     e[i]=new Employee();
     System.out.println("enter name of "+i+"th employee");
     e[i].emp_name=input.next();
     System.out.println("enter age of "+i+"th employee");
     e[i].emp_age=input.nextInt();
     System.out.println("enter id of "+i+"th employee");
     e[i].emp_id=input.nextInt();
     System.out.println("enter designation of "+i+"th employee");
     e[i].emp_design=input.next();
     System.out.println("enter gender of "+i+"th employee");
     e[i].emp_gen=input.next();
     System.out.println("enter salary of "+i+"th employee");
     e[i].emp_sal=input.nextInt();
     }
     int k;
     System.out.println("enter employee id to find details");
     k=input.nextInt();
     for(i=0;i<n;i++)
     {
     if(e[i].emp_id==k)
     {
     e[i].display_info();
     break;
     }
     }
     }
     }
     
     
       
     
