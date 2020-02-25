import java.io.File;
import java.io.IOException;

public class FileOpr {
	public static void main(String[] args)
	{
		File file=new File("Hello.txt");
		
	 if(file.exists())
	 {
		 System.out.println("File exists");
		 System.out.println("Can read:"+file.canRead());
		 System.out.println("Can write:"+file.canWrite());
		 System.out.println("Modified"+file.lastModified());
		 System.out.println("Absolute Path"+file.getAbsolutePath());

	 }
	 else
	 {
		 System.out.println("File does not exist so creating.....");
		 try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		
		System.out.println("File is created");
	 }
	 }

}
