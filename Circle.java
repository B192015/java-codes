import java.util.*;
class Circle
{  
    int r;
   double area,perimeter;
   Circle(int r)
   {
    this.r=r;
   }
   public double getArea()
   {
   return area=2*3.14*r*r;
   }
   public double getPerimeter()
   {
    return perimeter=2*3.14*r;
   }
   }
class ci
{   
 public static void main(String args[])
{
Circle c1=new Circle(5);
Circle c2=new Circle(10);
Circle c3=new Circle(15);
System.out.println(c1.getArea());
System.out.println(c1.getPerimeter());
System.out.println(c2.getArea());
System.out.println(c2.getPerimeter());
System.out.println(c3.getArea());
System.out.println(c3.getPerimeter());
}
} 
