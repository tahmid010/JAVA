class Wrpper
{
	public static void main(String[] args)
	{
		int i = 5;
		
		Integer ii = Integer.valueOf(i); //Boxing
		Integer jj = i;//Auto Boxing
		System.out.println(jj);
		
		int j = ii.intValue(); //Unboxing
		int k = jj; //Auto Unboxing
		System.out.println(k);
		
		Integer m = 8;
		System.out.println(m);
	}
}