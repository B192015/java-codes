class ma
{
public static void main(String args[])
{
int[][] x={{1,2,3},{3,4,5}};
int[][] y={{9,0,7},{1,4,3}};
System.out.println("matrix x");
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[0].length;j++)
{
System.out.print(x[i][j]+"\t");
}
System.out.print("\n");
}
System.out.println("matrix y");
for(int i=0;i<y.length;i++)
{
for(int j=0;j<y[0].length;j++)
{
System.out.print(y[i][j]+"\t");
}
System.out.print("\n");
}
System.out.println("matrix z=x+y");
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[0].length;j++)
{
System.out.print(x[i][j]+y[i][j]+"\t");
}
System.out.print("\n");
}
}
}
