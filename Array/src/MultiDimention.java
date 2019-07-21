class MultiDimention
{
	public static void  main(String args [])
	{
		int x[]= { 2,3,4,5};
		int y[]= { 3,4,2,5};
		int z[]= { 5,4,3,2};
		
		int p[][]= {
				{ 2,3,4,5},
				{ 3,4,2,5},
				{ 5,4,3,2}
				};
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		//Using Enhanced For Looping in Multi Dimentional Array
		for(int i[] : p)
		{
			for(int j : i)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}