package fileexample;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

public class FileClass {
	public static void main(String[] args)
	{
		File directory = new File("E:\\New folder");
		File[] files = directory.listFiles();
		Arrays.sort(files, new Comparator<File>() {
			public int compare(File f1,File f2)
			{
				return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
			}
		});
		
		
		
		
		
		
		
		
		
		/*FilenameFilter filter = new FilenameFilter()
				{
			public boolean accept(File dir ,String name)
			{
				return name.matches("access_log.*");
			}
				};
		File f = new File("E:\\New folder");
		
		File[] files = f.listFiles();
		
		Arrays.sort(files, new Comparator() {
			public int compare(Object o1,Object o2)
			{
				if(((File)o1).lastModified() > ((File)o2).lastModified())
				{
					return -1;
				}
				else if(((File)o1).lastModified() > ((File)o2).lastModified())
				{
					return +1;
				}
				else
				{
					return 0;
				}
			}
		});*/
	}
}
