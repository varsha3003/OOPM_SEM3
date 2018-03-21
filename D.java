import java.util.*;
class D
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		n=sc.nextInt();
		System.out.println("Enter the array elements");
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		min(a,n);
		max(a,n);
			

	}
	public static void min(int a[],int n)
	{
		int min,i;
		min=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]<min)
			min=a[i];
		}
		System.out.println("The smallest element is "+min);
	}
	public static void max(int a[],int n)
	{
		int max,i;
		max=a[0];
		for(i=0;i<n;i++)
		{
			if (a[i]>max)
			max=a[i];
		}
		System.out.println("The largest number is "+max);
	}
}