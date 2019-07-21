import java.util.*;
class UsingScanner
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Input an Integer : ");
		x=sc.nextInt();	
		sc.nextLine();
		System.out.println(x);
		String name;
		System.out.println("Input a String : ");
		name = sc.nextLine();
		System.out.println(name);
		double y;
		System.out.println("Input a Double : ");
		y=sc.nextDouble();
		System.out.println(y);
	}
}