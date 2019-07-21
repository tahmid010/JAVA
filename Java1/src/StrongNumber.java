import java.util.*;
import static java.lang.System.out;

class StrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int sum=0,r,m;
		m=n;
		while(m>0)
		{
			r=m%10;
			sum=sum+factorial(r); /* You can call a static method without it's class name ,
									if you call from another static method inside the same class. */
			m=m/10;
		}
		if(sum==n)
			out.print("The Given Number is a Strong NUmber");
		else
			out.print("The Given Number is not a Strong NUmber");
	}
	
	private static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
}