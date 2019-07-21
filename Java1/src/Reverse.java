import java.util.*;
import static java.lang.System.out;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,r,rev=0;
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		out.println(rev);
	}
}