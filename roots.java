import java.util.*;
import static java.lang.Math.*;
class roots
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  double a,b,c,d,r1,r2,sqrtval;
  System.out.println("enter x square,x and c coefficients");
  a=scan.nextFloat();
  b=scan.nextFloat();
  c=scan.nextFloat();
  d=b*b-4*a*c;
  sqrtval=(double)Math.sqrt(d);
  if(d>0)
  {
  System.out.println("the roots are real and distinct");
  r1=-(double)((b)+sqrtval)/(2*a);
  r2=-(double)((b)-sqrtval)/(2*a);
  System.out.println("r1 is "+r1+" and r2 is "+r2+"");
  }
  else if(d==0)
  {
    System.out.println("the roots are real and equal");
  r1=(-b)/2*a;
    System.out.println("r1 is "+r1+" and r2 is "+r1+"");
    }
   else
   {
        System.out.println("the roots are complex and distinct");
        r1=(-b)/2*a;
          sqrtval=(double)Math.sqrt(d)/(2*a);
    System.out.println("r1 is "+r1+" +i "+sqrtval+" and r2 is "+r1+" -i "+sqrtval+"");
  }
  }
  }
  
