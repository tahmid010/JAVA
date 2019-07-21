class VarArg
{
	public static void main(String args[])
	{
		Objective obj = new Objective();
		obj.showdata(5,6,7,8);
	}
}

class Objective
{
	public void showdata(int ... a) //Variable Arguments
	{
		for(int i : a)
		{
			System.out.println(i);
		}
	}
}