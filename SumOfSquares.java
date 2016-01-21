class SumOfSquares
{
public static void main (String[] args)
{
int i;
int sum=0;

for(i=1;i<=3;i++)
{
int cubes=i*i*i;
sum=sum+cubes;
}
System.out.println("sum of cubes is" +sum);
}
}