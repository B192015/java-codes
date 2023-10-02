import java.util.*;
class static_example
{
static String university="RGUKT";
String student_name,student_id;
static_example(String name,String id)
{student_name=name;
student_id=id;
}
void get_details()
{
System.out.println("Name: "+student_name+"\tID: "+student_id+"\tUniversity:"+university);
}
static void change()
{
university="RGUKT-Basar";
}
public static void main(String args[])
{
int n;
Scanner scan=new Scanner(System.in);
System.out.println("enter the no of students");
n=scan.nextInt();
Scanner in=new Scanner(System.in);
static_example[] student=new static_example[n];
for(int i=0;i<n;i++)
{
System.out.println("enter the name of student"+(i+1));
String name=in.nextLine();
System.out.println("enter the ID of student"+(i+1));
String id=in.nextLine();
student[i]=new static_example(name,id);
}
for(int i=0;i<n;i++)
{
if(i==2)
{
System.out.println("Now the university name is changed using Static method");
static_example.change();
}
student[i].get_details();
}
}
}
