class ShiftOperator
{
	public static void main(String[] args)
	{
		int i=25;//1 1 0 0 1.0 0
		int j=i << 2;//1 1 0 0 1 0 0.
		int k=i >> 2;//1 1 0.0 1 0 0
		System.out.println(j);
		System.out.println(k);
	}
}