import java.io.File;
class FileExaple
{
	public static void main(String[] args) 
	{
		File f1=new File("F:/data.txt");
		System.out.println("Does File exist :"+f1.exists());
	}
}