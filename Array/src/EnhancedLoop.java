class EnhancedLoop
{
	public static void main(String args[])
	{
		int a[] = { 2,4,5,8,1};
		//a = new int [5];
		/*a[0] = 2;
		a[1] = 4;
		a[2] = 5;
		a[3] = 8;
		a[4] = 1;*/
		for(int i: a)// enhanced for loop
		{
			System.out.println(i);
		}
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
	}
}