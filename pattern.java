import java.util.*;
class pattern
{
	public static void main(String args[])
{
	int i,j,k,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of lines");
	n=sc.nextInt();
	for(i=n;i>0;i--)
	{
		for(k=n-i;k>0;k--)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print((char)(j+64));
		}
		for(j=i-1;j>0;j--)
		{
			System.out.print((char)(j+64));
		}
		System.out.println();
	}
}
}