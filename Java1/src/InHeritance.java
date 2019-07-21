import static java.lang.System.out;
class InHeritance
{
	public static void main(String args[])
	{
		AddSub obj=new AddSub();
		obj.num1=7;
		obj.num2=3;
		obj.sum();
		out.println(obj.result);
		obj.sub();
		out.println(obj.result);
	}
}

class Add
{
	int num1,num2,result;
	public void sum()
	{
		result=num1 + num2;
	}
}

class AddSub extends Add
{
	public void sub()
	{
		result=num1 - num2;
	}
}