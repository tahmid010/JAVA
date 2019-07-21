import java.util.*;
class FiboNacci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=0 , b=1 , n , sum=0;
		n=sc.nextInt();
		System.out.print(a+" " + b + " ");
		for(int i=1;i<=n-2;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum + " ");
		}
		
	}
}
