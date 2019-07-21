import java.util.Scanner;
import static java.lang.System.out;
class RhomBus
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=1;i<(2*n);i++)
		{
			if( i>=1 && i<n)
				out.print(" ");
			else
				out.print("*");
		}	
		out.println();
		for(int i=1;i<=(n-2);i++)
		{
			for(int j=1;j<(2*n);j++)
			{
				if(j==n-i || j==n-i+n-1)
					out.print("*");
				else
					out.print(" ");
			}
			out.println();
		}
		for(int k=1;k<=n;k++)
		{
			out.print("*");
		}
		sc.close();
	}
}