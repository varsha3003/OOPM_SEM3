import java.util.*;
class operation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y,sum,ch;
		char c;
		do
	{
		System.out.println("Enter 2 number:");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Menu:");
		System.out.println("1.add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch)
	{
		case 1:sum=x+y;
			System.out.println("The sum is "+sum);
			break;
		case 2:sum=x-y;
			System.out.println("The sunbtraction ans is "+sum);
			break;
		case 3:sum=x*y;
			System.out.println("The product is "+sum);
			break;
		case 4:sum=x/y;
			System.out.println("The division ans is "+sum);
			break;
	}
		System.out.println("Do you want to continue Y/N");
		c=sc.next().charAt(0);
		
		
	}while(c!='N');		
	}
} 