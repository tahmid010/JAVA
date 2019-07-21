import static java.lang.System.out;
class AnonymusObj
{
	public static void main(String args[])
	{
		new An().show();
		out.println(new An());//Anonymus object doesn't use any space in stack memory.
		new An().show();
		out.println(new An());//hashcode changes
	}
}

class An
{
	public void show()
	{
		out.println("Anonymus Object");
	}
}