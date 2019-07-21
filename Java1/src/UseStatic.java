class UseStatic
{
	public static void main(String args[])
	{
		meth(42);
	}
	
	static int a = 3;
	static int b;
	
	public static void meth(int x)
	{
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
    static 
	{
		System.out.println("Static block initialised.");
		b = a * 4;
	}
}