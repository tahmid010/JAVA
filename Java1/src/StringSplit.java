import java.util.*;

class StringSplit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine();
		String strarray[] = str.split(",");
		for(String s : strarray)
		{
			System.out.println(s);
		}
	}
}