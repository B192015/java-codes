import java.lang.Math;
class dice
{
public static void main(String args[])throws InterruptedException
{
int n=5,i;
int min=1;
int count=0;
for(i=0;i<n;i++)
{
System.out.println((i+1)+"th attempt values");
int d1=(int)(Math.random()*6)+min;
int d2=(int)(Math.random()*6)+min;
System.out.println("dice1="+d1);
System.out.println("dice2="+d2);
if(d1==d2)
count=count+1;
Thread.sleep(10000);
}
System.out.println("The succesfull attempts="+count);
}
}
