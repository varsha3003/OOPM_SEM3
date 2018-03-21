import java.util.*;
class series
{
	public static void main(String args[])
{
	int i,j,n,fact;
	float sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of terms");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		fact =1;
		for(j=1;j<=i;j++)
		{
			fact=fact*j;	
		}
		sum=sum+(float)(i)/fact;
	}
	System.out.println("The sum of the series is "+sum);
}
}