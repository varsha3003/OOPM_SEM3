import java.util.*;
class quadratic
{
	public static void main(String args[])
{
	float a,b,c,d,x1,x2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the co-efficent of a quadratic equation:");
	a=sc.nextFloat();
	b=sc.nextFloat();
	c=sc.nextFloat();
	d=(b*b)-(4*a*c);
	if(d>0)
{
	x1=(float)(-b+Math.sqrt(d))/(2*a);
	x2=(float)(-b-Math.sqrt(d))/(2*a);
	System.out.println("The roots are "+x1+" "+x2);
}
	else if(d==0)
{
	x1=(-b)/(2*a);
	System.out.println("The root is "+x1);
}
	else
	System.out.println("The roots are not real.");
	
}
}