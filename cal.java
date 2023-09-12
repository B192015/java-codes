import java.util.*;

class cal
{
     public static void main(String args[])
     {
         float a,b,c;
         int op;
         Scanner scan=new Scanner(System.in);
         System.out.println("enter a and b values");
         a=scan.nextFloat();
         b=scan.nextFloat();
         System.out.println("\n enter your choice \n 1-addition \n 2-substraction \n 3-multiplication \n 4-division ");
         op=scan.nextInt();
         switch(op)
         {
              case 1:
                c=a+b;
                System.out.print("addition is "+c);
                break;
             case 2:
                c=a-b;
                System.out.print("Subtraction is "+c);
                break;
             case 3:
                c=a*b;
                System.out.print("Multiplication is "+c);
                break;
             case 4:
                c=a/b;
                System.out.print("Division is "+c);
             default:
                System.out.println("enter valid choice");
          }
     }
}
