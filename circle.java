import java.util.*;
class circle
{
public static void circleArea(int radius)
{
final double PI=3.14;
int r=radius;
double Area=PI*r;
System.out.println("Area is : "+Area);
}
public static void circlePerimeter(int radius)
{
final double PI=3.14;
int r=radius;
double Perimeter=2*PI*r;
System.out.println("Perimeter is: "+Perimeter);
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int radius;
System.out.println("enter the radius");
radius=scan.nextInt();
circleArea(radius);
circlePerimeter(radius);
}
}
