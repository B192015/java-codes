class student
{
void student_study()
{
System.out.println("Every one study PUC for two years");
}
}
class cse extends student
{
void student_study()
{
super.student_study();
System.out.println("After PUC those who are interested in IT background will take CSE as betch option");
}
}
class super_keyword
{
public static void main(String args[])
{
student s1=new cse();
s1.student_study();
}
}
