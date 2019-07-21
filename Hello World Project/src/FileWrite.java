import java.io.*;
class FileWrite
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout;
		fout=new FileOutputStream("F:\\eclipse-workspace\\New folder\\data.txt");
		byte a=5;
		fout.write(a);
		fout.close();
	}
}