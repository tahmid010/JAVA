class CountObject
{
	public static void main(String args[])
	{
	    A obj = new A();
	    A obj1 = new A();
	    A obj2 = new A();
	    int x=A.show();
	    System.out.println(x);
	}	
}
class A
{
    static int i;
	public A()
	{
		i++;
	}
	public static int show()
	{
		return i;
	}
}