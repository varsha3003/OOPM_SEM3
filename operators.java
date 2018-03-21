import java.util.*;
class operators
{
	public static void main(String agrs[])
{
	int a=10,b=10,e=15,min;
	boolean c=true,d=false;
	System.out.println("1."+(a++ + ++a));
		System.out.println("2."+(b-- + b--));
		System.out.println("3."+~a);
		System.out.println("4."+~b);
		System.out.println("5."+!c);
		System.out.println("6."+!d);
		System.out.println("7."+(10*10/5+3-1*4/2));
		a=-3;
		System.out.println("8."+(a<<2));
		System.out.println("9."+(a>>>2));
		System.out.println("10."+(a<b && a<e));
	System.out.println("11."+(a & b));
	System.out.println("12."+((a>b)||(a>e)));
	System.out.println("13."+(a|b));
	min=(a<b)?a:b;
		System.out.println(min);
}
}