class PrimeNumbers
{
public static void main(String[] args){
System.out.println("hello");
int i,n=100,j,count=0;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(i%j==0)	
			{
			count++;
			}	
		}
		if(count==2)
		{
		System.out.println(i);
		}
	}
}
}
