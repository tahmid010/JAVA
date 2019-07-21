import static java.lang.System.out;
class OverRide
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}

class C
{
	private int x;
	{
		x=4;
	}
	public void show()
	{
		out.println("x : " + x);
	}
}

class B extends C
{
	private int y;
	{
		y=7;
	}
	public void show()
	{
		//super.show();/*if you want the show() in the super class called too.
					   //super.show() calls the superclass version of show().*/
		out.println("y : " + y);
	}
}