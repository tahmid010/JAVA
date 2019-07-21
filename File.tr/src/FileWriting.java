import java.io.*;

public class FileWriting {
	public static void main(String[] args) throws Exception
	{
		File f = new File("demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("1,2,3,4,5,6");
		
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		String inputs[] = str.split(",");
		
		for(String val : inputs)
		{
			int x = Integer.valueOf(val)*2;
			System.out.println(x);
		}
	}
}
